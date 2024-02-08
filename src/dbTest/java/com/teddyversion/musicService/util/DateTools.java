package com.teddyversion.musicService.util;

import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateTools {
    public static Date stringToDate(String dateString) {
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        try {
            return new Date(df.parse(dateString).getTime());
        } catch (ParseException pe) {
            fail("bad date parsing");
            // should never return because of the fail but whatever
            return new Date(0l);
        }
    }
}
