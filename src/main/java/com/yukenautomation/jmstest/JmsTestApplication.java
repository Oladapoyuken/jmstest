package com.yukenautomation.jmstest;

import javax.jms.ConnectionFactory;

import com.yukenautomation.jmstest.dto.MessageDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JmsTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmsTestApplication.class, args);
//        ConfigurableApplicationContext context = SpringApplication.run(JmsTestApplication.class, args);
//        JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
//        System.out.println("Sending an email message.");
//        jmsTemplate.convertAndSend("box", new MessageDto("info@example.com", "Hello JMS"));

    }

}
