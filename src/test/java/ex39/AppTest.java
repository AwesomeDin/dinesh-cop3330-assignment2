package ex39;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    String firstName[] = {"John", "Tou", "Michaela", "Jake", "Jacquelyn","Sally"};
    String lastName[] = {"Johnson","Xiong","Michaelson","Jacobson","Jackson","Webber"};
    String position[] = {"Manager","Software Engineer", "District Manager", "Programmer", "DBA","Web Developer"};
    String separationDate[] = {"2016-12-31","2016-10-05","2015-12-19","","","2015-12-18"};
    @Test
    void putIn() {
        Map<String, ArrayList<String>> multiValueMap = new HashMap<String, ArrayList<String>>();
        Map<String, ArrayList<String>> ourMap = new HashMap<String, ArrayList<String>>();
        multiValueMap.put(lastName[0], new ArrayList<String>());
        multiValueMap.get(lastName[0]).add(firstName[0]);
        multiValueMap.get(lastName[0]).add(position[0]);
        multiValueMap.get(lastName[0]).add(separationDate[0]);
        assertEquals(multiValueMap,App.putIn(ourMap,0,firstName,lastName,position,separationDate));
    }

    @Test
    void controller() {
        Map<String, ArrayList<String>> multiValueMap = new HashMap<String, ArrayList<String>>();
        assertArrayEquals(this.lastName,App.controller(multiValueMap));
    }

}