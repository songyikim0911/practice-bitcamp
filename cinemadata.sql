drop table cinemadata;
create table cinemadata(
ctitle varchar(30) not null,
cdate varchar(6) not null,
ctime varchar(18) not null,
cprice number(10) not null,
cseat varchar(6) not null,
cpaydate varchar(18) not null
);

commit;
desc cinemadata;