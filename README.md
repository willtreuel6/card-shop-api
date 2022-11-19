# card-shop-api

drop database cardshop_db;

create database cardshop_db;

use cardshop_db;

create table admin(
	admin_id int not null auto_increment,
    first_name varchar(45),
    last_name varchar(45),
    user_name varchar(45),
    p_word varchar(45),
    primary key(admin_id)
);

create table box(
	box_id int not null auto_increment,
    box_name varchar(45),
    box_brand varchar(45),
    box_year int,
    sport varchar(45),
    price float,
    description longtext not null,
    in_stock tinyint not null,
    admin_id int,
    primary key(box_id),
    foreign key(admin_id) references admin(admin_id)
);

create table card(
	card_id int not null auto_increment,
    card_name varchar(45) not null,
    sport varchar(45),
    price varchar(45),
    description varchar(45),
    admin_id int,
    primary key(card_id),
    foreign key(admin_id) references admin(admin_id)
);

Insert into admin(admin_id,first_name,last_name,user_name,p_word)
values(1,"Will","Treuel","willtreuel6","wht1257"),
(2,"Ty","Brown","tbrown25","tb12"),
(3,"Derik","Walker","dwalk10","dwitit");

Insert into box(box_id,box_name,box_brand,box_year,sport,price,description,in_stock,admin_id)
values(1,"2022 Topps Chrome Baseball","Topps",2022,"baseball",199.99,"",1,2)

