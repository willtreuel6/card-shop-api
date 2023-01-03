drop database cardshop_db;

create database cardshop_db;

use cardshop_db;

create table admin( admin_id int not null auto_increment, first_name varchar(45), last_name varchar(45), email varchar(45), p_word varchar(45), primary key(admin_id) );

create table box( box_id int not null auto_increment, box_name varchar(45), box_brand varchar(45), box_year int, sport varchar(45), price float, description longtext, in_stock int,box_image longtext, admin_id int, primary key(box_id), foreign key(admin_id) references admin(admin_id) );

create table card( card_id int not null auto_increment, card_name varchar(45), card_brand varchar(45), card_year int, sport varchar(45), price float, description longtext,card_image longtext, admin_id int, primary key(card_id), foreign key(admin_id) references admin(admin_id) );

create table email( email_id int not null auto_increment, email_address varchar(45), primary key(email_id));

create table contact(contact_id int not null auto_increment, contact_description longtext, contact_address longtext, contact_email varchar(45), contact_number varchar(45), primary key(contact_id));

create table about(about_id int not null auto_increment, about_name varchar(45), about_description longtext, primary key(about_id));

create table home(home_id int not null auto_increment, home_banner_bold varchar(45), home_banner_text longtext, home_title longtext,home_title_two longtext, home_description longtext, primary key(home_id));

create table footer(footer_id int not null auto_increment, footer_bold longtext, footer_text longtext, primary key(footer_id));

create table faq(faq_id int not null auto_increment, faq_bold_header longtext, faq_description longtext, faqQOne longtext, faqQTwo longtext, faqQThree longtext, faqQFour longtext, faqAOne longtext, faqATwo longtext, faqAThree longtext, faqAFour longtext, faq_bold_foot longtext, faq_foot_description longtext, primary key(faq_id));

Insert into admin(admin_id,first_name,last_name,email,p_word) values(1,"Will","Treuel","willtreuel6@gmail.com","wht1257"), (2,"Ty","Brown","tbrown25@gmail.com","tb12"), (3,"Derik","Walker","dwalk10@gmail.com","dwitit");

insert into faq
values(1,"Frequently Asked Questions","Please refer to the questions below to see frequently asked questions from our customers.","What are your store hours?","Do you carry non-sport cards, such as Magic or Pokemon?","Do you have an ebay store with listings?","Are you open on New Years Day?","We are open 9AM-5PM monday through friday.","I'm sorry we only carry sport cards.","Yes we do please visit our ebay store @ ebay.com/rochestersportcards","Yes! We are open on January 1st 2023.","Still Have Questions?","Please click the link below to see the different ways to contact us!");


Insert into box(box_id,box_name,box_brand,box_year,sport,price,description,in_stock,box_image,admin_id) 
values(1,"2022 Topps Chrome Baseball","Topps",2022,"baseball",199.99,"",1,"../../../assets/images/2022toppschrome.png",2),
(2,"2022 Topps Update","Topps",2022,"baseball",99.99,"",1,"../../../assets/images/2022toppsupdate.jpg",2),
(3,"2022 Bowman Blaster","Topps",2022,"baseball",24.99,"",8,"../../../assets/images/2020bowmanblaster.jpg",2),
(4,"2021 Panini Prizm Football","Panini",2021,"football",249.99,"",8,"../../../assets/images/2021paniniprizmfootball.jpg",2),
(5,"2020 Panini Select Football","Panini",2020,"football",1499.99,"",8,"../../../assets/images/2020paniniselectfootball.jpg",2),
(6,"2022 Panini Select UFC","Panini",2022,"mma",299.99,"",3,"../../../assets/images/2022paniniselectufc.jpg",2);

Insert into card(card_id, card_name, card_brand, card_year, sport, price, description, card_image) 
values(1,"Mike Trout RC","Topps Update", 2011,"baseball",1499.99,"Mike Trout rc topps update","../../../assets/images/miketroutrc.jpg"),
(2,"Fransisco Lindor RC","Bowman Chrome", 2015,"baseball",49.99,"fransisco lindor bowman chrome base RC","../../../assets/images/fransiscobowmanrc.jpg"),
(3,"Mickey Mantle RC","Topps", 1952,"baseball",99999.99,"1952 Topps MIckey Mantle RC Grade 8","../../../assets/images/mickeymantlerc.jpg"),
(4,"Chris Sale Topps Opening Day","Topps Opening Day", 2017,"baseball",3.99,"2017 Chris Sale Topps opening day card","../../../assets/images/chrissaleopeningday.jpg"),
(5,"Mike Trout RC","Topps Update", 2011,"baseball",1499.99,"Mike Trout rc topps update","../../../assets/images/miketroutrc.jpg"),
(6,"Mike Trout RC","Topps Update", 2011,"baseball",1499.99,"Mike Trout rc topps update","../../../assets/images/miketroutrc.jpg"),
(7,"Mike Trout RC","Topps Update", 2011,"baseball",1499.99,"Mike Trout rc topps update","../../../assets/images/miketroutrc.jpg"),
(8,"Mike Trout RC","Topps Update", 2011,"baseball",1499.99,"Mike Trout rc topps update","../../../assets/images/miketroutrc.jpg"),
(9,"Mike Trout RC","Topps Update", 2011,"baseball",1499.99,"Mike Trout rc topps update","../../../assets/images/miketroutrc.jpg");



insert into email(email_id,email_address)
values(1,"willtreuel6@gmail.com");

insert into contact(contact_id,contact_description,contact_address,contact_email,contact_number)
values(1,"Please feel free to reach out and speak to a member of our team. The best way to reach us would be by either phone or email. If you are close and would like to just drop in to see us, you can find our location below.",
"356 A Islington St, Portsmouth, NH 03801","willtreuel6@gmail.com","(603)998-6741");

insert into about(about_id, about_name, about_description)
values(1,"Meet the Team","Hello and welcome to our website, we are thrilled that you have landed here and are browsing around our shop, please join us in our passion for sport trading cards. Ever since we were kids we loved collecting cards and busting open packs of cards.");

insert into home
values(1,"🔥 New Inventory!","View an always up to date list of our shops inventory.","Find The Best Deals"," In Your Area", "To be notified about all of our weekly deals, please enter your email address below to be notified.");

insert into footer
values(1,"© 2023 Topps, Inc","Rochester's Most premier Card Shop Established in 2021");
