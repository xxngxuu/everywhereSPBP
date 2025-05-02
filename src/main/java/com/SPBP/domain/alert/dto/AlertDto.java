package com.SPBP.domain.alert.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class AlertDto {
    private UUID uuid;
    private String dongCode;
    private String minAmount;
    private String maxAmount;
}
