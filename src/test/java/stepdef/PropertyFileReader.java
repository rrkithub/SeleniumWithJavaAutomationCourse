package stepdef;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

    public String getPropertyValue(String key) throws IOException {
        Properties ps=new Properties();
        FileReader fis=new FileReader(System.getProperty("user.dir")+"//src//test//java//Properties//application.properties");
        ps.load(fis);
        return ps.getProperty(key);
    }
}
