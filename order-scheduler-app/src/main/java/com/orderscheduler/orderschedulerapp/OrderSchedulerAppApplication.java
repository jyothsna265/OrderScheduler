/**
 * 	Launches the Application with scheduling
 *
 *	@author - Jyothsna Goalla Dilli Naidu
 *
 */

package com.orderscheduler.orderschedulerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class OrderSchedulerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderSchedulerAppApplication.class, args);
	}

}
