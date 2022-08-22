package ru.gavrish.selfcheckout.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gavrish.selfcheckout.model.dto.response.ChecklistResponse;
import ru.gavrish.selfcheckout.model.dto.response.ProductResponse;
import ru.gavrish.selfcheckout.service.CheckoutService;
import ru.gavrish.selfcheckout.service.domain.ChecklistDomainService;
import ru.gavrish.selfcheckout.service.domain.ProductDomainService;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CheckoutServiceImpl implements CheckoutService {

    private final ProductDomainService productDomainService;
    private final ChecklistDomainService checklistDomainService;

    @Override
    public List<ProductResponse> getAll() {
        return productDomainService.findAll();
    }

    @Override
    public List<ProductResponse> searchProduct(String request) {
        return productDomainService.findAll()
                .stream()
                .filter(o -> o.getName().startsWith(request))
                .toList();
    }

    @Override
    public ChecklistResponse getOrCreateChecklist() {


        return null;
    }

    @Override
    public void addProduct(UUID productId, int count, UUID checklistId) {

    }

    @Override
    public void deleteProduct(UUID productId, int count, UUID checklistId) {
    }

    @Override
    public void pay(BigDecimal money) {

    }
}
