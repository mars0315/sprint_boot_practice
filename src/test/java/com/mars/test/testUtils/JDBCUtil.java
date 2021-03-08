package testDemo;

import java.io.IOException;
import java.sql.*;
import java.util.*;

public class JDBCUtil {

    //静态代码块中的变量作用域只在代码块中，需要变更为全局变量，方便全局方法调用
    private static String url;
    private static String user;
    private static String password;


    static {
        try {
            Properties properties=new Properties();
            properties.load(JDBCUtil.class.getResourceAsStream("/properties"));
            //1.注册一个驱动，装载一个驱动
            Class.forName(properties.getProperty("jdbc.driver"));
            //2.建立连接：jdbc：mysql：//ip：端口/数据库
            url=properties.getProperty("jdbc.url");
            user=properties.getProperty("jdbc.user");
            password=properties.getProperty("jdbc.password");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        System.out.println("*************************总共运行1次************************");
    }



    /**
     * 每个方法每次调用都要注册驱动，需要抽取出公共方法方便全部调用
     * 并且数据维护困难，需要进行数据解耦
     * 解决方案：创建properties或者xml到resource中进行调用
     */
    public static void setProperties() throws IOException, ClassNotFoundException {
//        InputStreamReader is=new InputStreamReader(new FileInputStream("/properties"));
//        Properties properties=new Properties();
//        properties.load(is);
        Properties properties=new Properties();
//        properties.load(new FileInputStream("/properties"));
        properties.load(JDBCUtil.class.getResourceAsStream("/properties"));
        //1.注册一个驱动，装载一个驱动
        Class.forName(properties.getProperty("jdbc.driver"));
        //2.建立连接：jdbc：mysql：//ip：端口/数据库
        String url=properties.getProperty("jdbc.url");
        String user=properties.getProperty("jdbc.user");
        String password=properties.getProperty("jdbc.password");

    }

    /**
     * insert update delete的方式相同
     */
    public static void insert(){
        String sql="insert into member(regname,mobilephone,pwd) values(?,?,?)";
        execute(sql,"rose","13888881111","123456");
    }

    /**
     * query方法和其他三种不同
     */
    public static void query(){
//        String sql="select * from member;";
        String sql="select name,password from member;";
        List<Map<String,Object>> recordList=queryExecute(sql);
        for (Map<String,Object> recordMap:recordList
             ) {
            Set<String> keyset=recordMap.keySet();
            for (String coloum:keyset
                 ) {
                System.out.println(coloum+"---"+recordMap.get(coloum));
            }
        }
    }


    public static void execute(String sql,Object...params){
            Connection connection = null;
            PreparedStatement preparedStatement=null;
        try {
            connection = getConnection();
            //4.陈述对象
            preparedStatement=connection.prepareStatement(sql);
            int length=params.length;
            for (int i=0;i<length;i++){
                preparedStatement.setObject(i+1,params[i]);
            }
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeResource(connection, preparedStatement);
        }
    }



    public static List<Map<String,Object>> queryExecute(String sql,Object...params){
        List<Map<String,Object>> data=new ArrayList<Map<String,Object>>();
        Connection connection = null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
            connection = getConnection();
            //4.陈述对象
            preparedStatement=connection.prepareStatement(sql);
            int length=params.length;
            for (int i=0;i<length;i++){
                preparedStatement.setObject(i+1,params[i]);
            }
            //5.执行sql语句
            resultSet=preparedStatement.executeQuery(sql);
            //获取到结果集的原数据
            ResultSetMetaData metaData=resultSet.getMetaData();
            int count=metaData.getColumnCount();
            //查询到的结果如何保存？List接收后放入Map对象中
            //List<Map<String,Object>> data=new ArrayList<Map<String,Object>>();
            while (resultSet.next()){
                /**
                 * 1.没有结果集
                 * 2.有单条结果集，一个字段
                 * 3.有单条结果集，多个字段
                 * 4.有多条结果集，多个字段
                 */
                //遍历每一列的值以KEY，Value形式存入map中
                Map<String,Object> oneRecord=new HashMap<String,Object>();
                for (int i=0;i<count;i++){
                    String coloumName=metaData.getCatalogName(i+1);
                    Object coloumValue=resultSet.getObject(i+1);
                    oneRecord.put(coloumName,coloumValue);
                }
                data.add(oneRecord);
            }
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeResource(connection, preparedStatement, resultSet);
        }
        return data;
    }



    private static Connection getConnection(){
        Connection connection=null;
        try {
            connection= DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    private static void closeResource(Connection connection, PreparedStatement preparedStatement) {
        //判断connection是否为空，若为空可能抛出运行时异常--空指针
        if(connection!=null&&preparedStatement!=null){
            try {
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void closeResource(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
        //判断connection是否为空，若为空可能抛出运行时异常--空指针
        if (connection != null && preparedStatement!=null && resultSet!=null) {
            try {
                resultSet.close();
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printTest(){
        System.out.println("printTest");
    }

    public static void main(String[] args) throws IOException {
//        Properties properties=new Properties();
//        properties.load(JDBCUtil.class.getResourceAsStream("/jdbc.properties"));
//
//        System.out.println(properties.getProperty("jdbc.driver"));
//        System.out.println(properties.getProperty("jdbc.url"));
//        System.out.println(properties.getProperty("jdbc.user"));
//        System.out.println(properties.getProperty("jdbc.password"));
    }
}
