package com.pratik.journalApp.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Component
@Getter
@Setter
public class WeatherResponse{


    @Getter
    @Setter
    public class Condition{
        private String text;
        private String icon;
        private int code;
    }

    @Getter
    @Setter
    public static class Current{
       @JsonProperty("temp_c")
        private double tempC;


    }


}







