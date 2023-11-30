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
 * 班级实体类
 *
 * @author cbq
 * @date 2023/11/30 23:03
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Squad {
    /**
     * id
     */
    @TableId(value = "id" ,type = IdType.AUTO)
    private Integer id;
    /**
     * 班级号
     */
    private String squadId;
    /**
     * 班级名称
     */
    private String name;
    /**
     * 所属学院
     */
    private String collage;
    /**
     * 辅导员
     */
    private String header;
    /**
     * 自习室
     */
    private String squadRoom;

    /**
     * 学生列表
     */
    @TableField(exist = false)
    private List<Student> students;
}
