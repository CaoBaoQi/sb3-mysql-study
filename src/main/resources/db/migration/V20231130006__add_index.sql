create index tb_student_student_id_index
    on cbq.tb_student (student_id);

create unique index tb_squad_squad_id_uindex
    on cbq.tb_squad (squad_id);

create index tb_course_course_id_index
    on cbq.tb_course (course_id);

