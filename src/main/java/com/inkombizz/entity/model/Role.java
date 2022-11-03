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
@Table(name = "scr_role")
public class Role extends BaseModel implements Serializable {

  @Id
  @NotEmpty
  @Column(name = "Code")
  private String code = "";

  @Column(name = "Name")
  private String name = "";

  @Column(name = "JobPositionCode")
  private String jobPositionCode = "";

  @Column(name = "Remark")
  private String remark = "";
  
  @Column(name = "ActiveStatus")
  private boolean activeStatus = false;

}
