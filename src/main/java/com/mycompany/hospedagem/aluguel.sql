CREATE TABLE alugueltable
(
    valor numeric NOT NULL,
    diarias smallint NOT NULL,
    hospede character varying(11) COLLATE pg_catalog."default" NOT NULL,
    quarto character varying(6) COLLATE pg_catalog."default" NOT NULL,
    dataentrada timestamp with time zone NOT NULL,
    datasaida timestamp with time zone NOT NULL,
    id character varying(6) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT alugueltable_pkey PRIMARY KEY (id)
);
