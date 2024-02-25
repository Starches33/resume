package org.ctag.monolith.domain.repository;

import org.ctag.monolith.domain.entity.StepEO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StepRepository extends JpaRepository<StepEO, Byte> {
}
