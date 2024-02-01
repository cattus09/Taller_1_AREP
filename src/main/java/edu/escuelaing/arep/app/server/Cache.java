package edu.escuelaing.arep.app.server;

import java.util.concurrent.ConcurrentHashMap;

public class Cache {
    public static ConcurrentHashMap<String, String> cache = new ConcurrentHashMap<>();

    /**
     * Get the instance of the cache
     * @param name the name of the movie
     * @return the instance of the cache
     */
    public static String get(String name) {
      
        return cache.get(name);
    }
    /**
     * Add a new movie to the cache
     * @param name the name of the movie
     * @param response the json of the movie
     */
    public static void put(String name, String response) {
        cache.put(name, response);
    }

    /**
     * Returns if the movie alredy exists
     * @param name the name of the movie
     * @return true or false
     */
    public static boolean containsKey(String name) {
        return cache.containsKey(name);
    }
}