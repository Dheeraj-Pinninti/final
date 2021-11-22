package com.cts.fms.eventmanagement.repository;

import com.cts.fms.eventmanagement.domain.Event;
import com.cts.fms.eventmanagement.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
/**
 * This is DAO for Events
 * @author 921661
 *
 */
public interface EventRepository extends JpaRepository<Event,Long> {

    Event findByEventId(String eventId);

    List<Event> findByPoc(User poc);
}
