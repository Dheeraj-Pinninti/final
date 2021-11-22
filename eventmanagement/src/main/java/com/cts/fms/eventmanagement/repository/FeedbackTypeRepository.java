package com.cts.fms.eventmanagement.repository;

import com.cts.fms.eventmanagement.domain.FeedbackType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackTypeRepository extends JpaRepository<FeedbackType,Long> {
}
