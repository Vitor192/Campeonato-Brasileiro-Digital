package br.com.cbf.campeonatobrasileiro.dto;


import io.swagger.models.auth.In;
import lombok.Data;

@Data
public class JogoFinalizadoDTO {
    private Integer golsTime1;
    private Integer golsTime2;
    private Integer publicoPagante;
}
