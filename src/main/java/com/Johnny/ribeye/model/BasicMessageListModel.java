package com.Johnny.ribeye.model;

public class BasicMessageListModel {

    private final Integer pageNumber;
    private final Integer messageCount;
    private final BasicMessageModel[] messageList;

    public BasicMessageListModel(Integer pageNumber, Integer messageCount, BasicMessageModel[] messageList) {
        this.pageNumber = pageNumber;
        this.messageCount = messageCount;
        this.messageList = messageList;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public Integer getMessageCount() {
        return messageCount;
    }

    public BasicMessageModel[] getMessageList() {
        return messageList;
    }
}
