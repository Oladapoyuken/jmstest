package com.yukenautomation.jmstest.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.ErrorHandler;

/**
 * Created by @oladapoyuken 15/07/2022
 */

@Service
@Slf4j
public class JmsExceptionHandler implements ErrorHandler {

    @Override
    public void handleError(Throwable t) {
        log.warn("In default jms error handler...");
        log.error("Error Message : {}", t.getMessage());
    }

}
