package com.file.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.file.entity.FileData;
import com.file.entity.ImageData;

import java.util.Optional;

public interface FileDataRepository extends JpaRepository<FileData,Integer> {
    Optional<FileData> findByName(String fileName);
    Optional<FileData> findById(long fileName);
}
