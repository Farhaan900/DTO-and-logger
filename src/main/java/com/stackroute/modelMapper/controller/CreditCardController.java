package com.stackroute.modelMapper.controller;

import com.stackroute.modelMapper.model.CreditCard;
import com.stackroute.modelMapper.service.CreditCardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1")
public class CreditCardController {


    CreditCardService creditCardService;
    @Autowired
    public CreditCardController(CreditCardService creditCardService) {
        this.creditCardService = creditCardService;
    }

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @PostMapping("/card")
    public ResponseEntity<CreditCard> add (@RequestBody CreditCard creditCard)
    {
        CreditCard tempCard = creditCardService.saveCard(creditCard);
//        try{
//            throw new Exception();
//        }
//        catch(Exception e) {
            logger.debug("Gaand phaad dunga");
            logger.info("Gaand phaad dunga part 2");
//        }
        return new ResponseEntity<>(tempCard, HttpStatus.CREATED);
    }

    @GetMapping("/cards")
    public ResponseEntity<List<CreditCard>> get(){
        return new ResponseEntity<>(creditCardService.getCards(), HttpStatus.OK);

    }
}
