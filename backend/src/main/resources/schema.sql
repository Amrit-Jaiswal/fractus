DROP TABLE if EXISTS country;
DROP TABLE if EXISTS users;
DROP TABLE if EXISTS Questionnaire;

create table Questionnaire(
ques_id int(4), question VARCHAR(255),
primary key(ques_id));

create table country(
cId int(4), cName varchar(255),
primary key(cId));

create table users(
userid int, name varchar(255), salary int,
primary key(userid));
