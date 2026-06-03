package dev.gabriel.java10x.Vaggo.infra.dtos;

import dev.gabriel.java10x.Vaggo.core.emuns.TipoVaga;

import java.time.LocalDateTime;

public record VagaDTO(
        String empresa,
        String titulo,
        String descricao,
        String local,
        Double salario,
        TipoVaga tipoVaga,
        LocalDateTime dataInicio,
        LocalDateTime dataFim
) {}
