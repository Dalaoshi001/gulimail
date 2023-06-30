package com.atguigu.gulimail.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 1. 整合Mybatis-Plus
 *      1) 导入依赖
 *      <dependency>
 *          <groupId>com.baomidou</groupId>
 *          <artifactId>mybatis-plus-boot-starter</artifactId>
 *          <version>3.2.0</version>
 *      </dependency>
 *
 *      2) 配置:
 *          1， 配置数据源:
 *              a) 导入数据库的驱动
 *              b) 在application.yml配置数据源相关信息
 *          2， 配置MyBatis-Plus
 *              a) 使用@MapperScan
 *              b) 告诉MyBatis-Plus, sql映射文件位置
 */
@MapperScan("com.atguigu.gulimail.product.dao")
@SpringBootApplication
public class GulimailProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailProductApplication.class, args);
    }

}
