--liquibase formatted sql

--changeset ydshkn:1
--comment init databases

create table projects
(
    id serial primary key,
    work_period varchar(30) not null,
    java_version varchar(30) not null,
    stack varchar not null
);

create table steps
(
    id serial primary key,
    title varchar(32) not null,
    year varchar(4) not null,
    description varchar(300) not null
);

--rollback truncate table projects;
--rollback truncate table steps;



