create database demoradio;
use demoradio ;
create table TA_AUT_ACCOUNT (
I_id int not null primary key  AUTO_INCREMENT ,
T_username varchar (50) not null , 
T_postion varchar (10) not null,
constraint uc_I_id unique (I_id)
);
-- ta : table  , msg : Nhom cua bang , 
create table TA_CON_BROWSER (
I_id int not null primary key AUTO_INCREMENT,
I_id_User int not null , 
T_status varchar (10) not null , 
T_content varchar (50) not null ,
constraint fk_id_User foreign key (I_id_User) references TA_AUT_ACCOUNT (I_id) , 
constraint uc_I_id unique (I_id)
) ;