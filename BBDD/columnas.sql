ALTER TABLE tipo_activo
	ADD COLUMN cod VARCHAR(5),
	ADD COLUMN nombre VARCHAR(100),
	ADD COLUMN descripcion VARCHAR(600),
	ADD COLUMN fk_superior int UNSIGNED;
ALTER TABLE rel_tipo_activo_tipo_amenaza
	ADD COLUMN fk_tipo_activo int UNSIGNED,
	ADD COLUMN fk_tipo_amenaza int UNSIGNED;
ALTER TABLE tipo_amenaza
	ADD COLUMN cod VARCHAR(5),
	ADD COLUMN nombre VARCHAR(100),
	ADD COLUMN descripcion VARCHAR(600),
	ADD COLUMN fk_superior int UNSIGNED;
ALTER TABLE persona
	ADD COLUMN nombre VARCHAR(60),
	ADD COLUMN apellido1 VARCHAR(150),
	ADD COLUMN apellido2 VARCHAR(150),
	ADD COLUMN fk_puesto int UNSIGNED,
	ADD COLUMN fk_rol int UNSIGNED;
ALTER TABLE usuario
	ADD COLUMN contrasenya VARCHAR(100),
	ADD COLUMN permisos BIGINT,
	ADD COLUMN fk_persona int UNSIGNED;
ALTER TABLE activo
	ADD COLUMN cod VARCHAR(10),
	ADD COLUMN nombre VARCHAR(100),
	ADD COLUMN descripcion VARCHAR(600),
	ADD COLUMN fk_tipo int UNSIGNED,
	ADD COLUMN fk_superior int UNSIGNED;
ALTER TABLE rel_tipo_amenaza_dimensiones
	ADD COLUMN fk_tipo_amenaza int UNSIGNED,
	ADD COLUMN fk_dimension int UNSIGNED;
ALTER TABLE amenaza
	ADD COLUMN cod VARCHAR(10),
	ADD COLUMN nombre VARCHAR(100),
	ADD COLUMN descripcion VARCHAR(600),
	ADD COLUMN fk_tipo int UNSIGNED;
ALTER TABLE tipo_salvaguarda
	ADD COLUMN cod VARCHAR(5),
	ADD COLUMN nombre VARCHAR(100),
	ADD COLUMN descripcion VARCHAR(600),
	ADD COLUMN fk_superior int UNSIGNED;
ALTER TABLE puesto
	ADD COLUMN nombre VARCHAR(100);
ALTER TABLE Escala_valor
	ADD COLUMN abreviadura VARCHAR(5),
	ADD COLUMN magnitud VARCHAR(100);
ALTER TABLE valoracion
	ADD COLUMN fecha_creacion DATETIME,
	ADD COLUMN economia DOUBLE,
	ADD COLUMN fk_activo int UNSIGNED,
	ADD COLUMN fk_escala int UNSIGNED,
	ADD COLUMN fk_criterio int UNSIGNED;
ALTER TABLE Dimensiones_valoracion
	ADD COLUMN cod VARCHAR(10),
	ADD COLUMN nombre VARCHAR(100),
	ADD COLUMN definicion VARCHAR(200),
	ADD COLUMN descripcion VARCHAR(600);
ALTER TABLE Salvaguarda
	ADD COLUMN cod VARCHAR(10),
	ADD COLUMN nombre VARCHAR(100),
	ADD COLUMN descripcion VARCHAR(600),
	ADD COLUMN fk_tipo int UNSIGNED;
ALTER TABLE rol
	ADD COLUMN nombre VARCHAR(100);
ALTER TABLE valor_criterio
	ADD COLUMN fk_crm int UNSIGNED,
	ADD COLUMN fk_si int UNSIGNED,
	ADD COLUMN fk_pi int UNSIGNED,
	ADD COLUMN fk_rto int UNSIGNED,
	ADD COLUMN fk_lg int UNSIGNED,
	ADD COLUMN fk_adm int UNSIGNED,
	ADD COLUMN fk_olm int UNSIGNED,
	ADD COLUMN fk_lpo int UNSIGNED,
	ADD COLUMN fk_ibl_national int UNSIGNED,
	ADD COLUMN fk_ibl_ue int UNSIGNED,
	ADD COLUMN fk_cei int UNSIGNED,
	ADD COLUMN fk_da int UNSIGNED,
	ADD COLUMN fk_po int UNSIGNED;
ALTER TABLE criterio_crm
	ADD COLUMN NIVEL INT UNSIGNED,
    ADD COLUMN codigo VARCHAR(10),
    ADD COLUMN descripcion VARCHAR(200);
ALTER TABLE criterio_si
	ADD COLUMN NIVEL INT UNSIGNED,
    ADD COLUMN codigo VARCHAR(10),
    ADD COLUMN descripcion VARCHAR(200);
ALTER TABLE criterio_pi
	ADD COLUMN NIVEL INT UNSIGNED,
    ADD COLUMN codigo VARCHAR(10),
    ADD COLUMN descripcion VARCHAR(200);
ALTER TABLE criterio_rto
	ADD COLUMN NIVEL INT UNSIGNED,
    ADD COLUMN codigo VARCHAR(10),
    ADD COLUMN descripcion VARCHAR(200);
ALTER TABLE criterio_lg
	ADD COLUMN NIVEL INT UNSIGNED,
    ADD COLUMN codigo VARCHAR(10),
    ADD COLUMN descripcion VARCHAR(200);
ALTER TABLE criterio_adm
	ADD COLUMN NIVEL INT UNSIGNED,
    ADD COLUMN codigo VARCHAR(10),
    ADD COLUMN descripcion VARCHAR(200);
ALTER TABLE criterio_olm
	ADD COLUMN NIVEL INT UNSIGNED,
    ADD COLUMN codigo VARCHAR(10),
    ADD COLUMN descripcion VARCHAR(200);
ALTER TABLE criterio_lpo
	ADD COLUMN NIVEL INT UNSIGNED,
    ADD COLUMN codigo VARCHAR(10),
    ADD COLUMN descripcion VARCHAR(200);
ALTER TABLE criterio_ibl_national
	ADD COLUMN NIVEL INT UNSIGNED,
    ADD COLUMN codigo VARCHAR(10),
    ADD COLUMN descripcion VARCHAR(200);
ALTER TABLE criterio_ibl_ue
	ADD COLUMN NIVEL INT UNSIGNED,
    ADD COLUMN codigo VARCHAR(10),
    ADD COLUMN descripcion VARCHAR(200);
ALTER TABLE criterio_cei
	ADD COLUMN NIVEL INT UNSIGNED,
    ADD COLUMN codigo VARCHAR(10),
    ADD COLUMN descripcion VARCHAR(200);
ALTER TABLE criterio_da
	ADD COLUMN NIVEL INT UNSIGNED,
    ADD COLUMN codigo VARCHAR(10),
    ADD COLUMN descripcion VARCHAR(200);
ALTER TABLE criterio_po
	ADD COLUMN NIVEL INT UNSIGNED,
    ADD COLUMN codigo VARCHAR(10),
    ADD COLUMN descripcion VARCHAR(200);




























ALTER TABLE tipo_activo
	ADD FOREIGN KEY (fk_superior) REFERENCES tipo_activo(PK);
ALTER TABLE rel_tipo_activo_tipo_amenaza
	ADD FOREIGN KEY (fk_tipo_activo) REFERENCES tipo_activo(PK),
	ADD FOREIGN KEY (fk_tipo_amenaza) REFERENCES tipo_amenaza(PK);
ALTER TABLE tipo_amenaza
	ADD FOREIGN KEY (fk_superior) REFERENCES tipo_amenaza(PK);
ALTER TABLE persona
	ADD FOREIGN KEY (fk_puesto) REFERENCES puesto(PK),
	ADD FOREIGN KEY (fk_rol) REFERENCES rol(PK),
	ADD FOREIGN KEY (fk_persona) REFERENCES usuario(PK);
ALTER TABLE activo
	ADD FOREIGN KEY (fk_tipo) REFERENCES tipo_activo(PK),
	ADD FOREIGN KEY (fk_superior) REFERENCES activo(PK);
ALTER TABLE rel_tipo_amenaza_dimensiones
	ADD FOREIGN KEY (fk_tipo_amenaza) REFERENCES tipo_activo(PK),
	ADD FOREIGN KEY (fk_dimension) REFERENCES dimensiones_valoracion(PK);
ALTER TABLE amenaza
	ADD FOREIGN KEY (fk_tipo) REFERENCES tipo_amenaza(PK);
ALTER TABLE tipo_salvaguarda
	ADD FOREIGN KEY (fk_superior) REFERENCES tipo_salvaguarda(PK);
ALTER TABLE valoracion
	ADD FOREIGN KEY (fk_activo) REFERENCES activo(PK),
	ADD FOREIGN KEY (fk_escala) REFERENCES escala_valor(PK),
	ADD FOREIGN KEY (fk_criterio) REFERENCES valor_criterio(PK);
ALTER TABLE Salvaguarda
	ADD FOREIGN KEY (fk_tipo) REFERENCES tipo_salvaguarda(PK);
ALTER TABLE valor_criterio
	ADD FOREIGN KEY (fk_crm) REFERENCES criterio_crm(PK),
	ADD FOREIGN KEY (fk_si) REFERENCES criterio_si(PK),
	ADD FOREIGN KEY (fk_pi) REFERENCES criterio_pi(PK),
	ADD FOREIGN KEY (fk_rto) REFERENCES criterio_rto(PK),
	ADD FOREIGN KEY (fk_lg) REFERENCES criterio_lg(PK),
	ADD FOREIGN KEY (fk_adm) REFERENCES criterio_adm(PK),
	ADD FOREIGN KEY (fk_olm) REFERENCES criterio_olm(PK),
	ADD FOREIGN KEY (fk_lpo) REFERENCES criterio_lpo(PK),
	ADD FOREIGN KEY (fk_ibl_national) REFERENCES criterio_ibl_national(PK),
	ADD FOREIGN KEY (fk_ibl_ue) REFERENCES criterio_ibl_ue(PK),
	ADD FOREIGN KEY (fk_cei) REFERENCES criterio_cei(PK),
	ADD FOREIGN KEY (fk_da) REFERENCES criterio_da(PK),
	ADD FOREIGN KEY (fk_po) REFERENCES criterio_po(PK);

CREATE TABLE escala_riesgo LIKE escala_valor;
CREATE TABLE escala_probabilidad LIKE escala_valor;
CREATE TABLE escala_impacto LIKE escala_valor;
select * from escala_impacto ;

CREATE TABLE degradacion (
  `PK` int unsigned NOT NULL,
  `fecha_creacion` DATETIME DEFAULT NULL,
  `grado` DOUBLE DEFAULT NULL,
  `probabilidad` varchar(150) DEFAULT NULL,
  `fk_valoracion` int unsigned DEFAULT NULL,
  `fk_amenaza` int unsigned DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`),
  KEY `fk_valoracion` (`fk_valoracion`),
  KEY `fk_amenaza` (`fk_amenaza`),
  CONSTRAINT `degradacion_ibfk_1` FOREIGN KEY (`fk_valoracion`) REFERENCES `valoracion` (`PK`),
  CONSTRAINT `degradacion_ibfk_2` FOREIGN KEY (`fk_amenaza`) REFERENCES `amenaza` (`PK`)
);
CREATE TABLE eficiencia (
  `PK` int unsigned NOT NULL,
  `fecha_creacion` DATETIME DEFAULT NULL,
  `eficiencia_valor` varchar(60) DEFAULT NULL,
  `eficiencia_frecuencia` varchar(150) DEFAULT NULL,
  `fk_degradacion` int unsigned DEFAULT NULL,
  `fk_salvaguarda` int unsigned DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`),
  KEY `fk_degradacion` (`fk_degradacion`),
  KEY `fk_salvaguarda` (`fk_salvaguarda`),
  CONSTRAINT `eficiencia_ibfk_1` FOREIGN KEY (`fk_degradacion`) REFERENCES `degradacion` (`PK`),
  CONSTRAINT `eficiencia_ibfk_2` FOREIGN KEY (`fk_salvaguarda`) REFERENCES `salvaguarda` (`PK`)
);
