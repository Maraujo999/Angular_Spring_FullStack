CREATE TABLE mensagem (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	email VARCHAR(80) NOT NULL,
	mensagem VARCHAR(500) NOT NULL
	
	) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO mensagem (nome, email, mensagem) values ('Michelson', 'm.nihil944@gmail.com', 'Desejo entrar em contato para onde se situa a empresa');
INSERT INTO mensagem (nome, email, mensagem) values ('LOLA', 'lola.lola@gmail.com', 'Cão também programa');
INSERT INTO mensagem (nome, email, mensagem) values ('TESTA1', 'testa1@gmail.com', 'TESTA1');
INSERT INTO mensagem (nome, email, mensagem) values ('TESTA2', 'testa2@gmail.com', 'TESTA2');
INSERT INTO mensagem (nome, email, mensagem) values ('TESTA3', 'testa3@gmail.com', 'TESTA3');