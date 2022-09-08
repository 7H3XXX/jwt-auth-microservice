package com.bezkoder.spring.security.postgresql.repository;

import java.util.List;
import java.util.Optional;

import com.bezkoder.spring.security.postgresql.models.Agency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AgencyRepository extends JpaRepository<Agency, Long> {
    Optional<Agency> findAgencyByName(Agency name);
    List<Agency> findByCity(String city);
}