create database bookdb;
use bookdb;
create table book
(
	book_isbn varchar(20) primary key,
	book_title varchar(50),
	category varchar(20),
	no_of_books int
);
create table author
(
	author_name varchar(30),
	author_mail_id varchar(50),
	book_isbn varchar(20),
	foreign key(book_isbn) references book(book_isbn)
);
create table student
(
	usn varchar(20) primary key,
	name varchar(30) not null
);
create table book_issue
(
	issue_id int primary key auto_increment,
	usn varchar(20) not null,
	issue_date date,
	return_date date,
	book_isbn varchar(20),
	foreign key(usn) references student(usn),
	foreign key(book_isbn) references book(book_isbn)
);
create table admin
(
	admin_id varchar(20) primary key,
	password varchar(20)
);
insert into admin values('kaushal','123456');