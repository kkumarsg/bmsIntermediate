package com.bms.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class BmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BmsApplication.class, args);
	}
	/*

		Iphone 16
		Gaurav -> Amazon (100Rs)
		          Razorpay -> Amazon
		          100      -> 98

		Refund
		Amazon -> Gaurav
				  Razorpay -> Gaurav
				  102      -> 100

	 */
}
