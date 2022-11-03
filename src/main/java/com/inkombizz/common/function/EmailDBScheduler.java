/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkombizz.common.function;

import com.inkombizz.base.BaseQuery;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

/**
 *
 * @author imamsolikhin
 * https://github.com/rocketbase-io/email-template-builder/blob/master/email-template-builder/src/test/java/io/rocketbase/mail/EmailTemplateBuilderTest.java
 */
@Repository
public class EmailDBScheduler extends BaseQuery {

  public void addMassage(String target, String title, String body) {
    this.addMassage(null, target, title, body);
  }

  public void addMassage(String type, String target, String title, String body) {
    this.addMassage(type, target, "0", title, body);
  }

  public void addMassage(String type, String target, String targetType, String title, String body) {
    this.addMassage(type, target, targetType, title, body, null, null, null, null);
  }

  public void addMassage(String type, String target, String targetType, String title, String body, String redirectId, String redirectTo, String attachmentType, String attachmentId) {
    try {
      type = checkParam(type, true);
      target = checkParam(target, false);
      targetType = checkParam(targetType, true);
      title = checkParam(title, false);
      body = checkParam(body, false);
      redirectId = checkParam(redirectId, true);
      redirectTo = checkParam(redirectTo, false);
      attachmentType = checkParam(attachmentType, false);
      attachmentId = checkParam(attachmentId, false);

      String qry = "INSERT INTO uti_message (type, target, target_type, title, body, redirect_id, redirect_to, attachment_type, attachment_id, created_at) "
              + " VALUES (" + type + "," + target + "," + targetType + "," + title + "," + body + "," + redirectId + "," + redirectTo + "," + attachmentType + "," + attachmentId + ", NOW())  ";
      session = em.unwrap(Session.class);
      session.createNativeQuery(qry).executeUpdate();

//      String qry = "INSERT INTO uti_message (type, target, target_type, title, body, redirect_id, redirect_to, attachment_type, attachment_id, created_at) "
//              + " VALUES (?,?,?,?,?,?,?,?,?,?)  ";
//      session = em.unwrap(Session.class);
//      transaction = session.beginTransaction();
//      query = session.createNativeQuery(qry)
//              .setParameter(1, type)
//              .setParameter(2, target)
//              .setParameter(3, targetType)
//              .setParameter(4, body)
//              .setParameter(5, title)
//              .setParameter(6, redirectId)
//              .setParameter(7, redirectTo)
//              .setParameter(8, attachmentType)
//              .setParameter(9, attachmentId)
//              .setParameter(10, "NOW()");
//      query.executeUpdate();
//      System.out.println(query.getResultStream());
//      transaction.commit();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public String checkParam(String params, boolean isNumber) {
//    System.out.println("HERE IS"+params);
    if (params == null || params.equals("")) {
      params = "NULL";
    } else {
      if (!isNumber) {
        params = "'" + params + "'";
      }
    }
    return params;
  }

}
