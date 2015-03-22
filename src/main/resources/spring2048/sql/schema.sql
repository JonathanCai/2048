create table user(
  user_id integer not null primary key,
  username varchar(20) not null,
  password varchar(20) not null
);

create table score(
  score_id integer not null primary key,
  scoring integer not null,
  score_date datetime not null,
  username varchar(20) not null
);