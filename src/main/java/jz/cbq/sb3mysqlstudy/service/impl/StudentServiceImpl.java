package jz.cbq.sb3mysqlstudy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jz.cbq.sb3mysqlstudy.entity.Student;
import jz.cbq.sb3mysqlstudy.mapper.StudentMapper;
import jz.cbq.sb3mysqlstudy.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * StudentServiceImpl
 *
 * @author cbq
 * @date 2023/11/30 21:42
 * @since 1.0.0
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
}
