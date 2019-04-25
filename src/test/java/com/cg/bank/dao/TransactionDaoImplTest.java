package com.cg.bank.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TransactionDaoImplTest {
	static TransactionDaoImpl td;
	@BeforeAll
	public static void init() {
		td = new TransactionDaoImpl();
	}

//	@Test
//	void testWithdraw() {
//		//fail("Not yet implemented");
//		
//			assertEquals(900, td.withdraw(1003, 100, 1000));
//		
//
//	}

//	@Test
//	void testDeposit() {
//		//fail("Not yet implemented");
//		
//		assertEquals(1000, td.deposit(1003, 1000, 0));
//	}
//
//	@Test
//	void testShowBalance() {
//		//fail("Not yet implemented");
//		assertEquals(20000, td.showBalance(1000));
//	}
//
	@Test
	void testFundTransfer() {
		//fail("Not yet implemented");
		assertEquals(9000, td.fundTransfer(1000, 1001, 1000));
	}

}
