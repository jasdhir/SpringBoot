package com.jasdhir.springboot.mvc.config;

import com.jasdhir.springboot.mvc.interceprors.AdminRequestInterceptor;
import com.jasdhir.springboot.mvc.interceprors.UserRequestInterceptor;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.jasdhir.springboot.mvc" })
public class WebMvcConfig implements WebMvcConfigurer {

    @Bean
    public InternalResourceViewResolver resolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
       // resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

   /* @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setBasename("messages");
        return source;
    }*/

    @Bean
    AdminRequestInterceptor adminRequestInterceptor() {
        return new AdminRequestInterceptor();
    }

    @Bean
    UserRequestInterceptor userRequestInterceptor() {
        return new UserRequestInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(adminRequestInterceptor()).addPathPatterns("/getAdminHome");
        registry.addInterceptor(userRequestInterceptor()).addPathPatterns("/getUserHome");
    }

}