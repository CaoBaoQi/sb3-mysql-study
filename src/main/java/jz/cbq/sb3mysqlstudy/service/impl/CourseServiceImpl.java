package jz.cbq.sb3mysqlstudy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jz.cbq.sb3mysqlstudy.entity.Course;
import jz.cbq.sb3mysqlstudy.mapper.CourseMapper;
import jz.cbq.sb3mysqlstudy.service.CourseService;
import org.springframework.stereotype.Service;

/**
 * CourseServiceImpl
 *
 * @author cbq
 * @date 2023/11/30 23:31
 * @since 1.0.0
 */
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {
}
