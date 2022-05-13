# Movie
This is code to insert movie details (name, actor, actress, director, year of release) using a SELECT statement.And  simple SELECT statement to query all rows from the Movies table, as well as use a query with parameter like actor name to select movies based on the actor's name.
//Do this Mysql shell 
create database movies;
use movies;
create table movies(name varchar(30),actor varchar(30),actress varchar(30),director varchar(30),year_of_release integer(4));
