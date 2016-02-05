select * from TB_USER;

select * from TB_BOARD;

delete from tb_board where seq = 0;
select * from TB_BOARD_CODE;
select user_id, title, contents, board_name from tb_board where seq = 1;

Select count(seq) as no, user_id, title, contents,board_name,modifydate from tb_board;
select B.no, A.user_id, A.title, A.contents, A.board_name, A.modifydate from tb_board A,(select count(*)as no from tb_board) B;
select seq,user_id,title,contents,board_name,modifydate from tb_board;
insert into tb_user values(USER_SEQ.nextval,'Admin','Admin','Admin@admin.com','000-0000-0000',0,sysdate);
select SEQ, USER_ID, EMAIL, PHONE, AGE from TB_USER where USER_ID ='user1' and PASSWORD = '1234';
insert into tb_board values(BOARD_SEQ.nextval,'Anony',?,?,?,sysdate);
insert into tb_board values(BOARD_SEQ.nextval,'Anony','user1-Title','AnnoyContent','Anony',sysdate);

commit;


select * from tb_board;
select * from tb_user;
select * from tb_board_code;
insert into tb_board values(BOARD_SEQ.nextval,'anony','user1Title','AnnoyContent','anony',sysdate);
insert into tb_board_code values(30,'Noti');
commit;
select B.no, A.user_id, A.title, A.contents, A.board_name, A.modifydate from tb_board A,(select count(*)as no from tb_board) B;
