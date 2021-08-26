DROP TABLE IF EXISTS cientificos;
DROP TABLE IF EXISTS proyectos;
DROP TABLE IF EXISTS asignado_a;

CREATE TABLE cientificos(
dni VARCHAR(8),
nomapels varchar(255) NOT NULL,
PRIMARY KEY (dni));

CREATE TABLE proyectos(
id VARCHAR(4),
nombre VARCHAR(255) NOT NULL,
horas INT NOT NULL,
PRIMARY KEY (id));

create table asignado_a(
id INT AUTO_INCREMENT,
cientifico VARCHAR(255) NOT NULL,
proyecto VARCHAR(4) NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (cientifico) REFERENCES cientificos(dni) ON DELETE RESTRICT ON UPDATE CASCADE,
FOREIGN KEY (proyecto) REFERENCES proyectos(id) ON DELETE RESTRICT ON UPDATE CASCADE);

INSERT INTO cientificos (dni, nomapels) VALUES ('12345678', 'Perico de los Palotes');
INSERT INTO proyectos (id, nombre, horas) VALUES ('pro1', 'Proyecto 1', 1500);
INSERT INTO asignado_a (cientifico, proyecto) VALUES ('12345678', 'pro1');