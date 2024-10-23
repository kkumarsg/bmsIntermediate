package com.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
