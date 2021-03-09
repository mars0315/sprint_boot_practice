package testDemo;

public class TestRobbers {
    public static void main(String[] args) {
        int count=23;
        int co=countRobbers(count);
        System.out.println(co);

    }
    public static int countRobbers(int count){
            if (count == 1||count==2) {
                return 1;
            }else if(count!=0) {
                count=countRobbers(count-1)+countRobbers(count-2);
                return count;
            }
        return 0;
    }
}
