package dev.gabriel.java10x.Vaggo.infra.persistence.repository;

import dev.gabriel.java10x.Vaggo.infra.persistence.VagaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VagaRepository extends JpaRepository<VagaEntity, UUID> {
}
