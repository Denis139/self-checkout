package ru.gavrish.selfcheckout.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gavrish.selfcheckout.model.entity.Checklist;

import java.util.UUID;

@Repository
public interface ChecklistRepository extends JpaRepository<Checklist, UUID> {
}
