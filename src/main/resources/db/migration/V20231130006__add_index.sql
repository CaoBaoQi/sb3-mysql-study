create index tb_student_student_id_index
    on cbq.tb_student (student_id);

create unique index tb_class_class_id_uindex
    on cbq.tb_class (class_id);

create index tb_course_course_id_index
    on cbq.tb_course (course_id);

