create table tb_course
(
    id          int auto_increment comment '课程 id',
    course_id   varchar(128)                          null comment '课程号',
    name        varchar(128)                          null comment '课程名',
    need_course varchar(128)                          null comment '先修课程',
    quality     enum ('选修', '公共必修', '专业必修') null comment '课程性质',
    score       smallint                              null comment '学分',
    constraint course_pk
        primary key (id)
)
    comment '课程表';

