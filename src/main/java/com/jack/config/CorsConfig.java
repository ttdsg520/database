package com.jack.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Configuration
public class CorsConfig {

   private CorsConfiguration buildConfig() {
       CorsConfiguration corsConfiguration = new CorsConfiguration();
       corsConfiguration.addAllowedOrigin("*");
       corsConfiguration.addAllowedHeader("*");
       corsConfiguration.addAllowedMethod("*");
       corsConfiguration.setMaxAge(3600L);
       corsConfiguration.addAllowedMethod(HttpMethod.POST);
       corsConfiguration.addAllowedMethod(HttpMethod.GET);
       corsConfiguration.addAllowedMethod(HttpMethod.DELETE);
       corsConfiguration.addAllowedMethod(HttpMethod.PUT);
       corsConfiguration.addAllowedMethod(HttpMethod.OPTIONS);
       corsConfiguration.setAllowCredentials(true);
       corsConfiguration.addAllowedOriginPattern("*");
       return corsConfiguration;
   }

   @Bean
   public CorsFilter corsFilter() {
       UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
       source.registerCorsConfiguration("/**", buildConfig());
       return new CorsFilter(source);
   }

   @Bean
   public FilterRegistrationBean<CharsetFilter> charsetFilterRegistrationBean() {
       FilterRegistrationBean<CharsetFilter> registrationBean = new FilterRegistrationBean<>();
       registrationBean.setFilter(new CharsetFilter());
       registrationBean.addUrlPatterns("/*");
       return registrationBean;
   }

   class CharsetFilter extends OncePerRequestFilter {

       @Override
       protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
           response.setContentType("text/html;charset=UTF-8");
           filterChain.doFilter(request, response);
       }
   }
}
