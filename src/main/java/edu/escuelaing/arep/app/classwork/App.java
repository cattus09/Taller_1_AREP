package edu.escuelaing.arep.app.classwork;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ){
        URL misitio;
        URL miuri;
        try {
            misitio = new URL("https://campusvirtual.escuelaing.edu.co:8080/notas.html?cliente=firefox-b-d&g");
            System.out.println( "Protocolo: " + misitio.getProtocol() );
            System.out.println( "Host: " + misitio.getHost() );
            System.out.println( "Port: " + misitio.getPort() );
            System.out.println( "Path: " + misitio.getPath() );
            System.out.println( "Query: " + misitio.getQuery() );
            System.out.println( "File: " + misitio.getFile() );
            System.out.println( "Ref: " + misitio.getRef() );

            miuri = new URL("http://cliente?t=67&o=25");
            System.out.println("Path: "+ miuri.getPath());
            System.out.println("Query: "+ miuri.getQuery());
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }




    }
}
