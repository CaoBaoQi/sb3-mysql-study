package jz.cbq.sb3mysqlstudy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jz.cbq.sb3mysqlstudy.entity.Squad;
import jz.cbq.sb3mysqlstudy.mapper.SquadMapper;
import jz.cbq.sb3mysqlstudy.service.SquadService;
import org.springframework.stereotype.Service;

/**
 * SquadServiceImpl
 *
 * @author cbq
 * @date 2023/11/30 23:32
 * @since 1.0.0
 */
@Service
public class SquadServiceImpl extends ServiceImpl<SquadMapper, Squad> implements SquadService {
}
