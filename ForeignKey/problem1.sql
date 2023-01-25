create table post (id integer, post varchar(255),fk_user integer references user(id));
--create table user(id integer primary key, firstname varchar(100),lastname varchar(100));