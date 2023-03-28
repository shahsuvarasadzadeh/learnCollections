package l_COLLECTION_FRAMEWORK.l_MAP;

import java.util.HashMap;
import java.util.Map;

public class A {
    public static void main(String[] args){
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("Adil","Salayev");
        hashMap.put("Shahsuvar","Asadzade");
        hashMap.put("Hulya","Avsar");
        hashMap.put("Hulya","Avdar");//You cannot store duplicate keys in HashMap. However, if you try to store duplicate key with another value, it will replace the value.
        hashMap.put("Rahaddin","Asadzade");
       for (Map.Entry m:hashMap.entrySet()){
           System.out.println(m.getKey()+" "+m.getValue());
       }
    }
}
