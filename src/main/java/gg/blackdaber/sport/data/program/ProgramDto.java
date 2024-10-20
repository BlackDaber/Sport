package gg.blackdaber.sport.data.program;

import gg.blackdaber.sport.data.training.TrainingDto;
import lombok.Data;

import java.util.List;

@Data
public class ProgramDto {
    private final String name;
    private final String description;
    private final List<TrainingDto> trainingDtoList;
    private final ProgramType type;
}
