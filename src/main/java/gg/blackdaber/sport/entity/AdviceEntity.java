package gg.blackdaber.sport.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "sp_advice")
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
