package com.qa.opencart.utils;

import java.util.ArrayList;
import java.util.List;

public class Constants {
public static final String LOGIN_PAGE_TITLE="Account Login";
public static final String ACCOUNTS_PAGE_TITLE="My Account";
public static final String ACCOUNT_PAGE_HEADER = "opencart";
public static final String LOGIN_PAGE_URL_FRACTION = "route=account/login";
public static final int DEFAULT_TIME_OUT = 5;


public static List<String> getExpectedAccSecList() {
	List<String> expSecList=new ArrayList<String>();
	expSecList.add("My Account");
	expSecList.add("My Orders");
	expSecList.add("My Affiliate Account");
	expSecList.add("Newsletter");
	return expSecList;
}

}
