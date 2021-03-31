package testDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        //第一种方法：类名.class
        Class<UILibraryReader> clazz=UILibraryReader.class;
        UILibraryReader ui=clazz.newInstance();
        ui.setName("123");
//        System.out.println(ui);

        //第二种方式
        UILibraryReader uiLibraryReader=new UILibraryReader();
        Class clazz2=uiLibraryReader.getClass();
        Constructor<UILibraryReader> constructor=clazz2.getConstructor();
        UILibraryReader uil=constructor.newInstance();
        uil.setName("333");
        System.out.println(uil.getName());

        //第三种方式
        Class clazz3=Class.forName("testDemo.UILibraryReader");

        Method method=clazz2.getMethod("setName", String.class);
//        System.out.println(uiLibraryReader.getName());
//        method.invoke(uiLibraryReader,"22");
//        System.out.println(uiLibraryReader.getName());
//        Field nameField=clazz.getField("name");
//        Field nameField2=clazz.getDeclaredField("name");
//        System.out.println(nameField);
//        System.out.println(nameField2);
//        System.out.println(nameField2.getType());

//        System.out.println(clazz==clazz2);
//        System.out.println(clazz2==clazz3);
//        System.out.println(clazz==clazz3);
    }
}
