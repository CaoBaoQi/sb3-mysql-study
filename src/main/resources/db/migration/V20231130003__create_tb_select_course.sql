create table tb_select_course
(
    id         int auto_increment comment '选课 id',
    student_id varchar(128) null comment '学号',
    course_id varchar(128) null comment '课程号',
    score      smallint     null comment '成绩',
    constraint course_pk
        primary key (id)
)
    comment '选课';

