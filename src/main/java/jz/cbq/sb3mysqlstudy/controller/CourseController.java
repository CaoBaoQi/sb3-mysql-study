package jz.cbq.sb3mysqlstudy.controller;

import jakarta.annotation.Resource;
import jz.cbq.sb3mysqlstudy.entity.Course;
import jz.cbq.sb3mysqlstudy.entity.Student;
import jz.cbq.sb3mysqlstudy.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * CourseController
 *
 * @author cbq
 * @date 2023/11/30 23:33
 * @since 1.0.0
 */
@RestController
@RequestMapping("/course")
@Slf4j
public class CourseController {
    @Resource
    CourseService courseService;

    @GetMapping("/findAll")
    public List<Course> findAll() {
        return courseService.list();
    }
}
