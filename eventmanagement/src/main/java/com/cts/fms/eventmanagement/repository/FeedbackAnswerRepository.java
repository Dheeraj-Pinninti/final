package com.cts.fms.eventmanagement.repository;

import com.cts.fms.eventmanagement.domain.FeedbackAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackAnswerRepository extends JpaRepository<FeedbackAnswer,Long> {
}
