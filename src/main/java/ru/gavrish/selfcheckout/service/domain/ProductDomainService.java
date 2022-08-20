package ru.gavrish.selfcheckout.service.domain;

import ru.gavrish.selfcheckout.model.dto.response.ProductResponse;

import java.util.List;

public interface ProductDomainService {

    List<ProductResponse> findAll();
}
