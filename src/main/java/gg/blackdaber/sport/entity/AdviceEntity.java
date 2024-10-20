package gg.blackdaber.sport.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "sp_advice")
@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AdviceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String telegram;
    private String name;
}
