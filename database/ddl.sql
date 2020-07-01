CREATE DATABASE desafio;

USE desafio;

CREATE TABLE usuario(
	id serial,
	nome varchar(255),
    email varchar(100),
	cpf varchar(11),
    nascimento date,
    endereco varchar(100)
);