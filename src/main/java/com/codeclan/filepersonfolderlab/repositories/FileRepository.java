package com.codeclan.filepersonfolderlab.repositories;

import com.codeclan.filepersonfolderlab.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
