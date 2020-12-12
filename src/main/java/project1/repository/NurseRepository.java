package project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project1.entity.NurseEntity;

@Repository
public interface NurseRepository extends JpaRepository<NurseEntity, Long> {
}