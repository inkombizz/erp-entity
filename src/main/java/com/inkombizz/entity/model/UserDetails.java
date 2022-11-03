/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkombizz.entity.model;

import java.util.Collection;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

/**
 *
 * @author imamsolikhin
 */
@Data
public class UserDetails extends User {

  private String employeeCode;
  private Setup setup;

  public UserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities) {
    super(username, password, authorities);
  }

}
