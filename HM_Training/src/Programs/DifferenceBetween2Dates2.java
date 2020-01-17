package Programs;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DifferenceBetween2Dates2 
{
public static void main(String[] args) 
{
Scanner sc1 = new Scanner(System.in);
System.out.println("Enter From (yyyy-mm-dd) :");
String from_date = sc1.next();
System.out.println("Enter To (yyyy-mm-dd) :");
String to_date = sc1.next();
sc1.close();

LocalDate dateBefore = LocalDate.parse(from_date);
LocalDate dateAfter = LocalDate.parse(to_date);

//Calculate Difference between two dates

long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);

System.out.println(noOfDaysBetween);
}
}