package ru.gavrish.selfcheckout.model.dto.response;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Accessors(chain = true)
public class ProductResponse {

    private UUID id;
    private String name;
    private BigDecimal price;
}
