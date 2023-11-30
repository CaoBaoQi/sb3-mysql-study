package jz.cbq.sb3mysqlstudy.controller;

import jakarta.annotation.Resource;
import jz.cbq.sb3mysqlstudy.entity.Student;
import jz.cbq.sb3mysqlstudy.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * StudentController
 *
 * @author cbq
 * @date 2023/11/30 21:43
 * @since 1.0.0
 */
@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {
    @Resource
    StudentService studentService;

    @GetMapping("/findAll")
    public List<Student> findAll() {
        return studentService.list();
    }
}
