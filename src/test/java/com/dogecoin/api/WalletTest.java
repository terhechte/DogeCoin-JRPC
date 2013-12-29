package com.dogecoin.api;

import static org.junit.Assert.*;

import org.junit.Test;

public class WalletTest {
	
	@Test
	public void testGetInfo() throws Exception {
		Wallet w = new Wallet();
		String actual = w.getInfo();
//		JSONObject expected = new JSONObject(
//				"{\"result\":{\"version\":60400,\"protocolversion\":60003,\""
//						+ "walletversion\":60000,\"balance\":0.00000000,\"blocks\":33284,\"connections\":12,"
//						+ "\"proxy\":\"\",\"difficulty\":361.33878958,\"testnet\":false,\"keypoololdest\":1388084960"
//						+ ",\"keypoolsize\":104,\"paytxfee\":0.00000000,\"mininput\":0.01000000,\"errors\":\"\"},"
//						+ "\"error\":null,\"id\":null}");
		assertTrue(actual.toString().contains("\"error\":null"));
		assertTrue(actual.toString().contains("\"errors\":\"\""));
//		assertEquals(expected, new JSONObject(actual));
	}

	@Test
	public void testGetPeerInfo() throws Exception {
		Wallet w = new Wallet();
		String actual = w.getPeerInfo();
		assertTrue(actual.toString().contains("\"banscore\":0"));
		assertTrue(actual.toString().contains("\"inbound\":true"));
//		assertEquals(expected, new JSONObject(actual));
	}
	
}