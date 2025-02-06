package io.gavl.SankalpWeb.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility extends BaseClass{
    private static Properties properties = new Properties(); 

    public static void propertyFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\testing.engineer\\git\\sankalp\\Web\\io.gavl.SankalpWeb\\src\\test\\resources\\testData\\SankalpPropertyFile.property");
            properties.load(fileInputStream);
//            fis.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        
    }

    public static String getProperty(String key) {
        String value = properties.getProperty(key); 
        return value;
    }
}


