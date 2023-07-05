package com.codeclan.filepersonfolderlab.repositories;

import com.codeclan.filepersonfolderlab.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
