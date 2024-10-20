package gg.blackdaber.sport.controller.advice;

import gg.blackdaber.sport.anotation.SportApiMapping;
import gg.blackdaber.sport.data.advice.AdviceDto;
import gg.blackdaber.sport.service.advice.AdviceService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@SportApiMapping("/advice")
@RestController
public class AdviceControllerImpl implements AdviceController {

    AdviceService adviceService;

    @PostMapping("/create")
    public String create(@RequestBody AdviceDto dto) {
        // TODO: добавить проверку на правильность ввода телеграмма
        
        this.adviceService.create(dto);
        return dto.toString();
    }
}
