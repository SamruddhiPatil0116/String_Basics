package com.prowings.stringbasics;

public class Studentname {

	//public class StudentName {
	    public static void main(String[] args) {
	        // Example names
	        String firstName = "samruddhi";
	        String middleName = "nandakumar";
	        String lastName = "patil";

	        // Capitalize the first letter of each name
	        firstName = capitalize(firstName);
	        middleName = capitalize(middleName);
	        lastName = capitalize(lastName);

	        // Display the names
	        System.out.println("Full Name: " + firstName + " " + middleName + " " + lastName);
	    }

	    // Method to capitalize the first letter of a string
	    public static String capitalize(String name) {
	        return name.substring(0, 1).toUpperCase() + name.substring(1);
	    }
	}


