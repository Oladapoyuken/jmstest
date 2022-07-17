package com.yukenautomation.jmstest.reciever;

import com.yukenautomation.jmstest.dto.MessageDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;

/**
 * Created by @oladapoyuken 14/07/2022
 */

@Component
public class jmsMessageReceiver {

    @JmsListener(destination = "box", containerFactory = "myFactory")
    public void messageReceiver(MessageDto dto) throws JMSException {
        if(dto.getCount() % 2 == 0) {
            System.out.println("Message Received: " + dto);
        }
        else{
//            throw new JMSException("Not an even counter");
        }

    }
}
