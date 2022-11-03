package com.inkombizz.entity.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.inkombizz.base.BaseModel;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "scr_role_authorization")
@Data
@NoArgsConstructor
public class RoleAuthorization extends BaseModel implements Serializable {

  @Id
  @NotEmpty
  @Column(name = "Code")
  private String code = "";
  
  @Column(name = "HeaderCode")
  private String headerCode = "";
  
  @Column(name = "AuthorizationCode")
  private String authorizationCode = "";
  
  @Column(name = "AssignAuthority")
  private boolean assignAuthority = false;
  
  @Column(name = "SaveAuthority")
  private boolean saveAuthority = false;
  
  @Column(name = "UpdateAuthority")
  private boolean updateAuthority = false;
  
  @Column(name = "DeleteAuthority")
  private boolean deleteAuthority = false;
  
  @Column(name = "PrintAuthority")
  private boolean printAuthority = false;

}
