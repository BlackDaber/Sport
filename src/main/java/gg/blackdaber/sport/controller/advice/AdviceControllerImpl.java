package gg.blackdaber.sport.controller.advice;

import gg.blackdaber.sport.anotation.SportApiMapping;
import gg.blackdaber.sport.data.advice.AdviceDto;
import gg.blackdaber.sport.service.advice.AdviceService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@SportApiMapping("/advice")
@RestController
public class AdviceControllerImpl implements AdviceController {

    AdviceService adviceService;

    @GetMapping("/all")
    public Collection<AdviceDto> getAll() {
        return adviceService.getAll();
    }

    @GetMapping("/{id}")
    public AdviceDto getById(@PathVariable Long id) {
        return adviceService.getById(id);
    }

    @PostMapping("/create")
    public String create(@RequestBody AdviceDto dto) {
        // TODO: добавить проверку на правильность ввода телеграмма

        this.adviceService.create(dto);
        return dto.toString();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return this.adviceService.delete(id);
    }
}
