package com.sparta.eng87.babypushchairwebsite.securityConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    private DataSource dataSource;
    private BCryptPasswordEncoder encoder;

    @Autowired
    public SecurityConfig(DataSource dataSource, BCryptPasswordEncoder encoder) {
        this.dataSource = dataSource;
        this.encoder = encoder;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/admin/**").authenticated()
                .antMatchers("/add-pram").hasAuthority("ADMIN")
                .anyRequest().permitAll().and().formLogin().loginPage("/login").permitAll().defaultSuccessUrl("/add-pram",true)
                .and().exceptionHandling().accessDeniedPage("/");



    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery("SELECT user_name, user_password, user_activated FROM user_entity WHERE user_name=?")
                .authoritiesByUsernameQuery("select user_name, user_role FROM user_entity where user_name=?")
                .passwordEncoder(encoder);

    }
}
