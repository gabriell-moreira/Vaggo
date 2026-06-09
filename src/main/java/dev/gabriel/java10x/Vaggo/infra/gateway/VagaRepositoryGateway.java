package dev.gabriel.java10x.Vaggo.infra.gateway;

import dev.gabriel.java10x.Vaggo.core.entities.Vaga;
import dev.gabriel.java10x.Vaggo.core.gateway.VagaGateway;
import dev.gabriel.java10x.Vaggo.infra.mapper.VagaEntityMapper;
import dev.gabriel.java10x.Vaggo.infra.persistence.VagaEntity;
import dev.gabriel.java10x.Vaggo.infra.persistence.repository.VagaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class VagaRepositoryGateway implements VagaGateway {

    private final VagaRepository vagaRepository;
    private final VagaEntityMapper vagaEntityMapper;


    @Override
    public Vaga criarVaga(Vaga vaga){
        VagaEntity vagaSalva = vagaRepository.save(vagaEntityMapper.toEntity(vaga));
        return vagaEntityMapper.toDomain(vagaSalva);
    };
}
