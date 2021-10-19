CREATE TABLE residenciatable
(
    codigo character varying(6) COLLATE pg_catalog."default" NOT NULL,
    rua character varying(30) COLLATE pg_catalog."default",
    numero smallint,
    bairro character varying(30) COLLATE pg_catalog."default",
    cep character varying(8) COLLATE pg_catalog."default",
    telefone character varying(13) COLLATE pg_catalog."default",
    email character varying(30) COLLATE pg_catalog."default",
    quartos smallint,
    CONSTRAINT residenciatable_pkey PRIMARY KEY (codigo)
);