package edu.escuelaing.arep.app.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.*;
public class HTTPApiConection {
    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String API_KEY = "c19ff813"; 
    private static final String GET_URL = "http://www.omdbapi.com/";
    private static  String movieName;
    private static String responseString;


    public static void main(String[] args) throws IOException {
        URL obj = new URL(GET_URL + "?t=" + movieName + "&apikey=" + API_KEY);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);

        //The following invocation perform the connection implicitly before getting the code
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            responseString = response.toString();
            System.out.println(responseString);

        } else {
            System.out.println("GET request not worked");
        }
        System.out.println("GET DONE");
    }

    /**
     * search the page for the movie
     */
    public static void execute() throws IOException{
        URL obj = new URL(GET_URL + "?t=" + movieName + "&apikey=" + API_KEY);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            responseString = response.toString();
        }
    }


    /**
     * maps the input data
     * @param name name of the movie that was sent to the page
     */
    public static void movieNameSetter(String name) {
        movieName = name;
        String movieNameUrl = null;
        try {
            movieNameUrl = URLEncoder.encode(movieName, "UTF-8");
        } catch (UnsupportedEncodingException x) {
        }
        movieName = movieNameUrl;
    }


    /**
     * @return the json casted to string
     */
    public static String getMessage(){
        return responseString.toString();
    }

}