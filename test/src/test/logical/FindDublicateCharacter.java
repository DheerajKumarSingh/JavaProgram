package test.logical;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

public class FindDublicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	//	printDublicateCharactor("java");
		try {
			printDublicateCharacterCountGeneric("ranjana");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	//  Using a boolean array
	public static void printDublicateCharacterCountGeneric(String input) throws IOException
	{
		char[] arr=input.toCharArray();
		int[] count=new int[256];
		
		for(int i=0;i<arr.length;i++) {
			count[arr[i]]=count[arr[i]]+1;
		}
		
		for (int i = 0; i < count.length; i++) {
			if(count[i]>1) {
				System.out.printf("%c,%d ",i,count[i]);
			}
		}
		
	}


		
	
	
	public static void printDublicateCharactor(String input)
	{
		char[] name=input.toCharArray();
		HashMap<Character, Integer> hashMap=new HashMap<Character, Integer>();
		for (char c : name) {
			if(hashMap.containsKey(c)) {
				int value=hashMap.get(c);
				hashMap.put(c, value+1);
			}
			else {
				hashMap.put(c, 1);
			}			
		}
		
		Set<java.util.Map.Entry<Character, Integer>> set= hashMap.entrySet();
		for (java.util.Map.Entry<Character, Integer> entry : set) {
			if(entry.getValue()>1) {
				System.out.print("dublicate  value is: "+entry.getKey()+":"+entry.getValue());
			}
		}
	}

}
