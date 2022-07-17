package com.yukenautomation.jmstest.sender;

import com.yukenautomation.jmstest.dto.MessageDto;
import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by @oladapoyuken 14/07/2022
 */

@Component
@RequiredArgsConstructor
public class JmsMessageSender {

    private final JmsTemplate jmsTemplate;

    public void messageSender(MessageDto dto){
        jmsTemplate.convertAndSend("box", dto);
    }

}
