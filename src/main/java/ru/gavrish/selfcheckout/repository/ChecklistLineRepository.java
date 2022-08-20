package ru.gavrish.selfcheckout.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gavrish.selfcheckout.model.entity.ChecklistLine;

import java.util.UUID;

@Repository
public interface ChecklistLineRepository extends JpaRepository<ChecklistLine, UUID> {
}
