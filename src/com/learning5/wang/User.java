package com.learning5.wang;

public class User {
	
	private String userId;
	private String password;
	private static int count = 0;
	
	public User() {		
		count++;
	}
	
	public User(String userId){
		this();
		this.userId = userId;
	}
	
	public User(String userId, String password){
		this();
		this.userId = userId;
		this.password = password;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		User.count = count;
	}

	public String getInfo(){
		return "userId"+this.getUserId()+"password"+this.getPassword();
	}
}
