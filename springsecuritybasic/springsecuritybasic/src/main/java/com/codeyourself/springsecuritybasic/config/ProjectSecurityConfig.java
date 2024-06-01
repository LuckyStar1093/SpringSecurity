package com.codeyourself.springsecuritybasic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ProjectSecurityConfig {

//    @Bean
//    SecurityFilterChain defaultSecurityFilterChain1(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests((requests) -> requests.requestMatchers("myAccounts",
//                        "myBalance",
//                        "myLoans").
//                authenticated()
//                .requestMatchers("/welcome").permitAll()
//        );
//        http.formLogin(withDefaults());
//        http.httpBasic(withDefaults());
//        return http.build();
//    }

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) -> requests.anyRequest().denyAll()
        );
//        http.formLogin(withDefaults());
//        http.httpBasic(withDefaults());
        return http.build();
    }
}
