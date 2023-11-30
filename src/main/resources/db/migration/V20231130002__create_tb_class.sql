create table tb_squad
(
    id       int auto_increment comment '班级 id',
    squad_id varchar(128) not null comment '班号',
    name     varchar(128) null comment '班级名称',
    collage  varchar(128) null comment '所属学院',
    header   varchar(128) null comment '辅导员',
    root     varchar(128) null comment '自习室',
    constraint squad_pk
        primary key (id)
)
    comment '班级表';

