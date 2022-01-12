import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Dates {
    public static void main(String[] args) throws InterruptedException, ParseException {
        Date date = new Date(1212121212121L);
//        Thread.sleep(2000);
        Date date1 = new Date(2212121212121L);
        Date date2 = new Date();
        System.out.println(date.after(date1)? "Это было одновременно" : "Это было НЕ одновременно" );
        System.out.println(date);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println("Метод getTime: " + date2.getTime());
        System.out.println(date2.getHours());
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar.getTime());
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
        Calendar calendar1 = Calendar.getInstance();
        System.out.println(calendar1.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(calendar1.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar1.get(Calendar.WEEK_OF_MONTH));
        System.out.println(calendar1.get(calendar.getMinimalDaysInFirstWeek()));
        System.out.println(calendar1.get(calendar.getMaximum(calendar1.getFirstDayOfWeek())));
        System.out.println("Календарь 1: " + calendar1.getTime());
        calendar1.set(Calendar.YEAR, 2017);
        calendar1.set(Calendar.MONTH, 0);
        calendar1.set(Calendar.DAY_OF_MONTH, 25);
        calendar1.set(Calendar.HOUR_OF_DAY, 0);
        calendar1.set(Calendar.MINUTE, 42);
        calendar1.set(Calendar.SECOND, 12);
        System.out.println("Календарь 1 новый: " + calendar1.getTime());
        calendar1.add(Calendar.MONTH, -10);
        System.out.println("Календарь 1 -10 месяцев: " + calendar1.getTime());
        calendar1.roll(Calendar.MONTH,10);
        System.out.println("Календарь 1 + 10 месяцев: " + calendar1.getTime());
        calendar1.roll(Calendar.HOUR_OF_DAY,-10);
        System.out.println("Календарь 1 - 10 часов: " + calendar1.getTime());
        DateFormat df = new SimpleDateFormat("dd MMM yyy GG");
        System.out.println("Вывод в новом формате: " + df.format(calendar1.getTime()));
        DateFormat dateFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        takeLunch(calendar1.getTime());
        SimpleDateFormat formater = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
        Date date5 = formater.parse("04 05 2017");
        Date date3 = calendar1.getTime();
        System.out.println(formater.format(date5));
        System.out.println(formater.format(date3));
    }
    static void takeLunch(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        System.out.println("Day of Week: " + dateFormat.format(date));
        String str = dateFormat.format(date);
        switch (str) {
            case "Sunday":
                System.out.println("Воскресный обед! Сегодня можно даже немного сладкого");
                break;
            case "Monday":
                System.out.println("Обед для понедельника: куриная лапша!");
                break;
            case "Tuesday":
                System.out.println("Вторник, сегодня суп из сельдерея :(");
                break;
            case "Wednesday":
                System.out.println("Среда, завтра рыбный день :(");
                break;
            default:
                System.out.println("Уже не важно :(");
                break;
//            ...и так далее до конца
        }
    }
    enum DayOfWeek {
            SUNDAY,
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY
    }
}
