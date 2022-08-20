package ru.gavrish.selfcheckout.service.domain.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.gavrish.selfcheckout.model.dto.response.ProductResponse;
import ru.gavrish.selfcheckout.repository.ProductRepository;
import ru.gavrish.selfcheckout.service.domain.ProductDomainService;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductDomainServiceImpl implements ProductDomainService {

    private final ProductRepository productRepository;

    @Override
    @Transactional(readOnly = true)
    public List<ProductResponse> findAll() {
        return productRepository.findAll()
                .stream()
                .map(o -> new ProductResponse()
                        .setId(o.getId())
                        .setName(o.getName())
                        .setPrice(o.getPrice()))
                .toList();
    }
}