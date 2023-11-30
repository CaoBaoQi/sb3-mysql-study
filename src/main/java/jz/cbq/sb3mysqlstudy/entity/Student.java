package jz.cbq.sb3mysqlstudy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Student
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
    @TableId(value = "id" ,type = IdType.AUTO)
    private Integer id;
    private String studentId;
    private String name;
    private String sex;
    private Integer age;
    private String belongClass;
    private String city;
}
