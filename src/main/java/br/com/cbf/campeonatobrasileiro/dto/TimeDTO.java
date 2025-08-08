package br.com.cbf.campeonatobrasileiro.dto;

import jakarta.persistence.Column;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class TimeDTO {

    private Integer id;
    private String nome;
    private String sigla;
    private String uf;
    private String estadio;

}
