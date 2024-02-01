package edu.escuelaing.arep.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.escuelaing.arep.app.server.Cache;
import edu.escuelaing.arep.app.server.HttpServer;


public class AppTest {
    /**
     * validates the cache
     */
    @Test
    public void testCache() {
        
        Cache.put("TestMovie", "{\"Title\":\"Test Movie\",\"Year\":\"2022\",\"Genre\":\"Test\",\"Director\":\"Director Test\",\"Plot\":\"Test plot\"}");
        String result = HttpServer.getMovie("/movie?name=TestMovie");
        assertTrue(result.contains("Test Movie"));
        assertTrue(result.contains("2022"));
        assertTrue(result.contains("Test"));
        assertTrue(result.contains("Director Test"));
        assertTrue(result.contains("Test plot"));
        Cache.cache.remove("TestMovie");
    }
}
