CREATE TABLE Evento (
		registro INTEGER NOT NULL,
		nome VARCHAR(50) NOT NULL,
                data DATE NOT NULL,
		local VARCHAR(120) NOT NULL,
		CONSTRAINT registro_pk PRIMARY KEY (registro)
);


CREATE TABLE Palestrante (
		cpf: NUMERIC (11) NOT NULL,	
		nome VARCHAR(50) NOT NULL,
		tema VARCHAR(120) NOT NULL,
		registro INTEGER NOT NULL,
		horario TIME NOT null,
                CONSTRAINT cpf_pk PRIMARY KEY (cpf)
);


drop table palestrante;
ALTER TABLE Palestrante ADD CONSTRAINT registro_event_fk
FOREIGN KEY (registro)
REFERENCES Evento(registro)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
INSERT INTO public.evento(
	registro, nome, data, local)
	VALUES (1,'Jornada de Cientifica das Ciências Exatas' ,'15/07/2020','Av das Palmeiras, nº151 – Pouso Alegre/ MG');
		registro, nome, data, local)
	VALUES (2,'Jornada Odontologica' ,'15/08/2020','Av das Palmeiras, nº151 – Pouso Alegre/ MG');
	
	INSERT INTO public.palestrante(
	cpf, nome, tema, registro, horario)
	VALUES ('010.111.881-30', 'Paulo Matos', 'Cálculos Avançados', 1, '17:30');
	VALUES ('750.481.841-10', 'Rafael Aguiar', 'Análise Periodontal', 2, '10:00');