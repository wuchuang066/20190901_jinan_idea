package com.zpark.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Receiver {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer receiverId;

    private String receiverName;

    private Integer receiverSerial;

    private String receiverNote;

    public Integer getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    public Integer getReceiverSerial() {
        return receiverSerial;
    }

    public void setReceiverSerial(Integer receiverSerial) {
        this.receiverSerial = receiverSerial;
    }

    public String getReceiverNote() {
        return receiverNote;
    }

    public void setReceiverNote(String receiverNote) {
        this.receiverNote = receiverNote == null ? null : receiverNote.trim();
    }
}