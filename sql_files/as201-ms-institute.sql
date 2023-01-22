-- CREAR DATABASE as201-ms-career
CREATE DATABASE "dbinstitute"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    --LC_COLLATE = 'Spanish_Peru.1252'
    --LC_CTYPE = 'Spanish_Peru.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;


-- COMENTAR DATABASE
COMMENT ON DATABASE "dbinstitute"
    IS 'Institute Microservice Database';
\c dbinstitute
-- CREAR TABLA institute
-- CREAR TABLA institute
CREATE TABLE institute
(
    id     SERIAL PRIMARY KEY NOT NULL,
    name   VARCHAR(100)       NOT NULL,
    ruc    CHAR(11)           NOT NULL,
    active boolean            NOT NULL
);


-- INSERTAR REGISTROS
INSERT INTO institute
    (name, ruc, active)
VALUES ('I.E.S.T.P VALLE GRANDE', '20120099095', 'true'),
       ('I.E.S.T.P CONNDORAY', '20120063571', 'true'),
       ('I.E.S.T.P SENATI', '20131376503', 'true'),
       ('I.E.S.T.P TECSUP', '20117592899', 'true'),
       ('I.E.S.T.P IDAT', '20605391738', 'true'),
       ('I.E.S.T.P SAN IGNACIO DE LOYOLA ISIL', '20100134455', 'true'),
       ('I.E.S.T.P CIBERTEC', '20545739284', 'true'),
       ('I.E.S.T.P TOULOUSE LAUTREC TLS', '20520869655', 'true'),
       ('I.E.S.T.P DEL SUR', '20133013441', 'true');