package myproj;

/**
 * Author: Niraj Dubey
 * 
 * How to sort a HashMap based on Object field.
 * 
 */

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortCustUsingSecNum {

	public static void main(String[] args) {
		//createCustomerObjects
		Customer cust1 = new Customer(111,"Niraj");
		Customer cust2 = new Customer(222,"Yiraj");
		Customer cust3 = new Customer(333,"Tiraj");
		Customer cust4 = new Customer(444,"Riraj");
		Customer cust5 = new Customer(555,"Eiraj");
		Customer cust6 = new Customer(666,"Wiraj");
		Customer cust7 = new Customer(777,"Qiraj");
		
		//createMapEntry
		Map<String, Customer> hm = new HashMap<>();
		hm.put("q", cust7);
		hm.put("t", cust3);
		hm.put("n", cust1);
		hm.put("y", cust2);
		hm.put("e", cust5);
		hm.put("r", cust4);
		hm.put("w", cust6);
		
		for(Map.Entry<String, Customer> aa : hm.entrySet()) {
			System.out.println(aa.getKey() + " = " + aa.getValue());
		}
		
		System.out.println();
				
		//convertHashMapToList
		List<Map.Entry<String, Customer>> list = new LinkedList<>(hm.entrySet());
		
		//sortCustomerUsingField
		//Sorts in ascending order using number.
		//Without Lambda expressions.
		Collections.sort(list, new Comparator<Map.Entry<String, Customer>>() {
			@Override
			public int compare(Entry<String, Customer> o1, Entry<String, Customer> o2) {
				//In Ascending order
				//return o1.getValue().getSocialSecurityNumber() - o2.getValue().getSocialSecurityNumber();
				//In Descending order
				return o2.getValue().getSocialSecurityNumber() - o1.getValue().getSocialSecurityNumber();
			}
		});
		//sortCustomerUsingFieldWithLambda
		//With Lambda expressions.
		list.sort((o1, o2) -> o1.getValue().getSocialSecurityNumber() - o2.getValue().getSocialSecurityNumber());
		
		//Sorts in ascending order using alphabetical order.
		//Without Lambda expressions.
		Collections.sort(list, new Comparator<Map.Entry<String, Customer>>() {
			@Override
			public int compare(Entry<String, Customer> o1, Entry<String, Customer> o2) {
				return o1.getValue().getName().compareTo(o2.getValue().getName());
			}
		});
		//With Lambda expressions.
		list.sort((o1, o2) -> o1.getValue().getName().compareTo(o2.getValue().getName()));
		
		//printCustomerHashMap
		HashMap<String, Customer> temp = new LinkedHashMap<String, Customer>(); 
        for (Map.Entry<String, Customer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        
		for(Map.Entry<String, Customer> aa : temp.entrySet()) {
			System.out.println(aa.getKey() + " = " + aa.getValue());
		}
	}

}
