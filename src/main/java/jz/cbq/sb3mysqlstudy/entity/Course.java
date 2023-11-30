package jz.cbq.sb3mysqlstudy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Course
 *
 * @author cbq
 * @date 2023/11/30 23:07
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
    /**
     * id
     */
    @TableId(value = "id" ,type = IdType.AUTO)
    private Integer id;
    /**
     * 课程号
     */
    private String courseId;
    /**
     * 课程名称
     */
    private String name;
    /**
     * 前置课程
     */
    private String needCourse;
    /**
     * 课程性质
     */
    private String quality;
    /**
     * 绩点
     */
    private Integer score;
}
