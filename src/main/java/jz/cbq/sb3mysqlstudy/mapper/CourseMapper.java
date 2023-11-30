package jz.cbq.sb3mysqlstudy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jz.cbq.sb3mysqlstudy.entity.Course;
import org.apache.ibatis.annotations.Mapper;

/**
 * CourseMapper
 *
 * @author cbq
 * @date 2023/11/30 23:30
 * @since 1.0.0
 */
@Mapper
public interface CourseMapper extends BaseMapper<Course> {
}
