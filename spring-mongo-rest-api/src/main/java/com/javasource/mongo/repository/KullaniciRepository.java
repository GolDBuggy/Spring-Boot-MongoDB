package com.javasource.mongo.repository;

import com.javasource.mongo.entity.Kullanici;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KullaniciRepository extends MongoRepository<Kullanici,String> {

}
