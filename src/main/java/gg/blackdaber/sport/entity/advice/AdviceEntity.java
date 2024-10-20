package gg.blackdaber.sport.entity.advice;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "advice")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdviceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "telegram")
    private String telegram;
    @Column(name = "name")
    private String name;
}
