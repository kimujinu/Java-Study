package CollectionFramework_example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] firstNames = {"KANG", "KANG", "LEE", "KANG", "CHOI", "KANG", "LEE", "KANG", "KANG", "KANG", "SHIN", "CHOI"};
        
        TreeMap<String, Integer> TreeMap = new TreeMap<>();
        
        for(int i=0;i<firstNames.length;i++) {
        	if(TreeMap.containsKey(firstNames[i])) {
        		Integer value = TreeMap.get(firstNames[i]);
        		TreeMap.put(firstNames[i], new Integer(value.intValue())+1);
        	}else {
        		TreeMap.put(firstNames[i], new Integer(1));
        	}
        }
        
        Iterator it = TreeMap.entrySet().iterator();
        
        System.out.println("= 기본 정렬 = ");
        while(it.hasNext()) {
        	Map.Entry<String, Integer> entry = (Entry<String, Integer>) it.next(); 
        	int value = entry.getValue().intValue();
        	System.out.println(entry.getKey()+" : "+ printBar('#',value)+" "+value);
        }
        
        System.out.println();
        
        Set<Map.Entry<String, Integer>> set = TreeMap.entrySet();
        List list = new ArrayList(set);
        
        Collections.sort(list,new ValueComparator());
        
        it = list.iterator();
        
        System.out.println("= 성이 많은순으로 정렬 = ");
        while(it.hasNext()) {
        	Map.Entry<String, Integer> entry = (Entry<String, Integer>) it.next();
        	int value = entry.getValue().intValue();
        	System.out.println(entry.getKey() + " : "+ printBar('#',value)+" "+value);
        }
        
	}
	 public static String printBar(char ch, int value){
	        char[] bar = new char[value];
	        for(int i=0; i<bar.length; i++){
	            bar[i] = ch;
	        }
	        
	        return new String(bar);
	    }

}

class ValueComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if (o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
			Map.Entry<String, Integer> e1 = (Entry<String, Integer>) o1;
			Map.Entry<String, Integer> e2 = (Entry<String, Integer>) o2;
			
			int v1 = e1.getValue().intValue();
			int v2 = e2.getValue().intValue();
			
			return v2-v1;
		}
		return -1;
	}
	
}
