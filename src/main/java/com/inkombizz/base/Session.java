/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkombizz.base;

import com.inkombizz.entity.model.UserDetails;
import com.inkombizz.exeption.CustomException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.hibernate.Transaction;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

/**
 *
 * @author imamsolikhin
 */
@Component
public class Session {

  @PersistenceContext
  public EntityManager em;

  public Query query;
  public org.hibernate.Session session;
  public Transaction transaction;

  public static String username() {
    try {
      Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
      if (null != authentication) {
        UserDetails userDetail = (UserDetails) authentication.getDetails();
        return userDetail.getUsername();
      }
      return null;
    } catch (Exception e) {
      throw new CustomException("Token is not valid", HttpStatus.FORBIDDEN);
    }
  }

  public static UserDetails userdetail() {
    try {
      Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
      if (null != authentication) {
        return (UserDetails) authentication.getDetails();
      }
      return null;
    } catch (Exception e) {
      throw new CustomException("Token is not valid", HttpStatus.FORBIDDEN);
    }
  }

  public static String employeeCode() {
    try {
      Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
      if (null != authentication) {
        UserDetails userDetail = (UserDetails) authentication.getDetails();
        return userDetail.getEmployeeCode();
      }
      return null;
    } catch (Exception e) {
      throw new CustomException("Token is not valid", HttpStatus.FORBIDDEN);
    }
  }

}
