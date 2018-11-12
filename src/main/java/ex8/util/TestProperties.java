package ex8.util;

import org.junit.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

    private final Properties properties = new Properties();

    private static TestProperties INSTANSE = null;

    private TestProperties() {
        try {
            properties.load(new FileInputStream(new File("./" + System.getProperty("enviroment")+".properties")));
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail("Не найден файл");
        }
    }

    public static TestProperties getInstance() {
        if (INSTANSE == null) {
            INSTANSE = new TestProperties();
        }
        return INSTANSE;
    }

    public Properties getProperties() {
        return properties;
    }

}
