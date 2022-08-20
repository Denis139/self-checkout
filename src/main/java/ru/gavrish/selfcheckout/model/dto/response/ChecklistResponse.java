package ru.gavrish.selfcheckout.model.dto.response;

import lombok.Data;
import lombok.experimental.Accessors;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@Data
@Accessors(chain = true)
public class ChecklistResponse {
    private UUID id;
    private BigDecimal amount;
    private LocalDateTime createdAt;
    private List<ChecklistLineResponse> checklistLines = new LinkedList<>();
}