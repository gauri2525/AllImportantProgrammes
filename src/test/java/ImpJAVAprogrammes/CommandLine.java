package ImpJAVAprogrammes;

import java.util.Arrays;

public class CommandLine {

    public static void main(String[] args) {

        if (args.length >0){
            System.out.println("Below are the command  line arguments");
            for ( String value:args){
                System.out.println(value);
            }
        }
        else  System.out.println("No arguments passed from the command");
    }
}
