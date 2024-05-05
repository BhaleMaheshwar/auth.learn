package com.auth1.auth.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

public class Configuration {


    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((requests)->{
                    try{
                        requests
                                .anyRequest().permitAll()
                                .and().cors().disable()
                                .csrf().disable();
                    }catch (Exception e){
                        throw new RuntimeException(e);
                    }

                }
                );
        return http.build();
    }


}
