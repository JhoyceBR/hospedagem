CREATE TABLE quartotable
(
    valordiaria numeric NOT NULL,
    numeromaxhospede smallint NOT NULL,
    arcondicionado boolean NOT NULL,
    hidromassagem boolean NOT NULL,
    id_quarto character varying(6) COLLATE pg_catalog."default" NOT NULL,
    codresidencia character varying(6) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT quartotable_pkey PRIMARY KEY (id_quarto)
);