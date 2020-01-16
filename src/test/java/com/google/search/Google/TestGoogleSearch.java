package com.google.search.Google;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestGoogleSearch {

	RunGoogleSearch gs = new RunGoogleSearch();

	@BeforeTest
	public void launch_Browser() {
		gs.launchBrowser();
	}

	@Test
	public void enter_Url() {
		gs.enterUrl();
	}

	/*
	 * @Test public void EnterText_ToSearch() throws InterruptedException {
	 * gs.EnterTextToSearch(); }
	 */
	
}