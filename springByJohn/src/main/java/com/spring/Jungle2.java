package com.spring;

import java.util.*;

public class Jungle2 {
	
	private Map<String, String> foods;
	
	//  = new HashMap<String, String>()

	public void setFood(Map<String, String> foods) {
		this.foods = foods;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<String, String> entry :foods.entrySet() ){
			sb.append(entry.getKey() + ":" + entry.getValue());
			sb.append("\n");
		}
		return sb.toString();
	}
	

}

/*						How to set Map in a Jungle bean in mapbean.xml
 * 
 * 1. right click jungle bean and choose select<property> element --> give it a name " foods"
 * 2. right click "foods" and choose insert<props> element
 * 3. right click "props" and choose insert<prop> element --> then give the name of the key
 * 		that u want to set in the map
 * 4. Then do to source page and type the name of the food in between <prop></prop>
 * 5. you can give more element
 * 
 * Ex. is in mapbean.xml
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
