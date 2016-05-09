package vn.edu.imic.quangminh.exceptions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LoginControllerTest {
	
	private LoginController controller;
	private UserDetail user;
	
	@Before
	public void setUp() {
		//Init implement class
		controller = null;
		user = new UserDetail();
	}
	
	@Test
	public void validate_emptyUsername() {
		try {
			controller.validate(user);
			fail("Must throw exception");
		} catch (Exception e) {
			assertEquals("empty username", e.getMessage());
		}
	}
	
	@Test
	public void validate_emptyPassword() {
		try {
			user.setUsername("username");
			controller.validate(user);
			fail("Must throw exception");
		} catch (Exception e) {
			assertEquals("empty password", e.getMessage());
		}
	}
	
	@Test
	public void validate_inValidUsername() {
		try {
			user.setUsername("username");
			user.setPassword("password");
			controller.validate(user);
			fail("Must throw exception");
		} catch (Exception e) {
			assertEquals("invalid username or password", e.getMessage());
		}
	}
	
	@Test
	public void validate_inValidPassword() {
		try {
			user.setUsername("imic");
			user.setPassword("password");
			controller.validate(user);
			fail("Must throw exception");
		} catch (Exception e) {
			assertEquals("invalid username or password", e.getMessage());
		}
	}
	
	@Test
	public void validate_valid() {
		user.setUsername("imic");
		user.setPassword("123456");
		controller.validate(user);
	}
}
