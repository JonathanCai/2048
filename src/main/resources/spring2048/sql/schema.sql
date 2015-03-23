create table user(
  user_id bigint identity primary key,
  username varchar(20) not null,
  password varchar(20) not null
);

create table score(
  score_id bigint not null primary key,
  scoring bigint not null,
  score_date datetime not null,
  username varchar(20) not null
);