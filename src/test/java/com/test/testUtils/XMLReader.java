//package testDemo;
//
//import org.dom4j.Attribute;
//import org.dom4j.Document;
//import org.dom4j.DocumentException;
//import org.dom4j.Element;
//import org.dom4j.io.SAXReader;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.InputStream;
//import java.lang.reflect.InvocationTargetException;
//import java.lang.reflect.Method;
//import java.util.ArrayList;
//import java.util.List;
//
//public class XMLReader {
//
//    public List<UILibraryReader> xmlRead() throws DocumentException, FileNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        SAXReader reader=new SAXReader();
//        Document document=reader.read(new FileInputStream("E:\\Ideaspace\\testDemo\\src\\resources\\UILibrary.xml"));
////        Document document=reader.read(XMLReader.class.getResourceAsStream("/UILibrary.xml"));
//        Element rootElements=document.getRootElement();
//        List<Element> pages=rootElements.elements("page");
//        List<UILibraryReader> list=new ArrayList<>();
//        int i=0;
//        for (Element page:pages
//             ) {
//            UILibraryReader uiLibraryReader = new UILibraryReader();
//            System.out.println("第一层循环" + page.getName());
//            page.addAttribute("desc", "page" + i);
//            Class clazz=uiLibraryReader.getClass();
//            List<Attribute> attributes=page.attributes();
//            for (Attribute attribute :
//                    attributes) {
//            String method="set"+attribute.getName().substring(0,1).toUpperCase()+attribute.getName().substring(1);
//            Method setMethod=clazz.getMethod(method,String.class);
//            setMethod.invoke(uiLibraryReader,attribute.getValue());
//            }
//        /*    uiLibraryReader.setName(page.attribute("name").getValue());
//            uiLibraryReader.setActivityName(page.attribute("activityName").getValue());
//            uiLibraryReader.setPageDesc(page.attribute("pageDesc").getValue());
//            uiLibraryReader.setDesc(page.attribute("desc").getValue());*/
//
//            List<Element> locators = page.elements("locator");
//            List<Locator> list2 = new ArrayList<>();
//            for (Element locator : locators
//            ) {
//                Locator lo = new Locator();
//                Class clazz2=lo.getClass();
//                List<Attribute> attributes2=locator.attributes();
//                for (Attribute attribute:attributes2
//                     ) {
//                    String method="set"+attribute.getName().substring(0,1).toUpperCase()+attribute.getName().substring(1);
//                    Method setMethod=clazz2.getMethod(method,String.class);
//                    setMethod.invoke(lo,attribute.getValue());
//                }
//                /*lo.setName(locator.attributeValue("name"));
//                lo.setBy(locator.attributeValue("by"));
//                lo.setValue(locator.attributeValue("value"));
//                lo.setDesc(locator.attributeValue("desc"));*/
//                list2.add(lo);
//            }
//            uiLibraryReader.setLocators(list2);
//            list.add(uiLibraryReader);
//            i++;
//        }
//            return list;
//    }
//
//    public static void main(String[] args) throws DocumentException, FileNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        XMLReader xmlReader=new XMLReader();
////        xmlReader.xmlRead();
//        List<UILibraryReader> listreader=xmlReader.xmlRead();
//        for (UILibraryReader ui:listreader
//             ) {
//            System.out.println(ui);
//        }
//    }
//}
