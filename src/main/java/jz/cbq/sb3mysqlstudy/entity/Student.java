package jz.cbq.sb3mysqlstudy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 学生实体类
 *
 * @author cbq
 * @date 2023/11/30 21:34
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    /**
     * id
     */
    @TableId(value = "id" ,type = IdType.AUTO)
    private Integer id;
    /**
     * 学号
     */
    private String studentId;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private String sex;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 所属班级
     */
    private String belongSquad;
    /**
     * 籍贯
     */
    private String city;

    /**
     * 课程列表
     */
    @TableField(exist = false)
    private List<Course> courses;

}
