-- V001_CRIAR_TABELA_VAGA.sql
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE tab_vagas (
    pk_vaga UUID PRIMARY KEY,
    vc_empresa VARCHAR NOT NULL,
    vc_titulo VARCHAR(255) NOT NULL,
    vc_descricao TEXT NOT NULL,
    vc_local VARCHAR(100) NOT NULL,
    vc_salario DOUBLE PRECISION NOT NULL,
    vc_tipo VARCHAR(100) NOT NULL,
    dt_inicio TIMESTAMP NOT NULL,
    dt_fim TIMESTAMP NOT NULL,
    CONSTRAINT tab_vagas_pkey PRIMARY KEY (pk_vaga),
    CONSTRAINT uk1_tab_vagas UNIQUE (vc_titulo)
);