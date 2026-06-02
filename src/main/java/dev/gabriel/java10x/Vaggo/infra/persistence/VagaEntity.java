package dev.gabriel.java10x.Vaggo.infra.persistence;

import dev.gabriel.java10x.Vaggo.core.emuns.TipoVaga;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_vagas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class VagaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "pk_cargo")
    private UUID id;

    @Column(name = "vc_empresa", nullable = false)
    private String empresa;

    @Column(name = "vc_titulo", nullable = false)
    private String titulo;

    @Column(name = "vc_descricao", nullable = false)
    private String descricao;

    @Column(name = "vc_local", nullable = false)
    private String local;

    @Column(name = "vc_salario", nullable = false)
    private Double salario;

    @Enumerated(EnumType.STRING)
    @Column(name = "vc_tipo", nullable = false)
    private TipoVaga tipo;

    @Column(name = "dt_inicio", nullable = false)
    private LocalDateTime dataInicio;

    @Column(name = "dt_fim", nullable = false)
    private LocalDateTime dataFim;
}
