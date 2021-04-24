package com.msau.onboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msau.onboard.model.Onboardee;

@Repository
public interface OnboardeeRepository  extends JpaRepository<Onboardee, Long> {

}
