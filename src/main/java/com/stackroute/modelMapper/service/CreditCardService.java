package com.stackroute.modelMapper.service;

import com.stackroute.modelMapper.model.CreditCard;

import java.util.List;

public interface CreditCardService {
    public CreditCard saveCard(CreditCard creditCard);
    public List<CreditCard> getCards();
}
