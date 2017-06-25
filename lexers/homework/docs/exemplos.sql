SQL

DDL
drop table aluno;
create table aluno(
	matricula int not null,
	nome varchar(100) not null,
	email varchar(100),
	primary key (matricula)
);




insert into aluno(nome, matricula) 
	values ('Felipe Inho Jr.',120048);
insert into aluno 
	values (400222, 'Wellington Della Mura', 'wellington@uenp.edu.br');

update aluno set 
	email='nome@ibest.com.br',
	nome='André Willian Matheus Chiarotti Aime Fantineli Fabris Rodrigues'
where matricula = 120048;

delete from aluno
where matricula = 120048;

select matricula, nome from aluno