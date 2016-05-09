package vn.edu.imic.quangminh.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;


public class LoginControllerTest {
	
	private LoginController controller;
	private UserDetail user;
	
	@Before
	public void setUp() {
		//Init implement class
		controller = new LoginControllerImpl();
		user = new UserDetail();
	}
	
	@Test
	public void validate_emptyUsername() {
		try {
			controller.validate(user);
			fail("Must throw exception");
		} catch (UserNotFoundException e) {
			assertEquals(ErrorCodes.EMPTY_USERNAME.code(), e.getCode());
		}
	}
	
	@Test
	public void validate_emptyUsername_case2() {
		try {
			user.setUsername("");
			controller.validate(user);
			fail("Must throw exception");
		} catch (UserNotFoundException e) {
			assertEquals(ErrorCodes.EMPTY_USERNAME.code(), e.getCode());
		}
	}
	
	@Test
	public void validate_emptyPassword() {
		try {
			user.setUsername("username");
			controller.validate(user);
			fail("Must throw exception");
		} catch (UserNotFoundException e) {
			assertEquals(ErrorCodes.EMPTY_PASSWORD.code(), e.getCode());
		}
	}
	
	@Test
	public void validate_emptyPassword_case2() {
		try {
			user.setUsername("username");
			user.setPassword("");
			controller.validate(user);
			fail("Must throw exception");
		} catch (UserNotFoundException e) {
			assertEquals(ErrorCodes.EMPTY_PASSWORD.code(), e.getCode());
		}
	}
	
	@Test
	public void validate_inValidUsername() {
		try {
			user.setUsername("username");
			user.setPassword("password");
			controller.validate(user);
			fail("Must throw exception");
		} catch (UserNotFoundException e) {
			assertEquals(ErrorCodes.INVALID_USER.code(), e.getCode());
		}
	}
	
	@Test
	public void validate_inValidPassword() {
		try {
			user.setUsername("imic");
			user.setPassword("password");
			controller.validate(user);
			fail("Must throw exception");
		} catch (UserNotFoundException e) {
			assertEquals(ErrorCodes.INVALID_USER.code(), e.getCode());
		}
	}
	
	@Test
	public void validate_valid() {
		user.setUsername("imic");
		user.setPassword("123456");
		controller.validate(user);
	}
}
