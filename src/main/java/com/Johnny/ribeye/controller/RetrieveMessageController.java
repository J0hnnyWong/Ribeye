package com.Johnny.ribeye.controller;

import com.Johnny.ribeye.model.BasicMessageListModel;
import com.Johnny.ribeye.model.BasicMessageModel;
import com.Johnny.ribeye.model.BasicResponseModel;
import org.springframework.web.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetrieveMessageController {

    @GetMapping("/message/list")
    public BasicResponseModel getMessage(@RequestParam(value = "pageNumber", defaultValue = "1") Integer pageNumber, @RequestParam(value = "messageCount", defaultValue = "20") Integer messageCount) {
        BasicMessageModel[] messageList = new BasicMessageModel[messageCount];
        for (int i = 0; i < messageCount; i++) {
            BasicMessageModel model = new BasicMessageModel(String.format("message: %d", i));
            messageList[i] = model;
        }
        BasicMessageListModel messageListModel = new BasicMessageListModel(pageNumber, messageCount, messageList);
        BasicResponseModel response = new BasicResponseModel("ok", messageListModel);
        return response;
    }
}
