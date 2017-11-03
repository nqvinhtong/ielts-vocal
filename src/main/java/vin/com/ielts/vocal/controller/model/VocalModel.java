package vin.com.ielts.vocal.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.sql.Blob;

public class VocalModel implements Serializable {

    @JsonProperty("vocal_id")
    private Long vocalId;

    @JsonProperty("vocal_name")
    private String vocalName;

    @JsonProperty("e_description")
    private String eDescription;

    @JsonProperty("v_description")
    private String vDescription;

    @JsonProperty("pronounciation")
    private String pronounciation;

    @JsonProperty("image")
    private Blob image;

    @JsonProperty("sound")
    private Blob sound;

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
}
