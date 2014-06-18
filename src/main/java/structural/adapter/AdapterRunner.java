package structural.adapter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AdapterRunner {

    /**
     * @param args
     */
    public static String getDate(){
        Date date = new Date(LegacyClient.getDate());
        
        DateFormat df = new SimpleDateFormat("dd/MM/yy");
        String convertedDate = df.format(date); 
        
        return convertedDate;
    }

}
