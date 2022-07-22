create table medicines(
medicine_id varchar(10) primary key,
medicine_name varchar(20),
medicine_price float(10),
exp_date varchar(10),
mfg_date varchar(10),
supplier varchar(20),
description varchar(20));



create table suppliers(supplier_id varchar(10) primary key,supplier_name varchar(20) unique,address varchar(10),phone_no varchar(10));

insert into suppliers values("sup_101","cipla","New_delhi","1234567890");


insert into medicines values("med_102","Benadryl",45.3,"12/2/24","2/2/19","cipla","cough sryp");


select * from medicines where medicine_id='med_101' or medicine_name="combiflom";

create table medicine_stock(medicine_id varchar(10) primary key,quantity int(10)) ;

insert into medicine_stock values("med_101",24);

update  medicine_stock set quantity=300 where medicine_id="med_101"; 

create table customers(customer_id int auto_increment primary key, customer_name varchar(20), mobile_no varchar(13), total_amount float(10),ref_dr varchar(20),payment_type varchar(10),bill_date varchar(20)); 

create table bill(customer_id int  ,medicine_id varchar(20),quantity int ,foreign key (customer_id) references customers(customer_id),foreign key (medicine_id) references medicines(medicine_id));

insert into customers values(null,"hello","a",'4.32',"ds","sd","ef");
select * from customers where bill_date='Sun Aug 01 14:51:25 IST 2021';

select * from bill where customer_id='" + Id + "';
insert into bill values('1',"med_101",'4');
select * from bill where customer_id='1';
