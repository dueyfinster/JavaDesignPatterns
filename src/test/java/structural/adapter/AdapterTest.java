package structural.adapter;

import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class AdapterTest {

    private String getDateFormat(final String dateFormat){
        final DateFormat df = new SimpleDateFormat(dateFormat);
        return df.format(new Date());
    }

    @Test
    public void testLegacyClient() {
        assertEquals(getDateFormat("MM/dd/yy"),  LegacyClient.getDate());
    }

    public void testAdaptor() {
        assertEquals(getDateFormat("dd/MM/yy"),  AdapterRunner.getDate());
    }

    public void testNewClient() {
        assertEquals(getDateFormat("dd/MM/yy"),  NewClient.getDate());
    }

}
