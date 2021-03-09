package testDemo;

import java.util.Scanner;

public class TestCountChars {
    public static void main(String[] args) {
        testCount();
    }

    public static void testCount() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请任意输入内容：");
        String str=scanner.nextLine();
        int count1,count2,count3,count4;
        String str1="";
        String str2="";
        String str3="";
        String str4="";
        count1=count2=count3=count4=0;
        for (int i = 0; i <str.length() ; i++) {
            char[] chars=str.toCharArray();
            if (chars[i] >='A' &&chars[i]<='Z'||chars[i] >='a' &&chars[i]<='z') {
                count1++;
                str1=str1+"，"+chars[i];
            }else if (chars[i]>='0'&&chars[i]<='9'){
                count2++;
                str2=str2+"，"+chars[i];
            }else if(Character.isSpaceChar(chars[i])){
                count3++;
                str3=str3+"，"+(i+1);
            }else {
                count4++;
                str4=str4+"，"+(i+1);
            }
        }
        System.out.println("一共有字符 :"+count1+"个,分别是"+str1);
        System.out.println("一共有数字 :"+count2+"个,分别是"+str2);
        System.out.println("一共有空格 :"+count3+"个,空格分别在第"+str3+"位");
        System.out.println("一共有其他符号 :"+count4+"个,空格分别在第"+str4+"位");
    }
}
