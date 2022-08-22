package ru.gavrish.selfcheckout.controller;

import javafx.fxml.FXML;
import lombok.RequiredArgsConstructor;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.stereotype.Component;
import ru.gavrish.selfcheckout.model.dto.response.ChecklistResponse;
import ru.gavrish.selfcheckout.model.dto.response.ProductResponse;
import ru.gavrish.selfcheckout.service.domain.ChecklistDomainService;
import ru.gavrish.selfcheckout.service.domain.impl.ProductDomainServiceImpl;
import ru.gavrish.selfcheckout.service.impl.CheckoutServiceImpl;

import java.util.List;

@Component
@FxmlView("main-stage.fxml")
@RequiredArgsConstructor
public class MyController {

   public ProductDomainServiceImpl productDomainService;
   public ChecklistDomainService checklistDomainService;
   public CheckoutServiceImpl checkoutService;
   @FXML
    public List<ProductResponse> search(String request) {
        return checkoutService.searchProduct(request);
    }
    @FXML
    public List<ProductResponse> findAll() {
        return productDomainService.findAll();
    }

    @FXML
    public ChecklistResponse add() {
        return checklistDomainService.create();
    }
}
