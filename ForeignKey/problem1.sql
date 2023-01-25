CREATE TABLE user (id SERIAL PRIMARY KEY, firstname varchar(100), lastname varchar(100));
INSERT INTO user (id,firstname, lastname) VALUES (1,'Gabriel', 'Twizerimana');
CREATE TABLE post (id SERIAL PRIMARY KEY,post VARCHAR(255),user_fk int REFERENCES user(id));
INSERT INTO post (post, user_fk) VALUES ('test post123', 1);