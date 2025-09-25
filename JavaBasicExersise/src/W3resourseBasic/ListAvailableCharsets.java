package W3resourseBasic;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.SortedMap;

public class ListAvailableCharsets {
    public static void main(String[] args) {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();

        System.out.println("List of available character sets:\n");

        for (Map.Entry<String, Charset> entry : charsets.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
