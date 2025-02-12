package com.jpa.test;

import java.util.List;
import java.util.Optional;

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
		
		
		//........................................for inserting multiple data........................................
//		User user = new User();
//		user.setName("shobhit");
//		user.setCity("delhi");
//		user.setStatus("i am java developer");
//		
//		User user1 = new User();
//		user1.setName("abhishek");
//		user1.setCity("baghpat");
//		user1.setStatus("frontend devloper");
//		
//		User user2 = new User();
//		user2.setName("akshu");
//		user2.setCity("dheradun");
//		user2.setStatus("noething");
//		
//		List list =  List.of(user,user1,user2);
//		Iterable<User> result =  u.saveAll(list);
//		
//		result.forEach(us->{
//			System.out.println(us);
//		});
		
		
		//........................................................for updating eisting data............................................
		
//		Optional<User> op =  u.findById(4);
//		User user = op.get();
//		user.setName("Rohit Indori");
//		u.save(user);
		
		 
		// ..............................................for fetching all user deatils................................................
		
//		Iterable<User> itr = u.findAll();
//		itr.forEach(user->{
//			System.out.println(user);
//		});
		
		//.............................................for deleting the user data.....................................................
		
//		u.deleteById(2);
		
		
		//........................................................find by name...............................................................
 		
		
//		List<User> users =  u.findByName("shobhit");
//		
//		users.forEach(us ->{
//			System.out.println(us);
//		});
		
		// ....................................................find by name and city........................................
		
		List<User> users = u.findByNameAndCity("shobhit", "delhi");
		
		printDataa(users);
		
	}
	
	public static void printDataa(List<User> a) {
		a.forEach(us ->{
			System.out.println(us);
		});
	}

}
