package dev.gabriel.java10x.Vaggo.infra.mapper;

import dev.gabriel.java10x.Vaggo.core.entities.Vaga;
import dev.gabriel.java10x.Vaggo.infra.persistence.VagaEntity;
import org.springframework.stereotype.Component;

@Component
public class VagaEntityMapper {

    public Vaga toDomain(VagaEntity vagaEntity) {
        return new Vaga(
                vagaEntity.getId(),
                vagaEntity.getEmpresa(),
                vagaEntity.getTitulo(),
                vagaEntity.getDescricao(),
                vagaEntity.getLocal(),
                vagaEntity.getSalario(),
                vagaEntity.getTipo(),
                vagaEntity.getDataInicio(),
                vagaEntity.getDataFim()
        );
    }

    public VagaEntity toEntity(Vaga domain) {
        return new VagaEntity(
                domain.id(),
                domain.empresa(),
                domain.titulo(),
                domain.descricao(),
                domain.local(),
                domain.salario(),
                domain.tipo(),
                domain.dataInicio(),
                domain.dataFim()
        );
    }
}
