package com.cognizant.LoadCountryFromSpring;

import com.cognizant.LoadCountryFromSpring.model.Country;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.slf4j.Logger;

public class SpringLearnApplication{

	private static final Logger logger = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		logger.info("START");

		displayCountry();

		logger.info("END");
	}
	public static void displayCountry(){
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = context.getBean("country", Country.class);
		logger.debug("Country : {}", country.toString());
		System.out.println(country);
	}

}
