package com.TECHSUB.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.TECHSUB.Models.Consommable;
import com.TECHSUB.Models.Region;
@CrossOrigin("*")
@RepositoryRestResource
public interface IConsommableRepository extends JpaRepository<Consommable, Long> {
	@RestResource(path="/byNom")
	public Page<Consommable> findByNomContaining(@Param("mc") String nom,Pageable pageable);
}
