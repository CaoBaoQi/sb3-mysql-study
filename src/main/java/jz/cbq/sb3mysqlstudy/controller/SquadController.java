package jz.cbq.sb3mysqlstudy.controller;

import jakarta.annotation.Resource;
import jz.cbq.sb3mysqlstudy.entity.Squad;
import jz.cbq.sb3mysqlstudy.entity.Student;
import jz.cbq.sb3mysqlstudy.service.SquadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * SquadController
 *
 * @author cbq
 * @date 2023/11/30 23:34
 * @since 1.0.0
 */
@RestController
@RequestMapping("/squad")
@Slf4j
public class SquadController {
    @Resource
    SquadService squadService;

    @GetMapping("/findAll")
    public List<Squad> findAll() {
        return squadService.list();
    }
}
