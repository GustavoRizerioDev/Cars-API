create table Car(
 	id int GENERATED ALWAYS AS IDENTITY,
    nome varchar(200),
    marca varchar(100),
    preco int,
    ano int,
    cor varchar(100),
    modelo varchar(100),
    quilometragem int,
    portas int,
    finalPlaca int,
    primary key(id)
);
