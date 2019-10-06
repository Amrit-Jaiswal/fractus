DROP TABLE if EXISTS country;
DROP TABLE if EXISTS users;

create table country(
cId int(4), cName varchar(255),
primary key(cId));

create table users(
userid int, name varchar(255), salary int,
primary key(userid));