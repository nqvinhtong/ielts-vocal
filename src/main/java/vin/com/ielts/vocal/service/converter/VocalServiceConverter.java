package vin.com.ielts.vocal.service.converter;

import org.springframework.beans.BeanUtils;
import vin.com.ielts.vocal.repository.VocalEntity;
import vin.com.ielts.vocal.service.dto.VocalDTO;

import java.util.ArrayList;
import java.util.List;

public class VocalServiceConverter {

    public static VocalEntity buildVocalEntity(VocalDTO dto) {
        VocalEntity entity = new VocalEntity();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    public static VocalDTO buildVocalDTO(VocalEntity entity) {
        VocalDTO dto = new VocalDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    public static List<VocalDTO> buildVocalDTOs(List<VocalEntity> entities) {
        List<VocalDTO> dtos = new ArrayList<VocalDTO>();
        for (VocalEntity entity:entities) {
            dtos.add(buildVocalDTO(entity));
        }
        return dtos;
    }

    public static List<VocalEntity> buildVocalEntities(List<VocalDTO> dtos) {
        List<VocalEntity> entities = new ArrayList<VocalEntity>();
        for (VocalDTO dto:dtos) {
            entities.add(buildVocalEntity(dto));
        }
        return entities;
    }
}
