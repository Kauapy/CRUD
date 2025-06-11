CREATE TABLE usuario (
  id SERIAL PRIMARY KEY,
  nome VARCHAR(100) NOT NULL,
  email VARCHAR(150) NOT NULL UNIQUE
);
INSERT INTO usuario (nome, email) VALUES
  ('João Silva','joao.silva@example.com'),
  ('Maria Souza','maria.souza@example.com');