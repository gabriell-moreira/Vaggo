package dev.gabriel.java10x.Vaggo.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VagaRepository extends JpaRepository<VagaEntity, UUID> {
}
