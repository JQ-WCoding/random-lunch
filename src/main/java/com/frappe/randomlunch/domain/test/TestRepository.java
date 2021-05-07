package com.frappe.randomlunch.domain.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * table : test curd mapper
 */
public interface TestRepository extends JpaRepository<TestVO, Long>, JpaSpecificationExecutor<TestVO> {
}
