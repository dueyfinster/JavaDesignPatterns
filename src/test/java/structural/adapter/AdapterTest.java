package structural.adapter;

import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class AdapterTest {
    @Test
    public void testLegacyClient() {
        assertEquals(getDateFormat("MM/dd/yy"), LegacyClient.getDate());
    }

    @Test
    public void testAdaptor() {
        assertEquals(getDateFormat("dd/MM/yy"), AdapterRunner.getDate());
    }

    private String getDateFormat(final String dateFormat) {
        final DateFormat df = new SimpleDateFormat(dateFormat);
        return df.format(new Date());
    }

}
