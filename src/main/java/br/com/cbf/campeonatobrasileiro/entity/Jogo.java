package br.com.cbf.campeonatobrasileiro.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity

public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer golsTime1;
    private Integer golsTime2;
    private Integer publicoPagante;
    private LocalDateTime dataJogo;
    private Integer rodada;
    private Boolean encerrado;

    @ManyToOne
    @JoinColumn(name="time1")
    private Time time1;
    
    @ManyToOne
    @JoinColumn(name="time2")
    private Time time2;
}
