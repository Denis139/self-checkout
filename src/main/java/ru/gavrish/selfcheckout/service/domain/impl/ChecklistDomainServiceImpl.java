package ru.gavrish.selfcheckout.service.domain.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.gavrish.selfcheckout.model.dto.response.ChecklistResponse;
import ru.gavrish.selfcheckout.model.entity.Checklist;
import ru.gavrish.selfcheckout.repository.ChecklistRepository;
import ru.gavrish.selfcheckout.repository.ProductRepository;
import ru.gavrish.selfcheckout.service.domain.ChecklistDomainService;
import java.math.BigDecimal;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ChecklistDomainServiceImpl implements ChecklistDomainService {

    private final ChecklistRepository checklistRepository;
    private final ProductRepository productRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ChecklistResponse create() {
        var checklist = new Checklist();
        checklist.setAmount(new BigDecimal(0));

        checklist = checklistRepository.saveAndFlush(checklist);

        return new ChecklistResponse();
    }

    @Override
    public ChecklistResponse get() {
        return null;
    }

    @Override
    public void addProduct(UUID productId, UUID checklistId) {

    }
}
