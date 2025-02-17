package com.jan20;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	class User implements Comparable<User> {
	    private String email;
	    private String name;
	    private String phone;

	    // Constructor
	    public User(String email, String name, String phone) {
	        this.email = email;
	        this.name = name;
	        this.phone = phone;
	    }

	    // Getters
	    public String getEmail() {
	        return email;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    // Comparable implementation: Compare by name
	    @Override
	    public int compareTo(User other) {
	        return this.name.compareTo(other.name);
	    }

	    // Override toString for better printing
	    @Override
	    public String toString() {
	        return "User{" +
	                "email='" + email + '\'' +
	                ", name='" + name + '\'' +
	                ", phone='" + phone + '\'' +
	                '}';
	    }
	}

	




