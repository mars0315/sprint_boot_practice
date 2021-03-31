package testDemo;

public class TestCls {
    public static void main(String[] args) {
        String str="asdfaskldfghjkl";
        doTest(str);

    }

    public static void doTest(String str) {
        char[] chars=str.toCharArray();
        for (int i = 0; i <str.length() ; i++) {
            for (int j = 0; j <str.length()-1 ; j++) {
                if(chars[j]>chars[j+1]){
                    char a=chars[j+1];
                    chars[j+1]=chars[j];
                    chars[j]=a;
                }
            }
        }
        for (char a :
                chars) {
            System.out.println(a);
        }
    }
}
