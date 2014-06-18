package structural.adapter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LegacyClient {

    /**
     * @param args
     */
    public static String getDate(){
        DateFormat df = new SimpleDateFormat("MM/dd/yy");
        String formattedDate = df.format(new Date()); 
        System.out.println("The date is: " + formattedDate);
        return formattedDate;
        
    }

}
