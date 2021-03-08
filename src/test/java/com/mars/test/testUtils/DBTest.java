package testDemo;

import java.sql.*;

public class DBTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        InsertSQL();

    }

    private static void InsertSQL() throws ClassNotFoundException, SQLException {
        //1.注册一个驱动，装载一个驱动
        Class clazz=Class.forName("com.mysql.jdbc.Driver");
        //2.建立连接 String url="jdbc:mysql://ip:端口/数据库名";
        String url="jdbc:mysql://120.78.128.25:3306/feture";
        String user="futurevistor";
        String password="123456";
        Connection connection= DriverManager.getConnection(url,user,password);
        //3.准备sql
        String sql="insert into member(regname,mobilephone,pwd) values('kit','13812344321','123456')";
        //4.陈述对象
        Statement statement=connection.createStatement();
        //5.执行sql语句
        ResultSet resultSet=statement.executeQuery(sql);
        //6.关闭资源
        statement.close();
        connection.close();
    }
/*
    private static void QuerySQL() throws ClassNotFoundException, SQLException {
        //1.注册一个驱动，装载一个驱动
        Class clazz=Class.forName("com.mysql.jdbc.Driver");
        //2.建立连接 String url="jdbc:mysql://ip:端口/数据库名";
        String url="jdbc:mysql://120.78.128.25:3306/feture";
        String user="futurevistor";
        String password="123456";
        Connection connection= DriverManager.getConnection(url,user,password);
        //3.准备sql
        String sql="select id,regname,mobile,pwd from member";
        //4.陈述对象
        Statement statement=connection.createStatement();
        //5.执行sql语句
        ResultSet resultSet=statement.executeQuery(sql);
        while (resultSet.next()){
            int id=resultSet.getInt(1);
            String regname=resultSet.getString(2);
            String mobile=resultSet.getString(3);
            String pwd=resultSet.getString(4);
            System.out.println(id+regname+mobile+pwd);
        }
        //6.关闭资源
        statement.close();
        connection.close();
    }*/
}
