package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtility {

    public static String getPropertyValue(String key) throws Throwable {
        FileInputStream file=new FileInputStream("./src/main/resources/commonData.properties");
        Properties properties=new Properties();
        properties.load(file);
       return properties.getProperty(key);
    }
}
