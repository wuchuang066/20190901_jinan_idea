package com.zpark.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Level {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer levelId;

    private String levelName;

    private Integer receiverId;

    private String levelNote;

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
    }

    public Integer getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
    }

    public String getLevelNote() {
        return levelNote;
    }

    public void setLevelNote(String levelNote) {
        this.levelNote = levelNote == null ? null : levelNote.trim();
    }
}