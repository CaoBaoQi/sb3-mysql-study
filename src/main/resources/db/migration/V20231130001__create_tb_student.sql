create table tb_student
(
    id           int auto_increment comment '学生 id',
    student_id   varchar(128)         not null comment '学号',
    name         varchar(128)         not null comment '姓名',
    sex          char    default '男' null comment '性别',
    age          tinyint default 20   null comment '年龄',
    belong_squad varchar(128)         null comment '所在班级',
    city         varchar(128)         null comment '籍贯',
    constraint student_pk
        primary key (id)
)
    comment '学生表';

