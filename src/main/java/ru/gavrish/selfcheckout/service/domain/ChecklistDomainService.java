package ru.gavrish.selfcheckout.service.domain;

import ru.gavrish.selfcheckout.model.dto.response.ChecklistResponse;

import java.util.UUID;

public interface ChecklistDomainService {

    ChecklistResponse create();

    ChecklistResponse get();

    void addProduct(UUID productId, UUID checklistId);
}
