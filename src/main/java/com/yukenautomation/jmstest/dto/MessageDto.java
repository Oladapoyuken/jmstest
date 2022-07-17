package com.yukenautomation.jmstest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by @oladapoyuken 14/07/2022
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageDto {
    private String to;
    private String body;
    private int count;
}
