package com.SPBP.domain.house.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class HouseDealDto {
    private int no;
    private String aptSeq;
    private String aptNm;
    private String floor;
    private int dealYear;
    private int dealMonth;
    private int dealDay;
    private float excluUseAr;
    private String dealAmount;

    private String sggCd;
    private String umdCd;
    private String umdNm;
    private String jibun;
    private String roadNmSggCd;
    private String roadNm;
    private String roadNmBonbun;
    private String roadNmBubun;

    private String footage;
    private String dealDate;

}
