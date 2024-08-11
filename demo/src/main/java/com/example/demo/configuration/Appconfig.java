package com.example.demo.configuration;

import com.example.demo.DataBase;
import com.example.demo.ProdDataBase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
    @Bean
    public DataBase getDBBean(){
        return  new ProdDataBase();
    }
}
