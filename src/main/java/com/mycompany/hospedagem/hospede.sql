CREATE TABLE hospedetable
(
    nome character varying(100) COLLATE pg_catalog."default" NOT NULL,
    cpf character varying(11) COLLATE pg_catalog."default" NOT NULL,
    endereco character varying(150) COLLATE pg_catalog."default" NOT NULL,
    celular character varying(13) COLLATE pg_catalog."default",
    email character varying(50) COLLATE pg_catalog."default",
    CONSTRAINT hospedetable_pkey PRIMARY KEY (cpf),
    CONSTRAINT hospedetable_email_key UNIQUE (email)
);