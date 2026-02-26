package com.test;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/text")
	public String simplePlainTextResponse() {
		return "This is the Restfull web service Plain text response";
	}
	
	@GET
	@Produces
	@Path("/html/{debit}")
	public String htmlTextResponse(@PathParam("debit") String card) {
		return "<html><body><h1> Simple RestAPI HTML Response card number:"+card+" </h1></body></html>";
	}
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String greetUserResponse(@QueryParam("msg") String msg) {
		return msg;
	}.
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<UserDetails> listAllUserDetails()
	{
		UserDetails u1 = new UserDetails(1,"Rohit","Sharma","RohitSharma@gmail.com","990099");
		UserDetails u2 = new UserDetails(1,"Virat","Kohli","ViratKohli@gmail.com","224456");
		UserDetails u3 = new UserDetails(1,"Viruska","Beta","Viruska@gmail.com","884466");
		return List.of(u1,u2,u3);
	}
}
