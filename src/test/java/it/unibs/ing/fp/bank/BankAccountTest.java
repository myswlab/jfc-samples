package it.unibs.ing.fp.bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {
	@Test
	public void defaultBalanceIsZero() throws Exception {
		assertEquals(0, new BankAccount().getBalance());
	}
}
