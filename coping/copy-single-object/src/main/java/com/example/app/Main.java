package com.example.app;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.SerializationUtils;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {
		
		Main main = new Main();
		
		User user = new User(18, new Credentials("username", "password"));
		User userCopy = null;
		
		userCopy = main.getUserCopyByCopyConstructor(user);
//		userCopy = main.getUserCopyByStream(user);
//		userCopy = main.getUserCopyByJson(user);
//		userCopy = main.getUserCopyBySerialization(user);
//		userCopy = main.getUserCopyBySerializationUtils(user);
		
		System.out.println("User: " + user);
		System.out.println("User Copy: " + userCopy);
		
		main.shuffleUser(userCopy);
		
		System.out.println("User after User Copy shuffle: " + user);
		System.out.println("User Copy after shuffle: " + userCopy);

	}
	
	public User getUserCopyByCopyConstructor(User user) {
		return new User(user);
	}
	
	public User getUserCopyByStream(User user) {
		
		return Stream.of(user)
				.map(p -> new User(p.getAge(), new Credentials(p.getUsername(), p.getPassword())))
				.collect(Collectors.toList())
				.get(0);
		
	}
	
	public User getUserCopyByJson(User user) {
		
		Gson gson = new Gson();
		String json = gson.toJson(user);
		return gson.fromJson(json, User.class);
		
	}
	
	public User getUserCopyBySerialization(User user) {		
		serialize(user);
		return (User)deserialize();
	}
	
	public User getUserCopyBySerializationUtils(User user) {		
		return SerializationUtils.clone(user);		
	}
	
	// ***** HELP METHODS ***** //
	
	public void shuffleUser(User user) {
		user.setAge(22);
		user.setUsername("user");
		user.setPassword("pass");
	}
	
	public void serialize(Object object) {
		
		try {
	      FileOutputStream out = new FileOutputStream("serialization.out");
	      ObjectOutputStream oos = new ObjectOutputStream(out);
	      oos.writeObject(object);
	      oos.flush();
	      oos.close();
	      out.close();
	    } catch (Exception e) {
	      System.out.println("Problem serializing: " + e);
	    }
		
	}
	
	public Object deserialize() {
		
		Object result = null;
		
		try {
	      FileInputStream in = new FileInputStream("serialization.out");
	      ObjectInputStream ois = new ObjectInputStream(in);
	      result = ois.readObject();
	      ois.close();
	      in.close();
	    } catch (Exception e) {
	      System.out.println("Problem serializing: " + e);
	    }
		
		return result;
		
	}

}

class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int age;
	private Credentials credentials;

	public User(int age, Credentials credentials) {
		this.age = age;
		this.credentials = credentials;
	}
	
	public User(User user) {
		this.age = user.getAge();
		this.credentials = new Credentials(user.getUsername(), user.getPassword());
	}

	@Override
	public String toString() {
		return "Age: " + 
				String.valueOf(age) + "; " +
				"username: " + credentials.getUsername() + "; " +
				"password: " + credentials.getPassword() + "; ";
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getUsername() {
		return credentials.getUsername();
	}
	public void setUsername(String username) {
		credentials.setUsername(username);
	}

	public String getPassword() {
		return credentials.getPassword();
	}
	public void setPassword(String password) {
		credentials.setPassword(password);
	}
	
}

class Credentials implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	
	public Credentials(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
	
}