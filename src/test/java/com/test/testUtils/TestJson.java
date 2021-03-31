package com.test.testUtils;//package com.example.mars.demo;
//
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//import net.sf.json.JSONArray;
//import net.sf.json.JSONObject;
//
//import java.util.*;
//
///**
//     * @author mars
//     * @date 2020-6-3
//     */
//    public class TestJson {
//
//        public static boolean aBoolean=false;
//
//
//        public static String str12="{\"api\":\"2.1\",\"message\":[\"产品\"," +
//                "\"tokken\"],\"request\":{\"ptype\":\"JK\",\"tokken\":\"A#daDSFkiwi239sdls#dsd\"}," +
//                "\"response\":{\"status\":{\"statusCode\":\"100\",\"statusMessage\":" +
//                "[\"产品类型错误\",\"tokken失效\"]},\"page\":{\"pageSize\":\"100\",\"pageIndex\":" +
//                "\"1\"},\"data\":{\"ptitle\":\"10\",\"sDate\":\"2014-12-01\",\"eDate\":" +
//                "\"2016-12-01\",\"productList\":[{\"pid\":\"RA001.jpg\",\"pname\":\"产品1.htm\"},{\"pid\":\"RA002.jp\",\"pname\":" +
//                "\"产品2.html\"}]}},\"args\":[{\"tit\":\"RA001\",\"val\":\"产品1\"},{\"tit\":\"RA002\",\"val\":\"产品2\"}]}";
//
//
//
//        public static boolean analysisNullJson(Object objJson) {
//            //判断如果传入objJson是JSONArray类型或其子类
//            if (objJson instanceof JSONArray) {
//                //强转obJson为JSONArray类型
//                JSONArray objArray = (JSONArray) objJson;
//                //循环体读取所有objArray数据
//                for (int i = 0; i < objArray.size(); i++) {
//                    //递归判断所有bojArray.get元素
//                    analysisNullJson(objArray.get(i));
//                    //TODO：此处可增加递归判断如果obJson的子类为Json则输出JSON
//                }
//            }
//            //判断如果传入objJson是JSONObject类型或其子类
//            else if (objJson instanceof JSONObject) {
//                //强转obJson为JSONObject类型
//                JSONObject jsonObject = (JSONObject) objJson;
//                //使用轻量级迭代器获取jsonObject的key值
//                Iterator it = jsonObject.keys();
//                //判断迭代器下一个元素存在
//                while (it.hasNext()) {
//                    //下一个元素转成String
//                    String key = it.next().toString();
//
//                    Object object = jsonObject.get(key);
//
//                    //如果得到的是数组
//                    if (object instanceof JSONArray) {
//                        JSONArray objArray = (JSONArray) object;
//                        analysisNullJson(objArray);
//                    }
//                    //如果key中是一个json对象
//                    else if (object instanceof JSONObject) {
//                        analysisNullJson((JSONObject) object);
//                    }
//                    //如果key中是其他
//                    else{
//                        System.out.println("[" + key + "]:" + object.toString() + " ");
//                        if (object.toString().isEmpty()&&object.toString().contains("")) {
//                            System.out.println(key+"这个元素的value为空");
//                            aBoolean=true;
//                            break;
//                        }
//                    }
//                }
//            }
//            return aBoolean;
//        }
//
//        public static boolean analysisNullJsonForSpecial(Object objJson,Boolean open,String elementName) {
//
//            //判断如果传入objJson是JSONArray类型或其子类
//            if (objJson instanceof JSONArray) {
//                //强转obJson为JSONArray类型
//                JSONArray objArray = (JSONArray) objJson;
//                //循环体读取所有objArray数据
//                for (int i = 0; i < objArray.size(); i++) {
//                    //递归判断所有bojArray.get元素
//                    analysisNullJson(objArray.get(i));
//                    //TODO：此处可增加递归判断如果obJson的子类为Json则输出JSON
//                }
//            }
//            //判断如果传入objJson是JSONObject类型或其子类
//            else if (objJson instanceof JSONObject) {
//                //强转obJson为JSONObject类型
//                JSONObject jsonObject = (JSONObject) objJson;
//                //使用轻量级迭代器获取jsonObject的key值
//                Iterator it = jsonObject.keys();
//                //判断迭代器下一个元素存在
//                while (it.hasNext()) {
//                    //下一个元素转成String
//                    String key = it.next().toString();
//
//                    Object object = jsonObject.get(key);
//
//                    //如果得到的是数组
//                    if (object instanceof JSONArray) {
//                        JSONArray objArray = (JSONArray) object;
//                        analysisNullJson(objArray);
//                    }
//                    //如果key中是一个json对象
//                    else if (object instanceof JSONObject) {
//                        analysisNullJson((JSONObject) object);
//                    }
//                    //如果key中是其他
//                    else {
//                        System.out.println("[" + key + "]:" + object.toString() + " ");
//                        if (open==true){
//                            if (object.toString().isEmpty()&&object.toString().equals("") && key.equals(elementName)) {
//                                continue;
//                            } else if (object.toString().isEmpty()) {
//                                System.out.println(key + "这个元素的value为空");
//                                aBoolean = true;
//                                break;
//                            }
//                        }else if (open==false){
//                            if (object.toString().isEmpty()&&object.toString().equals("")) {
//                                System.out.println(key + "这个元素的value为空");
//                                aBoolean = true;
//                                break;
//                            }
//
//                        }
//                    }
//                }
//            }
//            return aBoolean;
//        }
//
//
//        public static boolean analysisRulesJson(Object objJson) {
//            //判断如果传入objJson是JSONArray类型或其子类
//            if (objJson instanceof JSONArray) {
//                //强转obJson为JSONArray类型
//                JSONArray objArray = (JSONArray) objJson;
//                //循环体读取所有objArray数据
//                for (int i = 0; i < objArray.size(); i++) {
//                    //递归判断所有bojArray.get元素
//                    analysisRulesJson(objArray.get(i));
//                    //TODO：此处可增加递归判断如果obJson的子类为Json则输出JSON
//                }
//            }
//            //判断如果传入objJson是JSONObject类型或其子类
//            else if (objJson instanceof JSONObject) {
//                //强转obJson为JSONObject类型
//                JSONObject jsonObject = (JSONObject) objJson;
//                //使用轻量级迭代器获取jsonObject的key值
//                Iterator it = jsonObject.keys();
//                //判断迭代器下一个元素存在
//                while (it.hasNext()) {
//                    //下一个元素转成String
//                    String key = it.next().toString();
//
//                    Object object = jsonObject.get(key);
//
//                    //如果得到的是数组
//                    if (object instanceof JSONArray) {
//                        JSONArray objArray = (JSONArray) object;
//                        analysisRulesJson(objArray);
//                    }
//                    //如果key中是一个json对象
//                    else if (object instanceof JSONObject) {
//                        analysisRulesJson((JSONObject) object);
//                    }
//                    //如果key中是其他
//                    else{
//                        // System.out.println("[" + key + "]:" + object.toString() + " ");
//                        //TODO:check所有子集是否符合子集要求
//                        if (key.equals("image_link")&&(object.toString().indexOf(".jpg")==-1)){
//                            System.out.println(key+"："+object);
//                            aBoolean=true;
//                            break;
//                        }
//                        // else if (key.equals("url_link")&&(object.toString().indexOf(".html")==-1)){
//                        //     System.out.println(key+"："+object);
//                        //     aBoolean=true;
//                        //     break;
//                        //
//                        // }
//                        else if (key.equals("thumbnail_image_url")&&(object.toString().indexOf(".jpg")==-1)){
//                            System.out.println(key+"："+object);
//                            aBoolean=true;
//                            break;
//
//                        }else if (key.equals("menu_thumbnail")&&(object.toString().indexOf(".jpg")==-1)){
//                            System.out.println(key+"："+object);
//                            aBoolean=true;
//                            break;
//
//                        }
//                    }
//                }
//            }
//            return aBoolean;
//        }
//
//
//        public static Map<String,Object> IteratorHash(JSONObject jsonToMap){
//            Iterator<?> it = jsonToMap.keys();
//            HashMap<String, Object> RMap = new HashMap<String, Object>();
//
//            while(it.hasNext()){
//                String key = String.valueOf(it.next());
//                if(jsonToMap.get(key).getClass() == JSONArray.class){//判是否为列表
//                    if(jsonToMap.getJSONArray(key).isEmpty()){//判列表是否为空
//                        RMap.put(key,null);
//                    }else{
//
//                        List<Map<String,Object>> MapListObj=new ArrayList<Map<String,Object>>();
//                        for(Object JsonArray : jsonToMap.getJSONArray(key)){
//                            HashMap<String, Object> TempMap = new HashMap<String, Object>();
//                            if(JsonArray.getClass() == String.class){
//                                TempMap.put(key, JsonArray);
//                            }else{
//                                TempMap.putAll(IteratorHash(JSONObject.fromObject(JsonArray)));
//                            }
//                            MapListObj.add(TempMap);
//                        }
//                        RMap.put(key, (Object) MapListObj);
//                    }
//                }else if(jsonToMap.get(key).getClass() == JSONObject.class){
//
//                    RMap.put(key,jsonToMap.getJSONObject(key));
//
//                }else if(jsonToMap.get(key).getClass() == String.class || jsonToMap.get(key).getClass() == Integer.class || jsonToMap.get(key).getClass() == Long.class){
//
//                    RMap.put(key, jsonToMap.get(key));
//
//                }
//            }
//            return RMap;
//        }
//
//
//
//        public static boolean checkJsonIsNull(Object ob){
//            String joToString=ob.toString();
//            net.sf.json.JSONObject jsonObject = net.sf.json.JSONObject.fromObject(joToString);
//            boolean bl=analysisNullJson(jsonObject);
//            return bl;
//        }
//
//        public static boolean checkJsonIsNullForSpecial(Object ob,Boolean open,String elementName){
//            String joToString=ob.toString();
//            net.sf.json.JSONObject jsonObject = net.sf.json.JSONObject.fromObject(joToString);
//            boolean bl=analysisNullJsonForSpecial(jsonObject,open,elementName);
//            return bl;
//        }
//
//        public static boolean checkJsonWithRules(Object ob){
//            String joToString=ob.toString();
//            net.sf.json.JSONObject jsonObject = net.sf.json.JSONObject.fromObject(joToString);
//            boolean bl=analysisRulesJson(jsonObject);
//            return bl;
//        }
//
//
//        public static void main(String[] args) {
//
//            // boolean bl1=ju.checkJsonIsNull(str12);
//            // if (bl1==true){
//            // 	System.out.println("最终结果"+bl1);
//            // }else {
//            // 	System.out.println("最终结果"+bl1);
//            // }
//            Boolean bl2=checkJsonWithRules(str12);
//            System.out.println(bl2);
//
//            // System.out.println("从这里开始输出的都是maps");
//            // Map maps=(Map) JSON.parse(hw.getJsonStr(str12));
//            // maps.forEach((key,value)->{
//            //     System.out.println(key+":"+value);
//            // });
//
//        }
//
//
//}
