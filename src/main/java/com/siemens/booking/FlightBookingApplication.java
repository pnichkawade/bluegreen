package com.siemens.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FlightBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightBookingApplication.class, args);
	}
}

@RestController
class ServiceInstanceRestController {	
    @RequestMapping("/")
    public ResponseEntity<String> test() {
    	
        return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
    }
} 