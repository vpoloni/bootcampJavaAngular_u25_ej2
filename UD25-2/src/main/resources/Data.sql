DROP TABLE IF EXISTS empleados;
DROP TABLE IF EXISTS departamentos;

CREATE TABLE departamentos (
	id int auto_increment PRIMARY KEY,
	nombre varchar(100),
	presupuesto int
);

CREATE TABLE empleados (
	id int auto_increment PRIMARY KEY,
	nombre varchar(100),
	apellidos varchar(255),
	departamento_id int,
	CONSTRAINT departamento_fk FOREIGN KEY (departamento_id) REFERENCES departamentos (id)
	ON UPDATE CASCADE
	ON DELETE CASCADE
);

INSERT INTO departamentos (nombre, presupuesto) VALUES('HHRR', 10);
INSERT INTO departamentos (nombre, presupuesto) VALUES('contabilidad', 20);
INSERT INTO departamentos (nombre, presupuesto) VALUES('marketing', 40);

INSERT INTO empleados (nombre, apellidos, departamento_id) VALUES ('juan','Sole', 1);
INSERT INTO empleados (nombre, apellidos, departamento_id) VALUES ('anton','Sants', 2);
INSERT INTO empleados (nombre, apellidos, departamento_id) VALUES ('manel','Casals', 3);