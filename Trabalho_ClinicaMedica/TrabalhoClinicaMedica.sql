show  databases;
use word;

create database clinicaMedica;
use clinicaMedica;

create table especialidades(
espcod  int not null primary key auto_increment,
espdescricao varchar(30) not null);

create table medico(
medcrm int not null primary key ,
mednome varchar(30) not null,
medcpf varchar(14),
medfone varchar(12),
medendereco varchar(30),
medespcod int not null,
foreign key(medespcod) references especialidades(espcod));

create table exame(
excod  int not null primary key auto_increment,
exdescricao varchar(30) not null);

create table paciente(
paccod int not null primary key auto_increment,
pacnome varchar(30) not null,
pacendereco varchar(30)not null,
pacfone varchar(12)not null,
pacemail varchar(20) not null);

create table consulta(
conscod int not null primary key auto_increment,
consserv varchar(30) not null,
consdtconsulta varchar(14),
conspaccod int not null,
consexcod int not null,
consmedcrm int not null,
foreign key(conspaccod) references paciente(paccod),
foreign key(consexcod) references exame(excod),
foreign key(consmedcrm) references medico(medcrm));

