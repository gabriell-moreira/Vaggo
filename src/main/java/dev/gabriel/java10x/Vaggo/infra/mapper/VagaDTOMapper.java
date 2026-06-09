package dev.gabriel.java10x.Vaggo.infra.mapper;

import dev.gabriel.java10x.Vaggo.core.entities.Vaga;
import dev.gabriel.java10x.Vaggo.infra.dtos.VagaDTO;
import org.springframework.stereotype.Component;

@Component
public class VagaDTOMapper {

    // Transforma DTO em Domínio (Core) para ser enviado ao Caso de Uso
    public Vaga toDomain(VagaDTO dto) {
        return new Vaga(
                null,
                dto.empresa(),
                dto.titulo(),
                dto.descricao(),
                dto.local(),
                dto.salario(),
                dto.tipoVaga(),
                dto.dataInicio(),
                dto.dataFim()
        );
    }

    // Transforma o Domínio retornado pelo Caso de Uso de volta para DTO
    public VagaDTO toDTO(Vaga domain) {
        return new VagaDTO(
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