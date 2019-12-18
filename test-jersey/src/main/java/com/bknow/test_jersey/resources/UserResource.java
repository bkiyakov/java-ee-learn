package com.bknow.test_jersey.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bknow.test_jersey.models.User;


@Path("users")
public class UserResource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser() {
		User u = new User(1, "user1");
		System.out.println(u);
		
		return u;
	}
}
