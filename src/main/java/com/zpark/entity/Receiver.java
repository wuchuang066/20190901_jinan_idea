package com.zpark.entity;

public class Receiver {
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