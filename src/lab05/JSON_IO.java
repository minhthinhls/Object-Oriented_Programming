package lab05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;

public class JSON_IO {

    private static final String DIR = "./data/productList.json";

    public static ProductList loadJSONFile() throws JAXBException {
        try {
            new FileInputStream(DIR);
        } catch (FileNotFoundException ex) {
            new File("./data").mkdir();
            JSONUtils.createEmptyJSON(DIR);
        }

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(DIR), "UTF-8"));
            return JSONUtils.unmarshal(reader.readLine(), ProductList.class);
        } catch (IOException ex) {
            Logger.getLogger(JSON_IO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(JSON_IO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    public static void saveJSONFile(ProductList products) throws JAXBException {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(DIR), "UTF-8"));
            writer.write(JSONUtils.marshal(products));
        } catch (IOException ex) {
            Logger.getLogger(JSON_IO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(JSON_IO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
