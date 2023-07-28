package com.example.examenblancspring.Repository;

import com.example.examenblancspring.Entities.aziz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface azizRepository extends JpaRepository<aziz,Long> {
}
