package org.ctag.monolith.domain.repository;

import org.ctag.monolith.domain.entity.ProjectEO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectEO, Byte> {
}
