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
public class ChatRoomDto {
    private String chatRoomId;
    private String firstUuid;
    private String secondUuid;
    private Timestamp createdAt;

}
