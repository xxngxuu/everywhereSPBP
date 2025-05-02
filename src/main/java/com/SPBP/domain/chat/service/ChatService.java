package com.SPBP.domain.chat.service;

import com.SPBP.domain.chat.dto.ChatMessageDto;
import com.SPBP.domain.chat.dto.ChatRoomDto;

import java.util.List;

public interface ChatService {

    ChatRoomDto createChatRoom(String firstUuid, String secondUuid);
    List<ChatRoomDto> getAllChatRooms();
//    ChatRoomDto getChatRoomByUuid(String name); 이름으로 채팅방 검색
    void leaveChatRoom(String chatRoomId, String userUuid); // 진짜 삭제 x 상태를 비활
    void sendMessage(ChatMessageDto messageDto);
    List<ChatMessageDto> getMessagesByRoomId(String chatRoomId);
}
