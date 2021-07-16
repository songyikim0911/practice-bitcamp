drop table cinemamember;
create table cinemamember(
mid varchar(10) primary key,
mpw varchar(10) not null,
mname varchar(15) not null,
mpoint number(10) default(0)
);
commit;
desc cinemamember;