package ru.gavrish.selfcheckout.controller;

import lombok.RequiredArgsConstructor;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.stereotype.Component;
import ru.gavrish.selfcheckout.service.domain.impl.WeatherService;

@Component
@FxmlView("main-stage.fxml")
@RequiredArgsConstructor
public class MyController {

    public WeatherService weatherService;

    public MyController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
}
