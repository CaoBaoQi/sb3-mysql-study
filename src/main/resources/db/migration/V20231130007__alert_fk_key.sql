alter table cbq.tb_student
    add constraint tb_student_tb_squad_squad_id_fk
        foreign key (belong_squad) references tb_squad (squad_id);

alter table cbq.tb_select_course
    add constraint tb_select_course_tb_course_course_id_fk
        foreign key (course_id) references tb_course (course_id);

alter table cbq.tb_select_course
    add constraint tb_select_course_tb_student_student_id_fk
        foreign key (student_id) references tb_student (student_id);

