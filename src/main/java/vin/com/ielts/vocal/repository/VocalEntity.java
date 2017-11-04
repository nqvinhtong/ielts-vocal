package vin.com.ielts.vocal.repository;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Table(name = "vocabulary")
public class VocalEntity {

    @Id
    @Column(name = "vocal_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vocalId;

    @Column(name = "vocal_name")
    private String vocalName;

    @Column(name = "e_description")
    private String eDescription;

    @Column(name = "v_description")
    private String vDescription;

    @Column(name = "pronounciation")
    private String pronounciation;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "image")
    private Blob image;

    @Column(name = "sound_url")
    private String soundUrl;

    @Column(name = "sound")
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
