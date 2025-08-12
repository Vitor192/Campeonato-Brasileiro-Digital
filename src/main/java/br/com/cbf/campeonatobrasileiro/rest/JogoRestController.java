package br.com.cbf.campeonatobrasileiro.rest;

import br.com.cbf.campeonatobrasileiro.dto.ClassificacaoDTO;
import br.com.cbf.campeonatobrasileiro.dto.JogoDTO;
import br.com.cbf.campeonatobrasileiro.entity.Jogo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping (value = "/jogos")

public class JogoRestController {
    @Autowired
    private JogoService jogoService;

    @ApiOperation(value = "Gera os jogos do campeonato!")
    @PostMapping
    public ResponseEntity<Void> gerarJogos() {
        jogoService.gerarJogos(LocalDateTime.now(), Arrays.asList());
        return ResponseEntity.ok().build();
    }

    @ApiOperation(value = "Retorna um jogo específico")
    @GetMapping(value = "/{id}")
    public ResponseEntity<JogoDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(jogoService.findById(id));
    }

    @ApiOperation(value = "Retorna todos os jogos")
    @GetMapping
    public ResponseEntity<List<JogoDTO>> findAll() {
        return ResponseEntity.ok().body(jogoService.findAll());
    }

    @ApiOperation(value = "Retorna a classificação")
    @GetMapping(value = "/classificacao")
    public ResponseEntity<ClassificacaoDTO> getClassificacao() {
        return ResponseEntity.ok().body(jogoService.getClassificacao());
    }

    @ApiOperation(value = "Finaliza um jogo")
    @PostMapping(value = "/finalizar/{id}")
    public ResponseEntity<Void> finalizarJogo(@PathVariable Integer id, @RequestBody JogoDTO jogoDTO) throws Exception {
        jogoService.finalizarJogo(id, jogoDTO);
        return ResponseEntity.ok().build();
    }



}
