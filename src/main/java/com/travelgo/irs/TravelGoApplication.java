package com.travelgo.irs;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.travelgo.irs.model.User;
import com.travelgo.irs.service.RegistrationService;

@SpringBootApplication
@PropertySource(value= {"classpath:configuration.properties"})
public class TravelGoApplication implements CommandLineRunner{

	@Autowired
	private Environment environment;
	@Autowired
	ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(TravelGoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		try {
			User user = new User();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter user id : ");
			String uid =sc.next();
			System.out.println("Enter password : ");
			String password=sc.next();
			System.out.println("Enter name : ");
			String name= sc.next();
			System.out.println("Enter city: ");
			String city = sc.next();
			System.out.println("Enter email: ");
			String mail = sc.next();
			System.out.println("Enter phone: ");
			String phone = sc.next();
			user.setCity(city);
			user.setEmailId(mail);
			user.setName(name);
			user.setPassword(password);
			user.setUserId(uid);
			user.setPhone(phone);
			
			RegistrationService service = (RegistrationService)context.getBean("registrationService");
			String registrationMessage = service.registerUser(user);
			System.out.println(environment.getProperty(registrationMessage));
			
		}catch (Exception e) {
			System.out.print(environment.getProperty(e.getMessage()));
		}
		
	}

}
