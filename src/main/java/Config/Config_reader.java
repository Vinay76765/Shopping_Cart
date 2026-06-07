package Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config_reader {
	
	Properties prop;
	
	public Config_reader() {
        try {
            prop = new Properties();

            FileInputStream fis = new FileInputStream(
                System.getProperty("user.dir") + "\\src\\main\\java\\Config\\config.properties"
            );

            prop.load(fis);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUrl() {
        return prop.getProperty("url");
    }

    public String getBrowser() {
        return prop.getProperty("browser");
    }
}