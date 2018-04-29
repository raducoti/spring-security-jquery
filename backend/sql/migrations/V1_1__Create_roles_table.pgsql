CREATE TABLE roles (
  id integer NOT NULL,
  role varchar(30),
  CONSTRAINT role_id_pk PRIMARY KEY (id)
);

CREATE TABLE user_role (
  user_id integer NOT NULL references users(id),
  role_id integer NOT NULL references roles(id)
);
