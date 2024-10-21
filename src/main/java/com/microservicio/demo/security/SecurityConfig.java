package com.microservicio.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
         http.csrf().disable() 
            .authorizeHttpRequests()
            .requestMatchers("/h2-console/**").permitAll() 
            .requestMatchers("/api/**").permitAll()
            .anyRequest().authenticated()
            .and()
            .formLogin(); 

        http.headers().frameOptions().sameOrigin();

        return http.build();
    }
}
