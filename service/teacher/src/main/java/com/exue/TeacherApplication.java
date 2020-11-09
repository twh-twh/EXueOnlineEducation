package com.exue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 86130
 */
@SpringBootApplication
@MapperScan("com.exue.mapper")
@EnableDiscoveryClient
public class TeacherApplication {
    public static void main(String[] args) {
        SpringApplication.run(TeacherApplication.class);
    }
}
