# desenvSftw2020
Material Disciplina Desenvolvimento Software 2020


passo 1 : instalar o mysql

passo 2 : entrar no console do mysql
#mysql -p -u root

passo 3: criar o database: 
create database farmacia;

passo 4:
criando usuario mysql
mysql> create user 'cassio'@'%' identified by '123';

passo 5: liberando perimssoes para usuario x no banco farmacia
mysql> grant all on farmacia.* to 'cassio'@'%' ;

