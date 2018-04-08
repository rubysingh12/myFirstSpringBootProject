package com.radial.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
/*
@EnableWebSecurity
@Configuration
public class SecurityConfig {
    @Autowired
    public void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication().withUser("Garima").password("Garima").roles("USER");
    }
    @Configuration
    public static class FormLoginWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
        @Override
        public void configure(HttpSecurity http) throws Exception {
            http.csrf().disable().antMatcher("*//**").authorizeRequests().anyRequest().hasRole("USER")
                    .and().formLogin().loginPage("/login").successForwardUrl("/welcome").permitAll().and()
                    .logout().logoutSuccessUrl("/logout");
        }
    }

    @Configuration
    @Order(1)
    public static class ApiWebSecurityConfigurationAdapter extends WebSecurityConfigurerAdapter {
        protected void configure(HttpSecurity http) throws Exception {
            http.antMatcher("/studentDetails*//**").authorizeRequests().anyRequest().hasRole("ADMIN").and().httpBasic();
        }
    }
}*/
