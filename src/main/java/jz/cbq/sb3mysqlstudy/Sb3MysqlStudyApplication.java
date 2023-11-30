package jz.cbq.sb3mysqlstudy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Sb3MysqlStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sb3MysqlStudyApplication.class, args);

        log.info("Application run success ");
    }

}
