//package laiyi.web.interfaceAnalyze;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import org.codehaus.jackson.JsonParseException;
//import org.codehaus.jackson.map.JsonMappingException;
//import org.codehaus.jackson.map.ObjectMapper;
//import net.sf.json.JSONObject;



//public class JsonAnalyze {
//	private static ObjectMapper mapper = new ObjectMapper();
//	private static List<String[]> treeList=new ArrayList<String[]>();
//	private static  String num="1";
//
//	private static String jsonStr = "{\"api\":\"2.1\",\"message\":[\"产品\"," +
//			"\"tokken\"],\"request\":{\"ptype\":\"JK\",\"tokken\":\"A#daDSFkiwi239sdls#dsd\"}," +
//			"\"response\":{\"status\":{\"statusCode\":\"500\",\"statusMessage\":" +
//			"[\"产品类型错误\",\"tokken失效\"]},\"page\":{\"pageSize\":\"100\",\"pageIndex\":" +
//			"\"1\"},\"data\":{\"ptitle\":\"all product lists\",\"sDate\":\"2014-12-01\",\"eDate\":" +
//			"\"2016-12-01\",\"productList\":[{\"pid\":\"RA001\",\"pname\":\"产品1\"},{\"pid\":\"RA002\",\"pname\":" +
//			"\"产品2\"}]}},\"args\":[{\"tit\":\"RA001\",\"val\":\"产品1\"},{\"tit\":\"RA002\",\"val\":\"产品2\"}]}";
//
//
//	private static String str=
//		"{\"code\":10000,\"message\":\"成功\",\"token\":null,\"data\"" +
//		":{\"pageCount\":1,\"pageSize\":10,\"pageNum\":1,\"count\":2,\"list\":[{\"videoId\":1174,\"videoTitle\"" +
//		":\"要舞就舞出青春来！\",\"videoDescription\":\"现实中的我与镜中我完美碰撞，绚烂动感的舞蹈，舞出了青春，舞出了活力，你不会今天才知道，" +
//		"返老还童不是梦吧？|Evian依云\",\"videoCoverUrl\":\"http://7u2klj.com2.z0.glb.clouddn.com/YbobvshwlJmemWzc8HaaRw8HIT8=/" +
//		"Fg7Raj5uJxzx9Znb7gj7PfUm6wRr\",\"approveTimes\":8,\"playTimes\":10,\"shareTimes\":0,\"commentCount\":0}," +
//		"{\"videoId\":3137,\"videoTitle\":\"专业碰瓷二十年的喵主子，朕摔倒了要铲屎的\",\"videoDescription\":\"111专业碰瓷二十年的喵主子，" +
//		"朕摔倒了要铲屎的亲亲才能站起来323\",\"videoCoverUrl\":\"http://7u2klj.com2.z0.glb.clouddn.com/201606153171038ggdwK_000001.jpg\"," +
//		"\"approveTimes\":6,\"playTimes\":16,\"shareTimes\":0,\"commentCount\":0}]}}";
//
//	private static String str2=
//			"{\"code\":10000,\"message\":\"成功\",\"token\":null,\"data\"" +
//			":{\"pageCount\":1,\"pageSize\":10}}";
//
//	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
//	    //测试通过json获取Object对象
////		JsonAnalyze jz=new JsonAnalyze();
////		Object obj = jz.getObjectByJson(jsonStr,"args",TypeEnum.arrayList); //层级递归String
////		System.out.println(obj);
//
//		JSONObject jObject=JSONObject.fromObject("{\"abc\":\"123\"}");
//
////		JSONObject jObject=JSONObject.fromObject(jsonStr);
////		JSONArray jArray=jObject.getJSONArray("args");
////		System.out.println(jArray.size());
//
////		List<Map<String, String>> json=(ArrayList<Map<String,String>>)obj;
////        System.out.println("API:"+json.get(1).get("pid"));
////
//        //Object obj = getObjectByJson(jsonStr,"response.page",TypeEnum.map);  //层级递归Map
//        //System.out.println("API:"+obj.toString()+((Map)obj).get("pageSize"));
//
//        //测试Objectz转json
//        /*
//        Map mapPars = new HashMap();
//        mapPars.put("agentCode", "SH0001");
//        mapPars.put("date", "2014-01-10");
//        mapPars.put("url", "http://www.map.com/maps.jsp?tag=2");
//
//        Map mapArgs = new HashMap();
//        mapArgs.put("query", mapPars);
//
//        Map maps = new HashMap();
//        maps.put("request", mapArgs);
//        maps.put("date", "2014-10-10");
//
//        System.out.println(getObjectByJson(maps));
//        */
////		List<String[]> s =JsonAnalyze.jsonTreeToExcel(str2,1);
////
////		for (int i = 0; i < s.size(); i++) {
////			String[] ss = s.get(i);
////			String str ="";
////			for (int j = 0; j < ss.length; j++) {
////				str+= ss[j]+" ";
////			}
////			System.out.println(str);
////		}
//
//	}
//
//
//	public static String getObjectToJson(Object obj) {
//		String str = "";
//		try {
//			str = mapper.writeValueAsString(obj);
//		} catch (Exception e) {
//			System.out
//					.println("###[Error] getObjectToJson() " + e.getMessage());
//		}
//		return str;
//	}
//
//	public static List<String[]> jsonTreeToExcel(String jsonstr,int nub) throws JsonParseException, JsonMappingException, IOException{
//		 num = nub+"";
//		 Map maps = mapper.readValue(jsonstr, Map.class);
//		 treeList=new ArrayList<String[]>();
//	     viewJsonTree(maps,"root");
//	     return treeList;
//	}
//
//
//	public static Object viewJsonTree(Object m,String father) {
//		if (m == null) {
//			System.out.println("over...");
//			return false;
//		}
//
//		try {
//			Map mp = null;
//			List ls = null;
//			if (m instanceof Map || m instanceof LinkedHashMap) {
//				mp = (LinkedHashMap) m;
//				for (Iterator ite = mp.entrySet().iterator(); ite.hasNext();) {
//					Map.Entry e = (Map.Entry) ite.next();
//
//					if (e.getValue() instanceof String) {
//						System.out.println("[string]" + e.getKey() + " | "
//								+ e.getValue());
//						treeList.add(new String[]{num,e.getKey().toString(),father,"String",e.getValue().toString(),""});
//					} else if (e.getValue() instanceof LinkedHashMap) {
//						System.out.println("{map}" + e.getKey() + " | "
//								+ e.getValue());
//						treeList.add(new String[]{num,e.getKey().toString(),father,"Map","",""});
//						viewJsonTree((LinkedHashMap) e.getValue(),e.getKey().toString());
//					} else if (e.getValue() instanceof ArrayList) {
//						System.out.println("[arrayList]" + e.getKey() + " | "
//								+ e.getValue());
//						treeList.add(new String[]{num,e.getKey().toString(),father,"List","",""});
//						viewJsonTree((ArrayList) e.getValue(),e.getKey().toString());
//					} else if (e.getValue() instanceof Integer){
//						System.out.println("[int]" + e.getKey() + " | "
//								+ e.getValue());
//						treeList.add(new String[]{num,e.getKey().toString(),father,"Int",e.getValue().toString(),""});
//					} else if (e.getValue() instanceof Double){
//						System.out.println("[double]" + e.getKey() + " | "
//								+ e.getValue());
//						treeList.add(new String[]{num,e.getKey().toString(),father,"Double",e.getValue().toString(),""});
//					} else if (e.getValue() == null){
//						System.out.println("[null]" + e.getKey() + " | "
//								+ e.getValue());
//						treeList.add(new String[]{num,e.getKey().toString(),father,"Null","null",""});
//					}
//
//				}
//			}
//			if (m instanceof List || m instanceof ArrayList) {
//				ls = (ArrayList) m;
//				for (int i = 0; i < ls.size(); i++) {
//					if (ls.get(i) instanceof LinkedHashMap) {
//						viewJsonTree((LinkedHashMap) ls.get(i),father);
//					} else if (ls.get(i) instanceof ArrayList) {
//						viewJsonTree((ArrayList) ls.get(i),father);
//					}
//				}
//			}
//			System.out.println();
//		} catch (Exception e) {
//			System.out.println("###[Error] viewJsonTree() " + e.getMessage());
//		}
//		return null;
//	}
//
//	private int i = 0;
//
//	/** 复杂嵌套Json获取Object数据  */
//	public Object getObjectByJson(String jsonStr, String argsPath,
//			TypeEnum argsType) {
//		if (argsPath == null || argsPath.equals("") || argsType == null) {
//			return null;
//		}
//
//		Object obj = null;
//		try {
//			Map maps = mapper.readValue(jsonStr, Map.class);
//			//多层获取
//			if (argsPath.indexOf(".") >= 0) {
//				//类型自适应
//				obj = getObject(maps, argsPath, argsType);
//			} else { //第一层获取
//				if (argsType == TypeEnum.string) {
//					obj = maps.get(argsPath).toString();
//				}else if (argsType == TypeEnum.Int) {
//					obj = (Integer)maps.get(argsPath);
//				}else if (argsType == TypeEnum.Double) {
//					obj = (Double)maps.get(argsPath);
//				}else if (argsType == TypeEnum.map) {
//					obj = (Map) maps.get(argsPath);
//				}else if (argsType == TypeEnum.arrayList) {
//					obj = (List) maps.get(argsPath);
//				}else if (argsType == TypeEnum.arrayMap) {
//					obj = (List<Map>) maps.get(argsPath);
//				}else if (argsType == TypeEnum.Null){
//					obj = maps.get(argsPath);
//				}
//			}
//		} catch (Exception e) {
//			System.out
//					.println("###[Error] getObjectByJson() " + e.getMessage());
//			return obj;
//		}
//		i = 0;
//		return obj;
//	}
//
//
//	private Object getObject(Object m, String key, TypeEnum type) {
//		if (m == null) {
//			return null;
//		}
//		Object o = null;
//		Map mp = null;
//		List ls = null;
//		try {
//
//			if (m instanceof Map || m instanceof LinkedHashMap) {
//				mp = (LinkedHashMap) m;
//				for (Iterator ite = mp.entrySet().iterator(); ite.hasNext();) {
//					Map.Entry e = (Map.Entry) ite.next();
//
//					if (i < key.split("\\.").length
//							&& e.getKey().equals(key.split("\\.")[i])) {
//						i++;
//						if (e.getValue() instanceof String) {
//							if (i == key.split("\\.").length) {
//								o = e.getValue();
//								return o;
//							}
//						}else if (e.getValue() instanceof Integer) {
//							if (i == key.split("\\.").length) {
//								o = e.getValue();
//								return o;
//							}
//						}else if (e.getValue() instanceof Double) {
//							if (i == key.split("\\.").length) {
//								o = e.getValue();
//								return o;
//							}
//						}else if (e.getValue() instanceof LinkedHashMap) {
//							if (i == key.split("\\.").length) {
//								if (type == TypeEnum.map) {
//									o = (LinkedHashMap) e.getValue();
//									return o;
//								}
//							} else {
//								o = getObject((LinkedHashMap) e.getValue(),
//										key, type);
//							}
//							return o;
//						} else if (e.getValue() instanceof ArrayList) {
//							if (i == key.split("\\.").length) {
//								if (type == TypeEnum.arrayList) {
//									o = (ArrayList) e.getValue();
//									return o;
//								}
//								if (type == TypeEnum.arrayMap) {
//									o = (ArrayList<Map>) e.getValue();
//									return o;
//								}
//							} else {
//								o = getObject((ArrayList) e.getValue(), key,
//										type);
//							}
//							return o;
//						}
//					}
//				}
//			}
//
//			if (m instanceof List || m instanceof ArrayList) {
//				ls = (ArrayList) m;
//				for (int i = 0; i < ls.size(); i++) {
//					if (ls.get(i) instanceof LinkedHashMap) {
//						if (i == key.split("\\.").length) {
//							if (type == TypeEnum.map) {
//								o = (LinkedHashMap) ls.get(i);
//								return o;
//							}
//						} else {
//							o = getObject((LinkedHashMap) ls.get(i), key, type);
//						}
//						return o;
//					} else if (ls.get(i) instanceof ArrayList) {
//						if (i == key.split("\\.").length) {
//							if (type == TypeEnum.arrayList) {
//								o = (ArrayList) ls.get(i);
//								return o;
//							}
//							if (type == TypeEnum.arrayMap) {
//								o = (ArrayList<Map>) ls.get(i);
//								return o;
//							}
//						} else {
//							o = getObject((ArrayList) ls.get(i), key, type);
//						}
//						return o;
//					}
//				}
//			}
//		} catch (Exception e) {
//			System.out.println("###[Error] getObject() " + e.getMessage());
//		}
//
//		return o;
//	}
//
//
//	public List<String> loopTraversalList(String jsonStr,String name){
//		List<String> tmpList=new ArrayList<String>();
//		Pattern p = Pattern.compile("(?<="+name+"=).*?(?=,)");
//		Matcher m = p.matcher(jsonStr);
//		 while(m.find()) {
//			 tmpList.add(m.group());
//		 }
//		return tmpList;
//	}
//
//
//
//	public static String parmMapToJson(Map<String, Object> jsonMap) {
//
//		JSONObject jo = new JSONObject();
//		Set<String> jsonKey = jsonMap.keySet();
//		for (String o : jsonKey) {
//			jo.put(o, jsonMap.get(o));
//		}
//		System.out.println(jo.toString());
//		return jo.toString();
//	}
//
//
//	public static String parmDataListToJson(List<String[]> data) {
//		List<String[]> s =data;
//		JSONObject jo = new JSONObject();
////		jo.put(o, jsonMap.get(o));
//		for (int i = 0; i < s.size(); i++) {
//			String[] ss = s.get(i);
//
//			System.out.println(str);
//		}
//		System.out.println(jo.toString());
//		return jo.toString();
//	}
//
//
//	/*
//     * Json数据解析返回数据类型枚举
//     */
//    public enum TypeEnum{
//        /** 单纯的键值对，通过key获取valus */
//        string,
//        /** 单纯的键值对，通过key获取valus */
//        Int,
//        /** 单纯的键值对，通过key获取valus */
//        Double,
//        /** 单纯的键值对，通过key获取valus */
//        Null,
//        /** 获取NULL */
//        map,
//        /** 通过key获取到ArrayList数组 */
//        arrayList,
//        /** 通过key获取到ArrayMap数组对象 */
//        arrayMap;
//
//
//    }
//
//}
