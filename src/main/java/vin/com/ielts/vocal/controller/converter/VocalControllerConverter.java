package vin.com.ielts.vocal.controller.converter;

import org.springframework.beans.BeanUtils;
import vin.com.ielts.vocal.controller.model.VocalModel;
import vin.com.ielts.vocal.repository.VocalEntity;
import vin.com.ielts.vocal.service.dto.VocalDTO;

import java.util.ArrayList;
import java.util.List;

public class VocalControllerConverter {

    public static VocalModel buildVocalResponse(VocalDTO dto) {
        VocalModel model = new VocalModel();
        BeanUtils.copyProperties(dto,model);
        return model;
    }

    public static VocalDTO buildVocalDTO(VocalModel model) {
        VocalDTO dto = new VocalDTO();
        BeanUtils.copyProperties(model, dto);
        return dto;
    }

    public static List<VocalModel> buildVocalsResponse(List<VocalDTO> dtos) {
        List<VocalModel> models = new ArrayList<VocalModel>();
        for (VocalDTO dto:dtos) {
            models.add(buildVocalResponse(dto));
        }
        return models;
    }
}
