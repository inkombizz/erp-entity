package com.inkombizz.entity.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.inkombizz.base.BaseModel;

import lombok.Data;

@Entity
@Data
@Table(name = "sys_data_protection")
public class DataProtect extends BaseModel implements Serializable {

  @Id
  @NotEmpty
  @Column(name = "Code")
  private String code = "";

  @Column(name = "MonthPeriod")
  private int monthPeriod = 0;

  @Column(name = "YearPeriod")
  private int yearPeriod = 0;
}
