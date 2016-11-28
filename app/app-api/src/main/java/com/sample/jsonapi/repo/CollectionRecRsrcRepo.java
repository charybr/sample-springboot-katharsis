package com.sample.jsonapi.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.datastax.driver.core.utils.UUIDs;
import com.sample.domain.model.SampleRecord;
import com.sample.domain.repo.CollectionRecDbRepo;
import com.sample.jsonapi.resource.CollectionRecRsrc;

import io.katharsis.queryParams.QueryParams;
import io.katharsis.repository.annotations.JsonApiDelete;
import io.katharsis.repository.annotations.JsonApiFindAll;
import io.katharsis.repository.annotations.JsonApiFindAllWithIds;
import io.katharsis.repository.annotations.JsonApiFindOne;
import io.katharsis.repository.annotations.JsonApiResourceRepository;
import io.katharsis.repository.annotations.JsonApiSave;
import io.katharsis.resource.exception.ResourceNotFoundException;

@JsonApiResourceRepository(CollectionRecRsrc.class)
@Component
public class CollectionRecRsrcRepo {
	
	protected static Logger logger = LoggerFactory.getLogger(CollectionRecRsrcRepo.class);
	
	@Autowired
	private CollectionRecDbRepo collectionRecDbRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@JsonApiSave
	public <S extends CollectionRecRsrc> S save(S entity) {
		logger.debug("entity: {}", entity.toString());

		SampleRecord collectionRecord = modelMapper.map((CollectionRecRsrc)entity, SampleRecord.class);
		if( collectionRecord.getEnid() == null) {
			collectionRecord.setEnid(UUIDs.timeBased());
		}

		collectionRecord = collectionRecDbRepo.save(collectionRecord);
		CollectionRecRsrc collectionRecRsrc = modelMapper.map(collectionRecord, CollectionRecRsrc.class);
		return (S)collectionRecRsrc;
	}
	
	@JsonApiFindOne
	public CollectionRecRsrc findOne(UUID customerid, QueryParams requestParams) {
		logger.debug("in findOne" + customerid.toString());
		if (customerid == null) {
			return null;
		}

		SampleRecord collectionRecord = collectionRecDbRepo.findOne(customerid);
		if (collectionRecord == null) {
			throw new ResourceNotFoundException("collection Record not found!");
		}
		CollectionRecRsrc collectionRecRsrc = modelMapper.map(collectionRecord, CollectionRecRsrc.class);
		return collectionRecRsrc;
	}
	
	@JsonApiFindAll
	public Iterable<CollectionRecRsrc> findAll(QueryParams requestParams) {
		Iterable<SampleRecord> cList = collectionRecDbRepo.findAll();
		List<CollectionRecRsrc> rList = new ArrayList<>();
		for (SampleRecord collectionRecord : cList) {
			rList.add(modelMapper.map(collectionRecord, CollectionRecRsrc.class));
		}
		return rList;
	}
	
	@JsonApiFindAllWithIds
	public Iterable<CollectionRecRsrc> findAll(Iterable<UUID> customerIds, QueryParams requestParams) {
		Iterable<SampleRecord> cList = collectionRecDbRepo.findAll(customerIds);
		List<CollectionRecRsrc> rList = new ArrayList<>();
		for (SampleRecord collectionRecord : cList) {
			rList.add(modelMapper.map(collectionRecord, CollectionRecRsrc.class));
		}
		return rList;		
	}

	@JsonApiDelete
	public void delete(UUID customerid) {
		collectionRecDbRepo.delete(customerid);
	}

	
	

}
