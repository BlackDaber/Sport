package gg.blackdaber.sport.controller.training;

import gg.blackdaber.sport.anotation.SportApiMapping;
import org.springframework.web.bind.annotation.*;

@SportApiMapping("/training")
@RestController
public class TrainingControllerImpl implements TrainingController {

    @GetMapping("/all")
    public String getAll() {
        return "getAll";
    }

    @GetMapping("/{id}")
    public String getById() {
        return "getById";
    }

    @PostMapping("/create")
    public String create() {
        return "create";
    }

    @PutMapping("/edit")
    public String edit() {
        return "edit";
    }

    @DeleteMapping("/delete")
    public String delete() {
        return "delete";
    }
}
