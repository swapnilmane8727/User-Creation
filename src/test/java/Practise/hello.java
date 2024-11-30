package Practise;

import java.util.HashMap;
import java.util.Map;

public class hello {

	public static void main(String[] args) {

		String hello="https://www.google.com";
		String[] spiltter=hello.split("\\.", 2);
		System.out.println("1st half "+spiltter[0]); // output= https://
		System.out.println("2nd half "+spiltter[1]); // output= google.com
		
		String again=spiltter[1];
		
		String[] spilt=again.split("\\.", 2);
		String aagain=spilt[0];                      // output=google
		
		System.out.println(aagain);
		
		
		Map<String, String> map=new HashMap<>();
		map.put(aagain, hello);
		
		System.out.println("Map = Key:"+ aagain + ", Value:"+map.get(aagain));
		
		
		
	}

}
