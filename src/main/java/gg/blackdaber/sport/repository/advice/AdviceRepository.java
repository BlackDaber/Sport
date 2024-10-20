package gg.blackdaber.sport.repository.advice;

import gg.blackdaber.sport.entity.AdviceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdviceRepository extends JpaRepository<AdviceEntity, Long> {
}