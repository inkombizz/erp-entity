package com.inkombizz.utils;

import javax.persistence.EntityManager;
import javax.persistence.Table;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.Session;

public class AutoNumber {

  public static EntityManager em;

  public static final int TRANSACTION_LENGTH_6 = 6;
  public static final int TRANSACTION_LENGTH_5 = 5;
  public static final int TRANSACTION_LENGTH_3 = 3;

  public static String generate(String acronim, String oldCode, int transactionLength) {
    /*
            prefix = "XXX-2101"
     */

    if ((oldCode.isEmpty()) || ("".equals(oldCode))) {
      return acronim + StringUtils.leftPad("1", transactionLength, "0");
    }

    String strNo = oldCode.substring(oldCode.length() - transactionLength, oldCode.length());
    int intNo = Integer.parseInt(strNo) + 1;

    return acronim + StringUtils.leftPad(Integer.toString(intNo), transactionLength, "0");
  }

  public static String generateNum(String code, int index, int length) {
    return code + "-" + StringUtils.leftPad(Integer.toString(index), length, "0");
  }

  public static String generateCode(String prefix, String maxcode, int length) {
    if ((maxcode == null) || (maxcode.isEmpty()) || ("".equals(maxcode))) {
      maxcode = prefix + StringUtils.leftPad(Integer.toString(0), length, "0");
    }
    int intNo = Integer.parseInt(maxcode.substring(prefix.length())) + 1;
    return prefix + StringUtils.leftPad(Integer.toString(intNo), length, "0");
  }

  public static String getMaxCode(EntityManager em, Class<?> table) {

    return getMaxCode(em, null, table, null);
  }

  public static String getMaxCode(EntityManager em, Class<?> table, String condition) {
    return getMaxCode(em, null, table, condition);
  }

  public static String getMaxCode(EntityManager em, String code, Class<?> model, String condition) {
    try {
      AutoNumber.em = em;
      Table table = model.getAnnotation(Table.class);
      String tableName = table.name();

      if (tableName == null || tableName.isEmpty() || tableName.isBlank()) {
        return null;
      }

      String where = "";
      if (condition != null) {
        where = "WHERE " + condition;
      }

      String perfix = "Code";
      if (code != null) {
        perfix = code;
      }
      String qry = "SELECT MAX(" + perfix + ") FROM " + tableName + " " + where;

      Session session = em.unwrap(Session.class);
      String maxcode = session.createNativeQuery(qry).getSingleResult().toString();

      return maxcode;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
}
