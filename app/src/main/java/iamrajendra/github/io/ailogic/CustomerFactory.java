package iamrajendra.github.io.ailogic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import iamrajendra.github.io.ailogic.calenderview.model.GETCUSTOMERSCHEDULEDATum;

public class CustomerFactory {
    private static   CustomerFactory customerFactory;
    public  List<GETCUSTOMERSCHEDULEDATum> sortedList;
    private  Date initialDate,finalDate;

    public List<GETCUSTOMERSCHEDULEDATum> getSortedList() {
        return sortedList;
    }

    public static synchronized CustomerFactory getCustomerFactory() {
        if (customerFactory==null)
            customerFactory = new CustomerFactory();
        return customerFactory;
    }

    public void parseData(List<GETCUSTOMERSCHEDULEDATum> unsortedList){
        Collections.sort(unsortedList, new Comparator<GETCUSTOMERSCHEDULEDATum>() {
            @Override
            public int compare(GETCUSTOMERSCHEDULEDATum customerOne, GETCUSTOMERSCHEDULEDATum customerTwo) {

                Date cusScheduleOne = stringToDate(customerOne.getStartDateTime());
                Date cusScheduleTwo = stringToDate(customerTwo.getStartDateTime());
                return cusScheduleOne.compareTo(cusScheduleTwo);

            }
        });
         sortedList = unsortedList;
        initialDate = stringToDate(sortedList.get(0).getStartDateTime());
        finalDate = stringToDate(sortedList.get(sortedList.size()-1).getStartDateTime());



    }

    public Date stringToDate(String strDate) {
        String sDate1="31/12/1998";
        try {
            Date date=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(strDate);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Date getInitialDate() {
        return initialDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }
}
