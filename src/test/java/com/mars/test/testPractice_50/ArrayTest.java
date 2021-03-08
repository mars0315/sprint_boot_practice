package testDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayTest {
    public static void main(String[] args) {
//    String str[]=new String[60];
//    List<String> list=new ArrayList<>();
//    list.add("123");
//    list.add("456");
//    list.add("789");
//        System.out.println(list);

//        Set<String> sets=new HashSet<String>();
//        sets.add("123");
//        sets.add("456");
//        sets.add("789");
//        sets.add("23");
//        sets.add("a");
//        Iterator it=sets.iterator();
//        while (it.hasNext()){
//            if (it.next().equals("123")){
//            System.out.println(it.next());
//            }
//        }

        Map<String,String> maps=new HashMap<>();
        maps.put("a","123");
        maps.put("b","456");
        maps.put("c","789");
        Set<Map.Entry<String, String>> entrySet= maps.entrySet();
        for (Map.Entry<String, String> entry :entrySet
                ) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
//        System.out.println(maps);
//        JSONObject jsonObject;
//        String strs="12,34,56";
//        String[] strings=strs.split(",");
//        for (int i = 0; i <strings.length ; i++) {
//            if (strs.contains(strings[i])){
//                System.out.println("匹配成功");
//            }else {
//                System.out.println("匹配失败");
//            }
//        }

    }
}
