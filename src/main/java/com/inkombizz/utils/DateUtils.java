package com.inkombizz.utils;

import com.inkombizz.common.enums.EnumDayFormated;
import com.inkombizz.common.enums.EnumMonthFormated;
import com.inkombizz.common.enums.EnumYearFormated;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

  public static final String DATE_FORMAT_COMPLETE = "yyyy-MM-dd HH:mm:ss";
  public static final String DATE_FORMAT = "yyyy-MM-dd";
  public static final String DATE_FORMAT_D_M_Y = "dd-MM-yyyy";
  public static final String DATE_FORMAT_D_MMM_Y = "dd MMM yyyy";
  public static final String DATE_FORMAT_D_MMMM_Y = "dd MMMM yyyy";
  public static final String DATE_FORMAT_FORM = "MM/dd/yyyy";

  public static String formatingDate(Date transactionDate) {
    return formatingDate(transactionDate, true, true, false);
  }

  public static String formatingDate(Date transactionDate, boolean isUsingYear,
          boolean isUsingMonth, boolean isUsingDay) {
    String fDate = "";

    SimpleDateFormat simpleDateFormat;

    if (isUsingYear) {
      simpleDateFormat = new SimpleDateFormat(EnumYearFormated.toString(EnumYearFormated.ENUM_YearFormated.YY));
      fDate += simpleDateFormat.format(transactionDate);
    }

    if (isUsingMonth) {
      simpleDateFormat = new SimpleDateFormat(EnumMonthFormated.toString(EnumMonthFormated.ENUM_MonthFormated.MM));
      fDate += simpleDateFormat.format(transactionDate);
    }

    if (isUsingDay) {
      simpleDateFormat = new SimpleDateFormat(EnumDayFormated.toString(EnumDayFormated.ENUM_DayFormated.DD));
      fDate += simpleDateFormat.format(transactionDate);
    }

    return fDate;
  }

  public static Date newDate() {
    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
    try {
      Calendar currentDate = Calendar.getInstance();
      return sdf.parse(currentDate.getTime().toString());
    } catch (ParseException ex) {
      return new Date();
    }
  }

  public static Date newDate(int year, int month) {
    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
    try {
      Calendar currentDate = Calendar.getInstance();
      Date tempDate = currentDate.getTime();

      SimpleDateFormat sdf2 = new SimpleDateFormat("dd");
      String sDay = sdf2.format(tempDate);

      return sdf.parse(Integer.toString(year) + "-" + Integer.toString(month) + "-" + sDay);
    } catch (ParseException ex) {
      return new Date();
    }
  }

  public static Date newDate(int year, int month, int day) {
    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
    try {
      return sdf.parse(Integer.toString(year) + "-" + Integer.toString(month) + "-" + Integer.toString(day));
    } catch (ParseException ex) {
      return getLastDateOfMonth(year, month);
    }
  }

  public static Date getFirstDateOfMonth(int year, int month) {
    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
    try {
      return sdf.parse(Integer.toString(year) + "-" + Integer.toString(month) + "-1");
    } catch (ParseException ex) {
      return new Date();
    }
  }

  public static String getFirstDateOfMonth_Form(int year, int month) {
    String tempMonth = Integer.toString(month);

    if (month < 10) {
      tempMonth = "0" + tempMonth;
    }

    return tempMonth + "/01/" + Integer.toString(year);
  }

  public static Date getLastDateOfMonth(int year, int month) {
    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
    try {
      Calendar currentDate = Calendar.getInstance();

      currentDate.set(year, month - 1, 1);

      int maxDay = currentDate.getActualMaximum(Calendar.DAY_OF_MONTH);

      return sdf.parse(Integer.toString(year) + "-" + Integer.toString(month) + "-" + Integer.toString(maxDay));
    } catch (ParseException ex) {
      return new Date();
    }
  }

  public static String getLastDateOfMonth_Form(int year, int month) {
    String tempMonth = Integer.toString(month);
    String tempDay = "";

    Calendar currentDate = Calendar.getInstance();

    currentDate.set(year, month - 1, 1);

    int maxDay = currentDate.getActualMaximum(Calendar.DAY_OF_MONTH);
    tempDay = Integer.toString(maxDay);

    if (maxDay < 10) {
      tempDay = "0" + tempDay;
    }

    if (month < 10) {
      tempMonth = "0" + tempMonth;
    }

    return tempMonth + "/" + tempDay + "/" + Integer.toString(year);
  }

  public static Date getFirstDate() {
    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
    try {
      Calendar currentDate = Calendar.getInstance();
      Date tempDate = currentDate.getTime();

      SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
      String sYear = sdf2.format(tempDate);

      sdf2 = new SimpleDateFormat("MM");
      String sMonth = sdf2.format(tempDate);

      return sdf.parse(sYear + "-" + sMonth + "-1");
    } catch (ParseException ex) {
      return new Date();
    }
  }

  public static Date getLastDate() {
    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
    try {
      Calendar currentDate = Calendar.getInstance();
      Date tempDate = currentDate.getTime();

      SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
      String sYear = sdf2.format(tempDate);

      sdf2 = new SimpleDateFormat("MM");
      String sMonth = sdf2.format(tempDate);

      int maxDay = currentDate.getActualMaximum(Calendar.DAY_OF_MONTH);

      return sdf.parse(sYear + "-" + sMonth + "-" + Integer.toString(maxDay));
    } catch (ParseException ex) {
      return new Date();
    }
  }

  public static String getYearRight(Date transactionDate) {
    SimpleDateFormat sdf = new SimpleDateFormat("yy"); // Just the year, with 2 digits
    String formattedDate = sdf.format(Calendar.getInstance().getTime());
    return formattedDate;
  }

  public static int getYear() {
    SimpleDateFormat sdf = new SimpleDateFormat(EnumYearFormated.toString(EnumYearFormated.ENUM_YearFormated.YYYY));
    Calendar currentDate = Calendar.getInstance();
    Date tempDate = currentDate.getTime();

    return Integer.parseInt(sdf.format(tempDate));
  }

  public static int getYear(Date transactionDate) {
    SimpleDateFormat sdf = new SimpleDateFormat(EnumYearFormated.toString(EnumYearFormated.ENUM_YearFormated.YYYY));
    return Integer.parseInt(sdf.format(transactionDate));
  }

  public static int getMonth() {
    SimpleDateFormat sdf = new SimpleDateFormat(EnumMonthFormated.toString(EnumMonthFormated.ENUM_MonthFormated.MM));
    Calendar currentDate = Calendar.getInstance();
    Date tempDate = currentDate.getTime();

    return Integer.parseInt(sdf.format(tempDate));
  }

  public static int getMonth(Date transactionDate) {
    SimpleDateFormat sdf = new SimpleDateFormat(EnumMonthFormated.toString(EnumMonthFormated.ENUM_MonthFormated.MM));
    return Integer.parseInt(sdf.format(transactionDate));
  }

  public static int getDay() {
    SimpleDateFormat sdf = new SimpleDateFormat(EnumDayFormated.toString(EnumDayFormated.ENUM_DayFormated.DD));
    Calendar currentDate = Calendar.getInstance();
    Date tempDate = currentDate.getTime();

    return Integer.parseInt(sdf.format(tempDate));
  }

  public static int getDay(Date transactionDate) {
    SimpleDateFormat sdf = new SimpleDateFormat(EnumDayFormated.toString(EnumDayFormated.ENUM_DayFormated.DD));
    return Integer.parseInt(sdf.format(transactionDate));
  }

  public static int getMaxDayOfMonth() {
    //SimpleDateFormat sdf = new SimpleDateFormat(EnumDayFormated.toString(EnumDayFormated.ENUM_DayFormated.DD));
    Calendar currentDate = Calendar.getInstance();

    return currentDate.getActualMaximum(Calendar.DAY_OF_MONTH);
  }

  public static int toInt(Date transactionDate) {
    return getYear(transactionDate) + (getMonth(transactionDate) * 10) + getDay(transactionDate);
  }

  public static String toString(Date date, String formatDate) {
    SimpleDateFormat sdf = new SimpleDateFormat(formatDate);
    return sdf.format(date);
  }

}
