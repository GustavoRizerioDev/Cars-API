create table Car(
 	id int GENERATED ALWAYS AS IDENTITY,
    nome varchar(200),
    marca varchar(100),
    preco int,
    primary key(id)
);
