package vin.com.ielts.vocal.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vin.com.ielts.vocal.repository.VocalEntity;
import vin.com.ielts.vocal.repository.VocalRepository;
import vin.com.ielts.vocal.service.converter.VocalServiceConverter;
import vin.com.ielts.vocal.service.dto.VocalDTO;

import java.util.List;

@Service
public class VocalService {
    private static Logger logger = LogManager.getLogger(VocalService.class);

    @Autowired
    private VocalRepository vocalRepository;

    public VocalEntity findVocalByVocalId(Long vocalId){
        logger.info("Finding Vocabulary by vocal id [{}]", vocalId);
        VocalEntity vocalEntity = vocalRepository.findOne(vocalId);
        return vocalEntity;
    }

    public List<VocalEntity> searchVocal(String vocalName) {
        logger.info("Searching ticket in database");
        List<VocalEntity> ticketEntityList = vocalRepository.findAll();
        logger.info("Found [{}] tickets", ticketEntityList.size());
        return ticketEntityList;
    }

    public VocalDTO createVocal(VocalDTO dto) {
        VocalEntity entity = VocalServiceConverter.buildVocalEntity(dto);
        logger.info("creating a new vocabulary");
        VocalEntity newEntity = vocalRepository.save(entity);
        logger.info("created successfully " + newEntity.getVocalId());

        VocalDTO newDTO = VocalServiceConverter.buildVocalDTO(newEntity);
        return newDTO;
    }


}
