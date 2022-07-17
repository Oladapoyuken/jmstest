package com.yukenautomation.jmstest.scheduler;

import com.yukenautomation.jmstest.dto.MessageDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by @oladapoyuken 15/07/2022
 */

@Component
@RequiredArgsConstructor
@Slf4j
public class MessageScheduler {

    private final JmsTemplate jmsTemplate;
    public int counter = 1;

    @Scheduled(cron = "*/2 * * * * *")
    public void sendMessage(){
        jmsTemplate.convertAndSend("box", new MessageDto("info@example.com", "Hello JMS " + counter, counter));
        counter++;
//        log.info("Counter: {}", counter++);
    }
}
