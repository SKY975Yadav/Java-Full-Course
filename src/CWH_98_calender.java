import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CWH_98_calender {
    public static void main(String[] args) {
        /*
//        Calendar cl = Calendar.getInstance();
////        Calendar.Builder cb = new Calendar.Builder();
//////        System.out.println(cb.toString());
//////        cb.toString();
////        cb.setDate(123,5,19);
////        System.out.println(cb.build());
//        System.out.println(cl.getCalendarType());
//        System.out.println(cl.getTimeZone().getID());
//        Calendar cl1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
//        System.out.println(cl1.getCalendarType());
//        System.out.println(cl1.getTimeZone().getID());
//
//        //cb.build();
        */
        Calendar cl = Calendar.getInstance();
        //System.out.println(cl.get(Calendar.DATE));
        GregorianCalendar gs = new GregorianCalendar();
        System.out.println(gs.isLeapYear(3243));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);





    }
}
