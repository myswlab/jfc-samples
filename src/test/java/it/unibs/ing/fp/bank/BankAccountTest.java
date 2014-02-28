package it.unibs.ing.fp.bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {
	@Test
	public void defaultBalanceIsZero() throws Exception {
		assertEquals(0, new BankAccount().getBalance());
	}
	
	@Test
	public void defaultBalance() throws Exception {
		final long balance = 19;
		assertEquals(balance, new BankAccount(balance).getBalance());
	}
}
