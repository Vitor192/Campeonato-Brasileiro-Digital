package br.com.cbf.campeonatobrasileiro.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity

public class Jogo {

    private Time time1;
    private Time time2;
    private Integer golsTime1;
    private Integer golsTime2;
    private Integer publicoPagante;
}
