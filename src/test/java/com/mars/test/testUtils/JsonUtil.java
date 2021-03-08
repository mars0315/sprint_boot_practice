//package com.example.mars.demo;
//
//import net.sf.json.JSONArray;
//import net.sf.json.JSONObject;
//
//public class JsonUtil {
//    public static void main(String[] args) {
//
//    }
//
//    /**
//     * 解析json，返回key+value
//     * @param obj
//     */
//    public static void readJson(Object obj) {
//        if (obj instanceof JSONArray) {
//            JSONArray jsonArray=(JSONArray) obj;
//            for (int i = 0; i <jsonArray.size() ; i++) {
//                //如果是jsonarray，获取最大数，循环获取每个jsonobject
//                Object obj1=jsonArray.get(i);
//                readJson(obj1);
//            }
//                // 如果是jsonobject
//            if (obj instanceof JSONObject) {
//                JSONObject jo=(JSONObject) obj;
//                //获取键值对，输出键值对
//
//                //如果有jsonarray
//
//            }
//        }
//    }
//}
