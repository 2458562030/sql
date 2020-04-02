package com.example.sql.modules.repository;

import com.example.sql.modules.domain.TestOrderEntity;
import com.example.sql.modules.domain.TestUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TestUserRepo  extends JpaRepository<TestUserEntity,Long>, JpaSpecificationExecutor {
}
