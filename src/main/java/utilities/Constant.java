package utilities;

import java.io.File;
import java.nio.file.Paths;

class Constant {

    /**Config Properties file **/
//    final static String CONFIG_PROPERTIES_DIRECTORY = Constant.class.getResource("/config.properties").getPath();
    final static String CONFIG_PROPERTIES_DIRECTORY = Paths.get(System.getProperty("user.dir"), "src", "main", "resources", "config.properties").toString();
//    final static String CONFIG_PROPERTIES_DIRECTORY = System.getProperty("user.dir") + "src" + File.pathSeparator + "main"  + File.pathSeparator + "resources"  + File.pathSeparator + "config.properties";

    final static String GECKO_DRIVER_DIRECTORY = System.getProperty("user.dir") + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "geckodriver.exe";

    final static String CHROME_DRIVER_DIRECTORY = System.getProperty("user.dir") + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "chromedriver.exe";

    final static String IE_DRIVER_DIRECTORY = System.getProperty("user.dir") + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "IEDriverServer.exe";
}