package W3resourseBasic;

import java.util.Date;
import java.text.SimpleDateFormat;

public class FormattedDateandTime {
    public static void main(String[] args) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        Date now = new Date();

        System.out.println("Now: " + formatter.format(now));
    }
}
