package com.example.sql.modules.repository;

import com.example.sql.modules.domain.TestAreaEntity;
import com.example.sql.modules.domain.TestOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TestAreaRepo  extends JpaRepository<TestAreaEntity,Long>, JpaSpecificationExecutor {
}
