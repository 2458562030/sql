package com.example.sql.modules.repository;

import com.example.sql.modules.domain.TestOrderEntity;
import com.example.sql.modules.domain.TestUserAreaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TestUserAreaRepo  extends JpaRepository<TestUserAreaEntity,Long>, JpaSpecificationExecutor {
}
