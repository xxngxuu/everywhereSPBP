package com.SPBP.domain.chat.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ChatMessageDto {

    private String chatRoomId;
    private String senderUuid;
    private String message;
    private Timestamp timestamp;

}
