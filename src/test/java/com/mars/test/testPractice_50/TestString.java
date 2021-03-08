package testDemo;

public class TestString {
    public static void main(String[] args) {
        //取得手机号码
        String str="13100001234";
        String str1=str.substring(2,11);
        String str2="13";
        Integer str3=Integer.parseInt(str1);
        String str4=str2+str1;

        //比较手机号码是否为true,为true就继续比较,false就返回手机号码
        while (str4.equals(str)){
            str3++;
            str=str2+str3.toString();
            System.out.println(str);
            continue;
        }
        System.out.println(str);
    }
}
