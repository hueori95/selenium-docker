package com.vinsquru.util;

import com.vinsquru.tests.vendorportal.model.VendorPortalTestData;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Demo {
    public static void main(String[] args) throws IOException {
//        InputStream stream = ResourceLoader.getResource("dummy.txt");
//        String content = IOUtils.toString(stream, StandardCharsets.UTF_8);
//        System.out.println(content);

        //VendorPortalTestData testData =  JsonUtil.getTestData("test-data/vendor-portal/john.json", Demo.class);
        //System.out.println(testData.getMonthlyEarning());

        System.setProperty("browser", "firefox");
        System.out.println("---------------------");
        Config.initialize();
    }
}
