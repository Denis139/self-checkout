package ru.gavrish.selfcheckout.mapper.impl;

import org.springframework.stereotype.Service;
import ru.gavrish.selfcheckout.mapper.Mapper;
import ru.gavrish.selfcheckout.model.dto.response.ChecklistLineResponse;
import ru.gavrish.selfcheckout.model.entity.ChecklistLine;

@Service
public class ChecklistLineResponseMapper implements Mapper<ChecklistLineResponse, ChecklistLine> {

    @Override
    public ChecklistLineResponse from(ChecklistLine source) {
        return new ChecklistLineResponse();
    }
}
