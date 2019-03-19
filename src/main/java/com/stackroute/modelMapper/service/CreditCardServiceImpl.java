package com.stackroute.modelMapper.service;

import com.stackroute.modelMapper.model.CreditCard;
import com.stackroute.modelMapper.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCardServiceImpl implements CreditCardService {


    @Autowired
   private Repository repository;


    public CreditCardServiceImpl(Repository repository) {
        this.repository = repository;
    }

    public CreditCardServiceImpl() {
    }

    @Override
    public CreditCard saveCard(CreditCard creditCard) {

        return this.repository.save(creditCard);
    }

    @Override
    public List<CreditCard> getCards() {

        return (List<CreditCard>)this.repository.findAll();
    }
}
