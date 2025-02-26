## MySQL Query
create table user_details(
userid varchar(20) primary key,
password varchar(20),
name varchar(30),
city varchar(30),
email varchar(30),
phone varchar(10));

insert into user_details values("C1002","John1234","John","Chennai","John@gmail.com","9878909876");
insert into user_details values("C1003","Ruby12345","Ruby","Chennai","Ruby@gmail.com","7890987656");

select * from user_details;




## Git 
git init
git fetch
git checkout -b SpringDataJPA
git add .
git commit -m "Commit msg"
git remote -v
git remote add origin <repo-git-url>
git pull
git push origin :SpringDataJPA    ----- (new branch name)
git push -u origin SpringDataJPA

