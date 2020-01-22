package com.zwp.chatdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Message {
    // 发送人
    private String name;
    // 发送消息
    private String content;
    private String date;

}
