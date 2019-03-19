package com.stackroute.modelMapper;

import com.stackroute.modelMapper.dto.CreditCardDTO;
import com.stackroute.modelMapper.model.CreditCard;
import com.stackroute.modelMapper.service.CreditCardServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class ModelMapperApplication {

	public static void main(String[] args) {

		SpringApplication.run(ModelMapperApplication.class, args);

		CreditCard creditCardSource = new CreditCard(1234123412341234L,"Mohammed Farhaan Shaikh",400,"09/18","09/19");

		CreditCardDTO creditCardDest = new CreditCardDTO();

		ModelMapper modelMapper = new ModelMapper();

		modelMapper.map(creditCardSource,creditCardDest);

		System.out.println(creditCardDest.getNumber());
		System.out.println(creditCardDest.getName());
		System.out.println(creditCardDest.getValidFrom());
		System.out.println(creditCardDest.getValidTo());

		CreditCardServiceImpl creditCardService = new CreditCardServiceImpl();

	}

}
