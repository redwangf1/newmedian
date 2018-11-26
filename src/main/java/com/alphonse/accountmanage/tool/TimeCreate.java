package com.alphonse.accountmanage.tool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeCreate {
	 long currentTimeMillis;
	 
	 
	 public String getCurrentDate() {
		 return this.currentDate();
	 }
	 
	 public long getCurrentDateMillis() {
		return this.currentDateZeroMillis();
		 
	 }
	 
	 public long getTargetMillis() {
		 return this.getCurrentDateMillis();
	 }
	 private String currentDate() {
		 long currentTimeMillis = System.currentTimeMillis();//时锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟�
		 SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");//时锟斤拷锟绞斤拷锟斤拷锟�
		 try {
			Date date = sdf.parse("2012-01-01");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//锟斤拷锟斤拷锟斤拷一锟斤拷时锟斤拷
		 String dateStr = sdf.format(new Date());	
		 System.out.println(dateStr);
		 return dateStr;
	 }
	 
	 private long currentDateZeroMillis() {
		 long current = System.currentTimeMillis();
         long zero_ = current/(1000*3600*24)*(1000*3600*24) - TimeZone.getDefault().getRawOffset();
         long zero = zero_ / 1000;
         //System.out.println(zero+"------------------"+current);
		return zero;
	 }
	 
	 public long thrityDaysMillis() {
		 
		 //锟睫改伙拷锟斤拷时锟斤拷
		 return this.currentDateZeroMillis()-604800;
//		 return this.currentDateZeroMillis() ;

	 }
	 
	 public String getCurrentTimeStr() {
		 Date day=new Date();    
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		 return df.format(day);
		 
	 }
	 public Date getCurrentDate1() {
		 Date day=new Date();    
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		 return day;
		 
	 }
	 public static String stampToDate(long s){
	        String res;
	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        long lt = new Long(s);
	        Date date = new Date(s*1000);
	        res = simpleDateFormat.format(date);
	       // System.out.println(res);
	        return res;
	    }
	 public static void main(String[] args) {
		 new TimeCreate().stampToDate(1532698201);
	 }
	 public static long dateToStamp(String s) throws ParseException{
	        String res;
	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        try {
	        	 if(!"".equals(s) ) {
		        	 Date date = simpleDateFormat.parse(s);
		 	        long ts = date.getTime();
		 	        res = String.valueOf(ts);
			        return ts;

		        }
	        }catch (Exception e) {
				// TODO: handle exception
	        	e.printStackTrace();
			}
	        
			return 0;
	       
	    }
}
