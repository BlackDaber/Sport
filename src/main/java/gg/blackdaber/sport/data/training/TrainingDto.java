package gg.blackdaber.sport.data.training;

import lombok.Data;

@Data
public class TrainingDto {
    private final String name;
    private final String description;
    private final TrainingType type;
    private final String time;
}