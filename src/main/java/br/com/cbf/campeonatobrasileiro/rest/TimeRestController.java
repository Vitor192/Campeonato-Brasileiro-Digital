package br.com.cbf.campeonatobrasileiro.rest;

import br.com.cbf.campeonatobrasileiro.dto.TimeDTO;
import br.com.cbf.campeonatobrasileiro.entity.Time;
import br.com.cbf.campeonatobrasileiro.service.TimeServico;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping(value="/times")
public class TimeRestController {

    @Autowired
    private TimeServico timeServico;

    @GetMapping
    public ResponseEntity<List<TimeDTO>> getTimes () {
        return ResponseEntity.ok().body(timeServico.listarTimes());
    }


    @ApiOperation(value = "Obtém os dados um time")
    @GetMapping(value = "{id}")
    public ResponseEntity<TimeDTO> getTime(@PathVariable Integer id) {
        return ResponseEntity.ok().body(timeServico.obterTime(id));
    }

    @PostMapping
    public ResponseEntity<Void> cadastrarTime(@Validated @RequestBody TimeDTO time) {
        timeServico.cadastrarTime(time);
        return ResponseEntity.ok().build();
    }
}
