// src/main/java/com/example/demo/config/AiFunctionConfig.java
package com.example.demo.config;

import com.example.demo.dto.WeatherRequest;
import com.example.demo.dto.WeatherResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import java.util.function.Function;

@Configuration
public class AiFunctionConfig {

    @Bean
    @Description("특정 지역의 현재 날씨 정보를 조회합니다.")
    public Function<WeatherRequest, WeatherResponse> currentWeatherFunction() {
        return request -> {
            String location = request.location();
            if (location.contains("서울")) {
                return new WeatherResponse("맑음, 기온 25도, 습도 40%");
            } else if (location.contains("부산")) {
                return new WeatherResponse("비 옴, 기온 20도, 강수확률 80%");
            } else {
                return new WeatherResponse("구름 조금, 기온 22도");
            }
        };
    }
}