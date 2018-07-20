package com.labkit.vidhya.iptocountry.repository;

import com.labkit.vidhya.iptocountry.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
