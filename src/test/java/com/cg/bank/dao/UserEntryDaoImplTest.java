package com.cg.bank.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cg.bank.model.CustomerDetails;

class UserEntryDaoImplTest {
	static UserEntryDaoImpl user;
	static CustomerDetails cd;
	@BeforeAll
	public static void init()
	{
		user = new UserEntryDaoImpl();
		cd = new CustomerDetails();
	}

	@Test
	void testRegister() {
		//fail("Not yet implemented");
		cd.setFirstName("sweet");
		cd.setLastName("koppisetty");
		cd.setEmailId("sweetyy@gmail.com");
		cd.setPassword("sweet");
		cd.setPancardNo(123484478L);
		cd.setAadharNo("238568790120");
		cd.setAddress("hyd");
		cd.setMobileNo("9168749893");
		cd.setBalance(0);
		int id = user.register(cd);
		assertEquals(1005, id);
	}

	@Test
	void testLogin() {
		//fail("Not yet implemented");
		cd = user.login(1000, "ramya");
		assertEquals(1000, cd.getAccountNo());
	}

}
