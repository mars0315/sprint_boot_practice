package testDemo;

public class StaticTest {
    public static void main(String[] args) throws ClassNotFoundException {
        JDBCUtil jdbcUtil=new JDBCUtil();

        Class.forName("testDemo.JDBCUtil");

        JDBCUtil.printTest();
    }
}
