package Codingbat;


import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MergeN {

	public static void main(String[] args){
		String[] array1 = {"f", "g", "z"};
		String[] array2 = {"c", "f", "g"};
		for(String s : mergeN(array1, array2, 3)) System.out.println(s);
	}
	
	public static String[] mergeN(String[] a, String[] b, int n){
		List<String> arrList = new ArrayList<String>();
		String[] newArr = new String[n];
		for(int i = 0; i < a.length; i++){
			arrList.add(a[i]);
			arrList.add(b[i]);
		}
		Collections.sort(arrList);
		//for(int i = 0; i < 3; i++) newArr[i] = arrList.get(i);
		Set<String> s = new LinkedHashSet<>(arrList);
		return s.toArray(newArr);
	}
}
