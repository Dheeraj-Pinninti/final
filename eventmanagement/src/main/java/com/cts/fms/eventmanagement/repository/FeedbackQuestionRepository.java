package com.cts.fms.eventmanagement.repository;

import com.cts.fms.eventmanagement.domain.FeedbackQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackQuestionRepository extends JpaRepository<FeedbackQuestion,Long> {
}
