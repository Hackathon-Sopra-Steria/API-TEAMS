DROP TABLE ROLES if exists;
create table ROLES
(
    id int not null
        constraint ROLES_pk
            primary key,
    role varchar(100) not null
);

INSERT INTO roles (id,role) VALUES (1,'ADMIN');
INSERT INTO roles (id,role) VALUES (2,'USER');
INSERT INTO roles (id,role) VALUES (3,'OBERSEVER');

DROP TABLE workertypes if exists;
create table workertypes
(
    id int not null
        constraint workertypes_pk
            primary key,
    name varchar(20) not null
);

INSERT INTO workertypes (id, name) VALUES (1, 'SCRUM MASTER');
INSERT INTO workertypes (id, name) VALUES (2, 'FRONTEND');
INSERT INTO workertypes (id, name) VALUES (3, 'BACKEND');
INSERT INTO workertypes (id, name) VALUES (4, 'PRODUCT OWNER');

DROP TABLE person if exists;
create table person
(
    id int not null
        constraint person_pk
            primary key,
    id_user int not null,
    email varchar(100) not null,
    first_name varchar(100) not null,
    last_name varchar(100),
    id_workertype integer not null,
    url_photo varchar(300),
    asperger boolean not null default false
);

INSERT INTO person (id, id_user, email, first_name, last_name, id_workertype, url_photo) VALUES (1, 1, 'admin@admin.com', 'Admin', 'Istrador', 4, 'https://yinnepal.files.wordpress.com/2017/11/admin.png');
INSERT INTO person (id, id_user, email, first_name, last_name, id_workertype, url_photo) VALUES (2, 2, 'bladi@admin.com', 'Bladi', 'Del Barrio', 3, 'https://yinnepal.files.wordpress.com/2017/11/admin.png');
INSERT INTO person (id, id_user, email, first_name, last_name, id_workertype, url_photo) VALUES (3, 3, 'ivan@admin.com', 'Ivan', 'Sanchez', 2, 'https://yinnepal.files.wordpress.com/2017/11/admin.png');
INSERT INTO person (id, id_user, email, first_name, last_name, id_workertype, url_photo) VALUES (4, 4, 'claudia@admin.com', 'Claudia', 'Lorenzo', 2, 'https://buzz.tt/media/images/site/adminz/avatars/avatar5_big@2x.png');
INSERT INTO person (id, id_user, email, first_name, last_name, id_workertype, url_photo) VALUES (5, 5, 'l@admin.com', 'L', 'Killer', 3, 'https://yinnepal.files.wordpress.com/2017/11/admin.png');
INSERT INTO person (id, id_user, email, first_name, last_name, id_workertype, url_photo) VALUES (6, 6, 'monroy@admin.com', 'Sergio', 'Monroy', 1, 'https://yinnepal.files.wordpress.com/2017/11/admin.png');
