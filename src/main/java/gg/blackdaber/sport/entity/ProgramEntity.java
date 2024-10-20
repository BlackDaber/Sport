package gg.blackdaber.sport.entity;

import gg.blackdaber.sport.data.program.ProgramType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collection;

@Entity
@Table(name = "sp_program")
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProgramEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String description;
    private ProgramType type;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "programEntity")
    private Collection<TrainingEntity> trainingEntityList;
}
