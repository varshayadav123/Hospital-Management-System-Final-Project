package com.cg.hospitalmanagement.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.hospitalmanagement.exception.UserNotFoundException;
import com.cg.hospitalmanagement.model.User;
import com.cg.hospitalmanagement.repository.UserRepository;

@Service
public class UserService {
	
		
			private UserRepository userRepository;

			public UserService(UserRepository userRepository) {
				super();
				this.userRepository = userRepository;
			}

			
			public List<User> getAlluser() {
				// TODO Auto-generated method stub
				return userRepository.findAll();
			}

			
			public User addUser(User user) {
				userRepository.save(user);
				// TODO Auto-generated method stub
				return userRepository.save(user);
			}
			
			
			
			public User getUserById(long id) {
				// TODO Auto-generated method stub
				Optional<User> optional = userRepository.findById(id);
				User user = null;
				if(optional.isPresent())
				{
					user = optional.get();
				}else {
					throw new RuntimeException("user not found for id :: "+ id);
				}
				
				return user;
			}


			public void deleteUserById(long id) {
				// TODO Auto-generated method stub
				this.userRepository.deleteById(id);
				
			}


		
			
	
			public String validateUser(String username, String password) throws UserNotFoundException {
				List<User> users = userRepository.findAll();
				Iterator<User> iterator = users.iterator();
				User user = null;
				boolean flag = false;
				while (iterator.hasNext())

				{
					user = iterator.next();
					System.out.println(user.getUsername() + " " + user.getPassword());
					System.out.println(username + " " + password);
					if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
						flag = true;
						break;
					}
				}
				if (flag) {

					if (user.getRole().equals("Doctor")) {
						System.out.println(user.getRole());

						return "doctorList";
					}
					else
						return "patientlist";

				}

				else
//					return "signIn";
					throw new UserNotFoundException("User Not Found");

			}
		}

		
		
		

		
