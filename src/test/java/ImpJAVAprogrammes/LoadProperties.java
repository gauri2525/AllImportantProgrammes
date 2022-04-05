package ImpJAVAprogrammes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {

    public static void main(String[] args) {
        File file = new File("F:\\localrepo\\SampleProgrammes\\Application.properties");
        try{
            FileInputStream fis= new FileInputStream(file);
            Properties props= new Properties();
            props.load(fis);
            String devurl= props.getProperty("dev.url");
            String stagingurl= props.getProperty("staging.url");
            System.out.println(devurl +" "+ stagingurl);

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        {

        }
    }
}