package com.SPBP.domain.chat.service;

import com.SPBP.domain.chat.dto.ChatMessageDto;
import com.SPBP.domain.chat.dto.ChatRoomDto;
import com.SPBP.domain.chat.mapper.ChatMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatServiceImpl implements ChatService {

    private final ChatMapper chatMapper;

    @Override
    public ChatRoomDto createChatRoom(String firstUuid, String secondUuid) {
        return chatMapper.createChatRoom(firstUuid, secondUuid);
    }

    @Override
    public List<ChatRoomDto> getAllChatRooms() {
        return chatMapper.getAllChatRooms();
    }

    @Override
    public void leaveChatRoom(String chatRoomId, String userUuid) {
        chatMapper.leaveChatRoom(chatRoomId, userUuid);
    }

    @Override
    public void sendMessage(ChatMessageDto messageDto) {
        chatMapper.sendMessage(messageDto);
    }

    @Override
    public List<ChatMessageDto> getMessagesByRoomId(String chatRoomId) {
        return chatMapper.getMessagesByRoomId(chatRoomId);
    }
}
