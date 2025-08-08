package br.com.cbf.campeonatobrasileiro.service;

import br.com.cbf.campeonatobrasileiro.dto.TimeDTO;
import br.com.cbf.campeonatobrasileiro.entity.Time;
import br.com.cbf.campeonatobrasileiro.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TimeServico {

    @Autowired
    private TimeRepository repository;

    public void cadastrarTime(TimeDTO time) {
        Time entity = toEntity(time);
        repository.save(entity);
    }

    private Time toEntity(TimeDTO time) {
        Time entity = new Time();
        entity.setEstadio(time.getEstadio());
        entity.setSigla(time.getSigla());
        entity.setNome(time.getNome());
        entity.setUf(time.getUf());
        return entity;
    }

    private TimeDTO toDto(Time entity) {
        TimeDTO dto = new TimeDTO();
        dto.setEstadio(entity.getEstadio());
        dto.setSigla(entity.getSigla());
        dto.setNome(entity.getNome());
        dto.setUf(entity.getUf());
        return dto;


    }

    public List<TimeDTO> listarTimes() {
        return repository.findAll().stream().map(entity -> toDto(entity)).collect(Collectors.toList());
    }

    public TimeDTO obterTime(Integer id) {
        return toDto (repository.findById(id).get());
    }


}
