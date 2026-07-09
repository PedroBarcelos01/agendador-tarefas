package com.pedromiguel.agendadortarefas.business.mapper;

import com.pedromiguel.agendadortarefas.business.dto.TarefasDTO;
import com.pedromiguel.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface TarefasConverter {
    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);


}
