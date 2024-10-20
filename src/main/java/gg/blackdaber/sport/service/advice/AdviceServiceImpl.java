package gg.blackdaber.sport.service.advice;

import gg.blackdaber.sport.data.advice.AdviceDto;
import gg.blackdaber.sport.entity.advice.AdviceEntity;
import gg.blackdaber.sport.repository.advice.AdviceRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@Service
public class AdviceServiceImpl implements AdviceService {

    private final AdviceRepository adviceRepository;

    @Override
    public void create(AdviceDto dto) {
        this.adviceRepository.save(
                AdviceEntity.builder()
                        .name(dto.getName())
                        .telegram(dto.getTelegram())
                        .build()
        );
    }
}
