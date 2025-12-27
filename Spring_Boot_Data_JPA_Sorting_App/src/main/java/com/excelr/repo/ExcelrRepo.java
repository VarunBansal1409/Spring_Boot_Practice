package com.excelr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelr.entity.ExcelrEntity;

public interface ExcelrRepo extends JpaRepository<ExcelrEntity, Integer> {

}
