create database Projeto_integrador_JA;

use Projeto_integrador_JA;

create table chapa (
id_chapa bigint not null unique auto_increment,
senha_chapa varchar (30) not null unique,
lema varchar (50) not null,
nome_chapa varchar (20) not null,
id_estudante bigint not null,
primary key (id_chapa), 
foreign key (id_estudante) references estudante (id_estudante)
);

create table estudante (
id_estudante bigint not null unique auto_increment,
email_institucional varchar (100) not null unique,
nome varchar (70) not null,
senha_estudante varchar (30) not null unique,
primary key (id_estudante)
);

create table eleicao (
id_eleicao bigint not null unique auto_increment,
data date not null,
primary key (id_eleicao),
id_chapa bigint not null,
foreign key (id_chapa) references chapa (id_chapa) 
);

create table participacao (
id_participacao bigint not null unique auto_increment,
id_estudante bigint not null,
id_chapa bigint not null,
primary key (id_participacao),
foreign key (id_estudante) references estudante (id_estudante),
foreign key (id_chapa) references chapa (id_chapa)
);

create table votacao (
id_votacao bigint not null unique auto_increment,
primary key (id_votacao),
id_estudante bigint not null,
id_chapa bigint not null,
foreign key (id_estudante) references estudante (id_estudante),
foreign key (id_chapa) references chapa (id_chapa)
);

create table chat (
id_chat bigint not null unique auto_increment,
id_estudante bigint not null,
id_chapa bigint not null,
primary key (id_chat),
foreign key (id_estudante) references estudante (id_estudante),
foreign key (id_chapa) references chapa (id_chapa)
);

create table comentario (
id_estudante bigint not null,
id_comentario bigint not null unique auto_increment,
primary key (id_comentario), 
foreign key (id_estudante) references estudante (id_estudante)
);

create table publicacao (
id_publicacao bigint not null unique auto_increment,
id_chapa bigint not null,
imagem varchar (150) not null,
video varchar (150) not null,
documento varchar (150) not null,
comentario varchar (200) not null,
primary key (id_publicacao),
foreign key (id_chapa) references chapa (id_chapa)
);                                                                               
