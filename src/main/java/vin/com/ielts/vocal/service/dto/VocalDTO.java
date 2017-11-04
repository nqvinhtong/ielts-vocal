package vin.com.ielts.vocal.service.dto;

import java.io.Serializable;
import java.sql.Blob;

public class VocalDTO implements Serializable{

    private Long vocalId;

    private String vocalName;

    private String eDescription;

    private String vDescription;

    private String pronounciation;

    private Blob image;

    private Blob sound;

    private String imageUrl;

    private String soundUrl;

    public Long getVocalId() {
        return vocalId;
    }

    public void setVocalId(Long vocalId) {
        this.vocalId = vocalId;
    }

    public String getVocalName() {
        return vocalName;
    }

    public void setVocalName(String vocalName) {
        this.vocalName = vocalName;
    }

    public String geteDescription() {
        return eDescription;
    }

    public void seteDescription(String eDescription) {
        this.eDescription = eDescription;
    }

    public String getvDescription() {
        return vDescription;
    }

    public void setvDescription(String vDescription) {
        this.vDescription = vDescription;
    }

    public String getPronounciation() {
        return pronounciation;
    }

    public void setPronounciation(String pronounciation) {
        this.pronounciation = pronounciation;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public Blob getSound() {
        return sound;
    }

    public void setSound(Blob sound) {
        this.sound = sound;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSoundUrl() {
        return soundUrl;
    }

    public void setSoundUrl(String soundUrl) {
        this.soundUrl = soundUrl;
    }
}
