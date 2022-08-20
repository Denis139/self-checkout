package ru.gavrish.selfcheckout.service;

import ru.gavrish.selfcheckout.model.dto.response.ChecklistResponse;
import ru.gavrish.selfcheckout.model.dto.response.ProductResponse;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public interface CheckoutService {

    List<ProductResponse> getAll();

    List<ProductResponse> searchProduct(String request);

    ChecklistResponse getOrCreateChecklist();

    void addProduct(UUID productId, int count, UUID checklistId);

    void deleteProduct(UUID productId, int count, UUID checklistId);

    void pay(BigDecimal money);
}
