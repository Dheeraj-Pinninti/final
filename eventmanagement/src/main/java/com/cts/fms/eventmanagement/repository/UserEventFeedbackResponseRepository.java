package com.cts.fms.eventmanagement.repository;

import com.cts.fms.eventmanagement.domain.UserEventFeedbackResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEventFeedbackResponseRepository extends JpaRepository<UserEventFeedbackResponse,Long> {
}
