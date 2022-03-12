package project17.groupSolutions.group1.uitilites;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadFromConfigFile {
    public static String getValueFor(String key) {
        String filePath = "src/main/java/project17/groupSolutions/group1/files/config.properties";
        String value = null;
        try{
            InputStream input = new FileInputStream(filePath);
            Properties properties = new Properties();
            properties.load(input);
            value = properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }
}
