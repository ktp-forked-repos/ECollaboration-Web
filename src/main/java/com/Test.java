package com;

import com.general.service.PlanService;
import com.general.service.PlanServiceImpl;

import java.io.DataInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by joanna on 2/13/17.
 */
public class Test {
    @org.junit.Test
    public void test(){
        Calendar calendar=new GregorianCalendar();
        calendar.add(Calendar.DATE, 1);
        Date date=calendar.getTime();
        System.out.println(date);
    }


}


