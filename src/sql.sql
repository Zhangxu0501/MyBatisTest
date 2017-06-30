
use mybatis;
DROP TABLE blog;
DROP TABLE comment;
drop TABLE testuser;
drop TABLE user;

CREATE TABLE testuser(id INT ,name VARCHAR (20),age INT);
INSERT INTO testuser VALUES (1,'zhangxu',20);


CREATE TABLE user(id INT NOT NULL auto_increment PRIMARY KEY ,uname VARCHAR (20),passwd VARCHAR (20));
INSERT INTO user VALUES (1,'zhangxu','zx199551');


CREATE TABLE blog(id INT NOT NULL auto_increment PRIMARY KEY ,title VARCHAR (200),content VARCHAR (2000),owner VARCHAR (20));
INSERT INTO blog VALUES (1,"hello erery one","i am zhngxu....","zhangxy");

CREATE TABLE comment(id INT NOT NULL auto_increment PRIMARY KEY ,comment VARCHAR (200),blog INT ,FOREIGN KEY (blog) REFERENCES blog(id));
INSERT INTO comment VALUES (1,"good!",1);
