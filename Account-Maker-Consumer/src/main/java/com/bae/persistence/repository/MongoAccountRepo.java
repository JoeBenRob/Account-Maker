package com.bae.persistence.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.bae.persistence.domain.SentAccount;

@Repository
public interface MongoAccountRepo extends MongoRepository<SentAccount, Long>{
}