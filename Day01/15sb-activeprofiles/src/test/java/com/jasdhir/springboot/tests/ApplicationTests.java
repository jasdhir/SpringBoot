package com.jasdhir.springboot.tests;

import com.jasdhir.springboot.tests.profiles.RainingDayService;
import com.jasdhir.springboot.tests.profiles.SunnyDayService;
import com.jasdhir.springboot.tests.profiles.WeatherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ActiveProfiles({"sunny"})

class ApplicationTests {

  @Autowired
    WeatherService weatherService;

@Test
    public  void getSunnyForecast(){
    assertTrue("Today is sunny day!".equals(weatherService.forecast()));
}

}
