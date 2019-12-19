package com.capgemini.conferencedemo.repo;

import com.capgemini.conferencedemo.models.Demo;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepo extends JpaRepository<Demo, Long> {
}
