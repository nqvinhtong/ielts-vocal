package vin.com.ielts.vocal.controller.converter;

import org.springframework.beans.BeanUtils;
import vin.com.ielts.vocal.controller.model.VocalModel;
import vin.com.ielts.vocal.service.dto.VocalDTO;

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
}
