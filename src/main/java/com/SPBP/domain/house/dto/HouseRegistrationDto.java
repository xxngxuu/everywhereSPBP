package com.SPBP.domain.house.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class HouseRegistrationDto {
    private String aptSeq;
    private String uuid;
    private String aptNm;
    private String sggCd;
    private String umdCd;
    private String umdNm;
    private String jibun;
    private String roadNmSggCd;
    private String roadNm;
    private String roadNmBonBun;
    private String roadNmBuBun;
    private int builYear;
    private double latitude;
    private double longitude;
    private String dealAmount;
    private String imgUrl;

}
