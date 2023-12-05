create table reserve(
	id int not null auto_increment,
	username varchar(20) not null,
	checkin date not null,
	checkout date not null,
	room char(1),
	primary key(id)
);

--create table cldList(
--	id int not null auto_increment,
--	title varchar(20),
--	start date,
--	end date,
--	display varchar(20),
--	color varchar(20),
--	primary key(id),
--	foreign key(id) references reserve(id) ON UPDATE cascade ON DELETE restrict
--);