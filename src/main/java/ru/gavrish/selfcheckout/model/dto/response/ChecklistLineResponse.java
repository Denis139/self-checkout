package ru.gavrish.selfcheckout.model.dto.response;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Accessors(chain = true)
public class ChecklistLineResponse {

    private UUID id;
    private String productName;
    private Long count;
    private BigDecimal amount;
}
