package gg.blackdaber.sport.service.advice;

import gg.blackdaber.sport.data.advice.AdviceDto;
import gg.blackdaber.sport.entity.AdviceEntity;
import gg.blackdaber.sport.repository.advice.AdviceRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.Collection;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@Service
public class AdviceServiceImpl implements AdviceService {

    private final AdviceRepository adviceRepository;

    @Override
    public Collection<AdviceDto> getAll() {
        return this.adviceRepository.findAll()
                .stream()
                .map(entity -> new AdviceDto(entity.getTelegram(), entity.getName()))
                .toList();
    }

    @Override
    public AdviceDto getById(Long id) {
        return this.adviceRepository.findById(id)
                .stream()
                .map(entity -> new AdviceDto(entity.getTelegram(), entity.getName()))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("Записи с таким айди %s не найдено".formatted(id)));
    }

    @Override
    public void create(AdviceDto dto) {
        this.adviceRepository.save(
                AdviceEntity.builder()
                        .name(dto.name())
                        .telegram(dto.telegram())
                        .build()
        );
    }

    @Override
    public String delete(Long id) {
        this.adviceRepository.deleteById(id);
        return "Запись успешно удалена";
    }
}
