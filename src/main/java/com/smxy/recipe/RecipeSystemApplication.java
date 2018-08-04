package com.smxy.recipe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.smxy.recipe.dao")
@SpringBootApplication
public class RecipeSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecipeSystemApplication.class, args);
    }
}
