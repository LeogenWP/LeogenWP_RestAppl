package com.leogenWP.myRestAPI.repository;

import com.leogenWP.myRestAPI.model.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File,Long> {
}
