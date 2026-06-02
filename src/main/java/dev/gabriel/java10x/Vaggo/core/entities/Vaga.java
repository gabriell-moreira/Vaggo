package dev.gabriel.java10x.Vaggo.core.entities;

import dev.gabriel.java10x.Vaggo.core.emuns.TipoVaga;

import java.time.LocalDateTime;
import java.util.UUID;

public record Vaga(
        UUID id,
        String empresa,
        String titulo,
        String descricao,
        String local,
        Double salario,
        TipoVaga tipo,
        LocalDateTime dataInicio,
        LocalDateTime dataFim
) {}
