package ru.gavrish.selfcheckout.mapper.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gavrish.selfcheckout.mapper.Mapper;
import ru.gavrish.selfcheckout.model.dto.response.ChecklistResponse;
import ru.gavrish.selfcheckout.model.entity.Checklist;

@Service
@RequiredArgsConstructor
public class ChecklistResponseMapper implements Mapper<ChecklistResponse, Checklist> {

    private final ChecklistLineResponseMapper checklistLineResponseMapper;

    @Override
    public ChecklistResponse from(Checklist source) {
        return new ChecklistResponse()
                .setId(source.getId())
                .setCreatedAt(source.getCreatedAt());
    }
}
