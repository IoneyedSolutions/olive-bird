package com.ioneyedsolutions.olivebird.repository;

import com.ioneyedsolutions.olivebird.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
