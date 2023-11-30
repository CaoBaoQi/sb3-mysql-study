package jz.cbq.sb3mysqlstudy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jz.cbq.sb3mysqlstudy.entity.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * StudentMapper
 *
 * @author cbq
 * @date 2023/11/30 21:37
 * @since 1.0.0
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {
}
