CREATE TABLE spring_security.USER (
  user_id    INTEGER NOT NULL PRIMARY KEY DEFAULT nextval('storyline.utilisateur_id_seq'),
  username    VARCHAR(50) NOT NULL,
  password    VARCHAR(100) NOT NULL
);

INSERT INTO spring_security.USER(username, password) VALUES('ADMIN', 'ADMIN')