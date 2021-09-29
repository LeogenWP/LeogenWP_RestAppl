package com.leogenWP.myRestAPI.repository;

import com.leogenWP.myRestAPI.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Long> {
}
