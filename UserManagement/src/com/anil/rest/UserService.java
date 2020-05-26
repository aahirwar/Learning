/**
 * 
 */
package com.anil.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author aahirwar
 *
 */
@Path("/userService")
@Produces(MediaType.APPLICATION_JSON)
public class UserService {
	UserDao userDao = new UserDao();
	@GET
	@Path("/users")
	public List<User> getAllUsers(){
		return userDao.getAllUsers();
	}
	@GET
	@Path("/users/{id}")
	public User getUser(@PathParam("id") int id) {
		return userDao.getUser(id);
	}

}
