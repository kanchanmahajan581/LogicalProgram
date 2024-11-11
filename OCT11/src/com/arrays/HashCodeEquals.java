package com.arrays;

import java.util.Objects;

public class HashCodeEquals {
	
	private int id;
	private String name;
	
	public HashCodeEquals() {
		// TODO Auto-generated constructor stub
	}
	public HashCodeEquals(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	




	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashCodeEquals other = (HashCodeEquals) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	public static void main(String[] args) {
		
		HashCodeEquals h1=new HashCodeEquals(1,"Kanchan");
		HashCodeEquals h2=new HashCodeEquals(1,"Kanchan");
		HashCodeEquals h3=new HashCodeEquals(2,"Bob");
		
		System.out.println(h1.equals(h3));
		System.out.println(h1.equals(h2));
		
		System.out.println("-----------------");
		
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		
		System.out.println(h3.hashCode());
		
		
	}

}
