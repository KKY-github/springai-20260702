package com.example.demo.tool;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

@Component
public class WeatherTools {

    @Tool(description = "특정 지역의 현재 날씨 정보를 조회합니다.")
    public String currentWeather(String location) {
        if (location.contains("서울")) {
            return "맑음, 기온 25도, 습도 40%";
        } else if (location.contains("부산")) {
            return "비 옴, 기온 20도, 강수확률 80%";
        } else {
            return "구름 조금, 기온 22도";
        }
    }
}