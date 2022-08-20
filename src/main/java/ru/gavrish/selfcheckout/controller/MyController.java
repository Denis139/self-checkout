package ru.gavrish.selfcheckout.controller;

import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.stereotype.Component;
import ru.gavrish.selfcheckout.service.domain.impl.WeatherService;

@Component
@FxmlView("main-stage.fxml")
public class MyController {

    public WeatherService weatherService;

    public MyController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
}
