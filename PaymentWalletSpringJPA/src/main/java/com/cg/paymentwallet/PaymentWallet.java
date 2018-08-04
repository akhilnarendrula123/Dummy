package com.cg.paymentwallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages="com.cg.paymentwallet")
public class PaymentWallet {
	
public static void main(String[] args) {
			SpringApplication.run(PaymentWallet.class, args);
		}
}
