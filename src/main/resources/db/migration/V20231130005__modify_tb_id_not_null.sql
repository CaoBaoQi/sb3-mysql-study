alter table cbq.tb_course
    modify course_id varchar(128) not null comment '课程号';

alter table cbq.tb_select_course
    modify student_id varchar(128) not null comment '学号';


