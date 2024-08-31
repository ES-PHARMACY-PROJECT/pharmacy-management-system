-- FUNCIONARIOS

INSERT INTO funcionario (DTYPE, nome, email, cpf, salario, data_admissao) VALUES ('Gerente', 'Carlos Silva', 'carlos.silva@example.com', '123.456.789-01', 3500.00, '2023-05-15');
INSERT INTO funcionario (DTYPE, nome, email, cpf, salario, data_admissao) VALUES ('Farmaceutico', 'Mariana Souza', 'mariana.souza@example.com', '987.654.321-00', 4800.50, '2022-11-01');
INSERT INTO funcionario (DTYPE, nome, email, cpf, salario, data_admissao) VALUES ('Vendedor', 'Fernanda Oliveira', 'fernanda.oliveira@example.com', '456.789.123-99', 5200.75, '2024-01-20');

-- CLIENTES

INSERT INTO Cliente (nome, email, cpf) VALUES ('Felipe Brandão', 'felipe.brandao@example.com', '902.795.580-82');
INSERT INTO Cliente (nome, email, cpf) VALUES ('Letícia Melo', 'leticia.melo@example.com', '072.540.350-07');

-- USERS 

INSERT INTO users (email, password, funcionario_id) VALUES ('carlos.silva@example.com', '$2a$10$rvo2dDExpjs5HlX3aBen2.sxkwkvGdAn0ZwhJ8UgKjjLnCbBf3yLG', 1);
INSERT INTO users (email, password, funcionario_id) VALUES ('mariana.souza@example.com', '$2a$10$rvo2dDExpjs5HlX3aBen2.sxkwkvGdAn0ZwhJ8UgKjjLnCbBf3yLG', 2);
INSERT INTO users (email, password, funcionario_id) VALUES ('fernanda.oliveira@example.com', '$2a$10$rvo2dDExpjs5HlX3aBen2.sxkwkvGdAn0ZwhJ8UgKjjLnCbBf3yLG', 3);
INSERT INTO users (email, password) VALUES ('felipe.brandao@example.com', '$2a$10$rvo2dDExpjs5HlX3aBen2.sxkwkvGdAn0ZwhJ8UgKjjLnCbBf3yLG');
INSERT INTO users (email, password) VALUES ('leticia.melo@example.com', '$2a$10$rvo2dDExpjs5HlX3aBen2.sxkwkvGdAn0ZwhJ8UgKjjLnCbBf3yLG');

-- MEDICAMENTOS

INSERT INTO medicamento (nome, descricao, preco, precisa_receita, validade) VALUES ('Rivotril', 'indicado para transtorno de ansiedade, transtorno de humor, síndromes psicóticas, síndrome das pernas inquietas, vertigem e distúrbio de equilíbrio, síndrome da boca ardente', 55.00, true, '2025-04-10');
INSERT INTO medicamento (nome, descricao, preco, precisa_receita, validade) VALUES ('Dipirona', ' medicamento anti-inflamatório não esteroide (AINE) com propriedades antipiréticas (alívio da febre) e analgésicas (alívio da dor)', 15.00, false, '2025-08-15');

-- VENDAS

INSERT INTO item_venda (medicamento_id, quantidade, preco_por_item) VALUES (1, 1, 55.00);
INSERT INTO venda (data, cliente_id, vendedor_id) VALUES ('2024-08-25', 2, 1);

INSERT INTO item_venda (medicamento_id, quantidade, preco_por_item) VALUES (2, 2, 15.00);
INSERT INTO venda (data, cliente_id, vendedor_id) VALUES ('2024-08-25', 1, 1);
