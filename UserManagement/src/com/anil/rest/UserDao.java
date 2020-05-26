/**
 * 
 */
package com.anil.rest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aahirwar
 *
 */
public class UserDao {
	
	public List<User> getAllUsers(){
		List<User> users = new ArrayList<User>();
		for(int i=1; i<6; i++) {
			users.add(new User(i,"Name"+i,"Profession"+i));
		}
		return users;
	}
 public User getUser(int id) {
	 return new User(id,"Name"+id,"Profession"+id);
 }
}
