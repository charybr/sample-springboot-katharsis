package com.sample.domain.repo;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.domain.model.SampleRecord;

@Repository
public interface CollectionRecDbRepo extends CrudRepository<SampleRecord, UUID> {
	

}
