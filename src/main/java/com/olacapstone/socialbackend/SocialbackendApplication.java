package com.olacapstone.socialbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.cors.CorsConfiguration;

@SpringBootApplication
public class SocialbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialbackendApplication.class, args);
	}

	// @Bean
	// public WebMvcConfigurer configure() {
	// 	return new WebMvcConfigurer() {
	// 		@Override
	// 		public void addCorsMappings(CorsRegistry reg) {
	// 			reg.addMapping("/**").allowedOrigins("*");
	// 		}
	// 	};

	// }
	// @Bean
    // public WebMvcConfigurer corsConfigurer() {

    //     return new WebMvcConfigurer() {
    //         @Override
    //         public void addCorsMappings(CorsRegistry registry) {
    //             registry
    //                     .addMapping("/**")
    //                     .allowedMethods(CorsConfiguration.ALL)
    //                     .allowedHeaders(CorsConfiguration.ALL)
    //                     .allowedOriginPatterns(CorsConfiguration.ALL);
    //         }
    //     };
    // }
	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedMethods("*").allowCredentials(true);
            }
        };
    }

}
