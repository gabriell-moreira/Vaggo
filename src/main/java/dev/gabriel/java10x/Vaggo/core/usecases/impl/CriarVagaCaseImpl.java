package dev.gabriel.java10x.Vaggo.core.usecases.impl;

import dev.gabriel.java10x.Vaggo.core.entities.Vaga;
import dev.gabriel.java10x.Vaggo.core.gateway.VagaGateway;
import dev.gabriel.java10x.Vaggo.core.usecases.CriarVagaCase;

public class CriarVagaCaseImpl implements CriarVagaCase {

    private final VagaGateway vagaGateway;

    public CriarVagaCaseImpl(VagaGateway vagaGateway) {
        this.vagaGateway = vagaGateway;
    }

    @Override
    public Vaga execute(Vaga vaga){
        return vagaGateway.criarVaga(vaga);
    }
}
