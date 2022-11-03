/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkombizz.entity.model;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author imamsolikhin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
  private String code;
  private String parentCode;
  private String name;
  private String menuType;
  private String classes;
  private long rowNo;
  private String text;
  private String link;
  private String icon;
  private long sortNo;
  private byte isBackEndStatus;
  private byte isMobileApps;
  private List<Menu> parent = new ArrayList();
}
