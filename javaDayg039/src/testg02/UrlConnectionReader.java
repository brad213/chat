package testg02;

import java.io.*;
import java.net.*;

public class UrlConnectionReader {
    public static void main(String[] args) throws Exception {
        URL site = new URL("https://www.google.com");
        URLConnection url = site.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                url.getInputStream(),"utf8"));
        String inLine;
 
        while ((inLine = in.readLine()) != null) 
            System.out.println(inLine+"\n");
        in.close();
    }
}