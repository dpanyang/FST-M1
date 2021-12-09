package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //declaring Arraylist of String objects
		ArrayList<String> myList = new ArrayList<String>();
		// adding object to arraylist 
		myList.add("OPPO-1");
		myList.add("OPPO-2");
		myList.add("OPPO-3");
		myList.add(3,"OPPO-4");
		myList.add(1,"OPPO-5");
		
		System.out.println(myList);
		
		System.out.println(myList.get(2));
		
		System.out.println("checking test is available under arraylist or not "+myList.contains("test"));
		System.out.println("Size of arrylist- "+myList.size());
		myList.remove(3);
		System.out.println(myList.size());
		
		

	}

}
