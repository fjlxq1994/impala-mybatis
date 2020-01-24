package com.lxq.impala.orm.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p></p>
 *
 * @author lixq
 * @since 2019/12/8
 */
@SpringBootApplication
@MapperScan("com.lxq.impala.orm.demo.dao")
public class OrmDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrmDemoApplication.class, args);
    }
}
