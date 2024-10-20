package gg.blackdaber.sport.service.advice;

import gg.blackdaber.sport.data.advice.AdviceDto;

import java.util.Collection;

public interface AdviceService {

    Collection<AdviceDto> getAll();

    AdviceDto getById(Long id);

    void create(AdviceDto dto);

    String delete(Long id);
}
