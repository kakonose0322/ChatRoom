package com.zwp.chatdemo.job;

import com.zwp.chatdemo.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
public class MyJob {
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    public void send() {
        SimpleDateFormat sdf = new SimpleDateFormat();
        String formatDate = sdf.format(new Date());
        messagingTemplate.convertAndSendToUser("/topic/greetings",new Message("定时任务:", "检测通信",formatDate));
    }
}
