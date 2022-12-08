drop database cardshop_db;

create database cardshop_db;

use cardshop_db;

create table admin( admin_id int not null auto_increment, first_name varchar(45), last_name varchar(45), email varchar(45), p_word varchar(45), primary key(admin_id) );

create table box( box_id int not null auto_increment, box_name varchar(45), box_brand varchar(45), box_year int, sport varchar(45), price float, description longtext, in_stock int,box_image longtext, admin_id int, primary key(box_id), foreign key(admin_id) references admin(admin_id) );

create table card( card_id int not null auto_increment, card_name varchar(45), card_brand varchar(45), card_year int, sport varchar(45), price float, description longtext,card_image longtext, admin_id int, primary key(card_id), foreign key(admin_id) references admin(admin_id) );

create table email( email_id int not null auto_increment, email_address varchar(45), primary key(email_id));

create table contact(contact_id int not null auto_increment, contact_description longtext, contact_address longtext, contact_email varchar(45), contact_number varchar(45), primary key(contact_id));

Insert into admin(admin_id,first_name,last_name,email,p_word) values(1,"Will","Treuel","willtreuel6@gmail.com","wht1257"), (2,"Ty","Brown","tbrown25@gmail.com","tb12"), (3,"Derik","Walker","dwalk10@gmail.com","dwitit");

Insert into box(box_id,box_name,box_brand,box_year,sport,price,description,in_stock,admin_id) values(1,"2022 Topps Chrome Baseball","Topps",2022,"baseball",199.99,"",1,2);

Insert into card(card_id, card_name, card_brand, card_year, sport, price, description) 
values(1,"Mike Trout RC","Topps Update", 2011,"baseball",1499.99,"Mike Trout rc topps update"),
(2,"Fransisco Lindor base","Topps Chrome", 2019,"baseball",4.99,"fransisco lindor chrome base card"),
(3,"Mike Trout RC","Topps Update", 2011,"baseball",1499.99,"Mike Trout rc topps update"),
(4,"Mike Trout RC","Topps Update", 2011,"baseball",1499.99,"Mike Trout rc topps update"),
(5,"Mike Trout RC","Topps Update", 2011,"baseball",1499.99,"Mike Trout rc topps update"),
(6,"Mike Trout RC","Topps Update", 2011,"baseball",1499.99,"Mike Trout rc topps update"),
(7,"Mike Trout RC","Topps Update", 2011,"baseball",1499.99,"Mike Trout rc topps update"),
(8,"Mike Trout RC","Topps Update", 2011,"baseball",1499.99,"Mike Trout rc topps update"),
(9,"Mike Trout RC","Topps Update", 2011,"baseball",1499.99,"Mike Trout rc topps update"),
(10,"Mike Trout RC","Topps Update", 2011,"baseball",1499.99,"Mike Trout rc topps update"),
(11,"Mike Trout RC","Topps Update", 2011,"baseball",1499.99,"Mike Trout rc topps update"),
(12,"Mike Trout RC","Topps Update", 2011,"baseball",1499.99,"Mike Trout rc topps update"),
(13,"Mike Trout RC","Topps Update", 2011,"baseball",1499.99,"Mike Trout rc topps update"),
(14,"Mike Trout RC","Topps Update", 2011,"baseball",1499.99,"Mike Trout rc topps update");

insert into email(email_id,email_address)
values(1,"willtreuel6@gmail.com");

insert into contact(contact_id,contact_description,contact_address,contact_email,contact_number)
values(1,"Please feel free to reach out and speak to a member of our team. The best way to reach us would be by either phone or email. If you are close and would like to just drop in to see us, you can find our location below.",
"356 A Islington St, Portsmouth, NH 03801","willtreuel6@gmail.com","(603)998-6741");
