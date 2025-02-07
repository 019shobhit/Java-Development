package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.enteties.User;

@SpringBootApplication
public class JpaExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(JpaExampleApplication.class, args);
		UserRepository u =  context.getBean(UserRepository.class);
		
		User user = new User();
//		user.setId(10);
		user.setName("shobhit");
		user.setCity("delhi");
		user.setStatus("i am java developer");
		
		User user1 = u.save(user);
		System.out.println(user1);
		
	}

}
