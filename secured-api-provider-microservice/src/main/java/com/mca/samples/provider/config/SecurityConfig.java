package com.mca.samples.provider.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .mvcMatchers("/").permitAll()
                .mvcMatchers("/v3/api-docs").permitAll()
                .anyRequest().authenticated()
                .and().cors()
                .and().oauth2ResourceServer().jwt();
        return http.build();
    }
}
