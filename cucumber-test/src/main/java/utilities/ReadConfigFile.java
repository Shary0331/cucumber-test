package utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigFile {
    private Properties prop = null;

    public ReadConfigFile() {
        try {
            InputStream input =  new FileInputStream(Constant.CONFIG_PROPERTIES_DIRECTORY);
            prop = new Properties();
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getBrowser() {
        if (prop.getProperty("browser") == null)
            return "No property found";
        return prop.getProperty("browser");
    }
}
