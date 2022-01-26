package com.concat;


public class Developer implements Concat {

	@Override
	public String concat(String first_name, String middle_name, String last_name) {
		return first_name+" "+middle_name+" "+last_name;
	}



	public static void main(String[] args) {
		Developer obj = new Developer();
		System.out.println(obj.concat("Vijay", "Popat", "Kedar"));

	}





}
