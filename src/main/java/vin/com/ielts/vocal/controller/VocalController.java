package vin.com.ielts.vocal.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vin.com.ielts.vocal.controller.converter.VocalControllerConverter;
import vin.com.ielts.vocal.controller.model.VocalModel;
import vin.com.ielts.vocal.controller.model.ModelFactory;
import vin.com.ielts.vocal.repository.VocalEntity;
import vin.com.ielts.vocal.service.VocalService;
import vin.com.ielts.vocal.service.dto.VocalDTO;

import java.util.List;

@RestController
//@RequestMapping(value = "/v${api.version}")
public class VocalController {

    private static Logger logger = LogManager.getLogger(VocalController.class);

    @Autowired
    private VocalService vocalService;

    @Autowired
    private ModelFactory modleFactory;

    @RequestMapping(value = "/searchs/vocals", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity searchVocal() {
        logger.info("========== Start search vocal ==========");
        ResponseEntity responseEntity = null;
        List<VocalEntity> vocalEntityList = vocalService.searchVocal(null);
        responseEntity = modleFactory.success(vocalEntityList, List.class);
        logger.info("========== End search vocal ==========");
        return responseEntity;
    }

    @RequestMapping(value = "/vocals/{vocal_id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity getVocal(@PathVariable(value = "vocal_id") Long vocalId) {
        logger.info("========== Start get vocal ==========");
        ResponseEntity responseEntity = null;
        VocalEntity vocalEntity = vocalService.findVocalByVocalId(vocalId);
        responseEntity = modleFactory.success(vocalEntity, VocalEntity.class);
        logger.info("========== End get vocal ==========");
        return responseEntity;
    }

    @RequestMapping(value = "/vocals", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<VocalModel> createVocal(@RequestBody VocalModel request) {
        logger.info("========== Start create vocal ==========");
        ResponseEntity responseEntity = null;
        VocalDTO dto = VocalControllerConverter.buildVocalDTO(request);
        VocalDTO newDto = vocalService.createVocal(dto);
        VocalModel response = VocalControllerConverter.buildVocalResponse(newDto);
        responseEntity = modleFactory.success(response, VocalModel.class);
        logger.info("========== End create vocal ==========");
        return responseEntity;
    }

}
