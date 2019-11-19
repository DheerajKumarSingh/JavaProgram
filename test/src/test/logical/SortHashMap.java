package test.logical;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class SortHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> hash=new HashMap<String,String>();
		hash.put("india", "aaa");
		hash.put("pakistan", "kkk");
		hash.put("afganistan", "ccc");
		hash.put("japan","jjj");
		
		
		ArrayList<String> arraylist=new ArrayList<String>(hash.values());
		for (String string : arraylist) {
		//	System.out.print(string+"\n");
		}

		// sort hashmap key sort by key using TreeMap if you are using any class then class should be implemented comparable/comparator 
		// interface
		
		TreeMap<String,String> treeMap=new TreeMap<String,String>(hash);
		java.util.Iterator<String> mIterator=treeMap.keySet().iterator();
		while (mIterator.hasNext()) {
			String name=mIterator.next();
		//	System.out.print(""+name+"\n");
		}
		
		
		// we are now sort the value so we are using Entry 
		
		// 1- first make set of Entry
		// 2- make ArrayList using set of Entry & sort it using comparator
		// 3- make LinkedHashMap & store order EntrySet here
	
		Set<Entry<String,String>> set=hash.entrySet();
		
		
		java.util.List<Entry<String, String>> list=new ArrayList<Entry<String,String>>(hash.entrySet());
		Collections.sort(list, new Comparator<Entry<String,String>>() {
			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		
		LinkedHashMap<String, String> linkedHashMap=new LinkedHashMap<String, String>();
		for (Entry<String, String> entry : list) {
			linkedHashMap.put(entry.getKey(), entry.getValue());
		}
		
		
		java.util.Iterator<String> iterator=linkedHashMap.keySet().iterator();
		while(iterator.hasNext()) {
			String key=iterator.next();
			System.out.print(""+linkedHashMap.get(key)+"\n");
		}
		
		for (Entry<String, String> entry : linkedHashMap.entrySet()) {
			
		}
		
		
		
	}

}
