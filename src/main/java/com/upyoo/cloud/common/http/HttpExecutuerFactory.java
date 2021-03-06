package com.upyoo.cloud.common.http;

public class HttpExecutuerFactory {

	public static HttpExecuter getDefaultExecuter(String url) {
		HttpExecuter httpExecuter = new HttpExecuter(url);
		return httpExecuter;
	}
	public static  HttpExecuter getAutoAdminTokenExecuter(String url) {
		return new HttpExecuter(url);
	}

}
