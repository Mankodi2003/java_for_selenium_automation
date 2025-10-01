// LocalDate (yyyy-mm-dd)
// LocalTime (hh-mm-ss-ns)
// LocaDateTime(yyyy-mm-dd-hh-mm-ss-ms)
// DateTimeFormatter (Formatter for displaying and parsing date-time objects)




// LocalDate...

/* 

import java.time.LocalDate;
public class v_DateAndTime {
    public static void main(String[] args){
        LocalDate myObj = LocalDate.now();
        System.out.println("myObj");
    }
}

*/




// LocalTime...

/*

import java.time.LocalTime;
public class v_DateAndTime{
    public static void main(String[] args){
        LocalTime myObj = LocalTime.now();
        System.out.println("myObj");
    }
}

*/




//LocalDateTime...

/*

import java.time.LocalDateTime;
public class v_DateAndTime{
    public static void main(String[] args){
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println("myObj");
    }
}

*/




// Format Date And Time...


/*

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class v_DateAndTime{
    public static void main(String[] args){
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myObj);
        
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
        
    }
}

*/



// we can use DateTimeFormatter like...


// 1) yyyy-MM-dd
// 2) dd/MM/yyyy
// 3) dd-MMM-yyyy
// 4) E, MMM dd yyyy