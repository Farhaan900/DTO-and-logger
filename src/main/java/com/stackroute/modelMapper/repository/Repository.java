package com.stackroute.modelMapper.repository;

import com.stackroute.modelMapper.model.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface Repository extends CrudRepository<CreditCard, Integer> {
}
