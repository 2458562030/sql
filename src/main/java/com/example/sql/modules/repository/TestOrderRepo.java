package com.example.sql.modules.repository;

import com.example.sql.modules.domain.TestOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TestOrderRepo extends JpaRepository<TestOrderEntity,Long>, JpaSpecificationExecutor {
}
