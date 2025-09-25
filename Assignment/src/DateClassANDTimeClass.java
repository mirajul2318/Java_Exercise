import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassANDTimeClass {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat sani = new SimpleDateFormat("dd/MM/YYYY");
        String Date = sani.format(date);
        System.out.println(Date);
    }
}
