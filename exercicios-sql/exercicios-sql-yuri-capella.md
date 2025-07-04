-- Exercicio 01 --
CREATE DATABASE IF NOT EXISTS exercicios_teamcubation_sql;
USE exercicios_teamcubation_sql;

CREATE TABLE IF NOT EXISTS times(
id INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(255),
pais VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS jogadores(
id INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(255),
posicao VARCHAR(255),
time_id INT NOT NULL,
CONSTRAINT fk_jogador_time FOREIGN KEY (time_id) REFERENCES times(id)
);

-- Exercicio 02 --
INSERT INTO times(nome,pais)
VALUES('Brasil','Brasil'),
('Espanha','Espanha');

INSERT INTO jogadores(nome,posicao,time_id)
VALUES('Neymar','atacante',1),
('Iniesta','zagueiro',2),
('Cristiano','atacante',2),
('Messi','atacante',1),
('Xavi','goleiro',2);

SELECT * FROM times;
SELECT * FROM jogadores;

-- Exercicio 03 --
SELECT * FROM jogadores WHERE posicao = 'atacante' ORDER BY nome ASC;

-- Exercicio 04 --
ALTER TABLE times ADD COLUMN fundacao DATE;
ALTER TABLE times MODIFY COLUMN pais VARCHAR(100);
ALTER TABLE jogadores RENAME atletas;

-- Exercicio 05 --
SELECT atletas.nome AS JOGADOR, times.nome AS TIME
FROM atletas 
JOIN times
ON atletas.time_id = times.id;