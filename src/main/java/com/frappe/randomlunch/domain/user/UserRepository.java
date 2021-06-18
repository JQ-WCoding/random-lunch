package com.frappe.randomlunch.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserVO, Long> {

}
