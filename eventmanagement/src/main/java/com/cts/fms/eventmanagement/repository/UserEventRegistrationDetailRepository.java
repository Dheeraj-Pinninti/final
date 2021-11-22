package com.cts.fms.eventmanagement.repository;

import com.cts.fms.eventmanagement.domain.Event;
import com.cts.fms.eventmanagement.domain.User;
import com.cts.fms.eventmanagement.domain.UserEventRegistrationDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEventRegistrationDetailRepository extends JpaRepository<UserEventRegistrationDetail,Long> {

    UserEventRegistrationDetail findByUserAndEvent(User userIns, Event eventIns);
}
