package gg.blackdaber.sport.entity;

import gg.blackdaber.sport.data.training.TrainingType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "sp_training")
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TrainingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String description;
    private TrainingType type;
    private String time;

    @ToString.Exclude
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private ProgramEntity programEntity;
}