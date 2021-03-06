package com.TECHSUB.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.TECHSUB.Models.Region;
import com.TECHSUB.Models.Sondage;
@CrossOrigin("*")
@RepositoryRestResource
public interface ISondageRepository extends JpaRepository<Sondage, Long>{
	@RestResource(path="/bySondage")
	public Page<Sondage> findBySondageContaining(@Param("mc") String Sondage,Pageable pageable);
}
