package com.inkombizz.entity.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.inkombizz.base.BaseModel;
import java.util.List;
import org.hibernate.validator.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "scr_user")
@NoArgsConstructor
public class User extends BaseModel implements Serializable {

  private static final long serialVersionUID = 5926468583005150707L;

  @Id
  @Column(name = "code")
  private String code;

  @ManyToOne
  @JoinColumn(name = "RoleCode", referencedColumnName = "code")
  private Role role;

  @NotEmpty
  @Column(name = "FullName")
  private String fullName;

  @NotEmpty
  @Column(name = "username")
  private String username;

  @Column(name = "password")
  private String password;

  @Column(name = "EmailAddress")
  private String emailAddress;

  @Column(name = "EmployeeCode")
  private String employeeCode;
  
  @Column(name = "DefaultBranchCode")
  private String defaultBranchCode;
  
  @Column(name = "DefaultWarehouseCode")
  private String defaultWarehouseCode;
  
  @Column(name = "DefaultCashAccountCode")
  private String defaultCashAccountCode;
  
  @Column(name = "DefaultBankAccountCode")
  private String defaultBankAccountCode;

  @Column(name = "ActiveStatus")
  private boolean activeStatus = false;

  @Column(name = "SuperUserStatus")
  private boolean superUser = false;

  private transient List<UserJnBranch> listBranch;
  private transient List<UserJnWarehouse> listWarehouse;
  private transient List<UserJnCashAccount> listCashAccount;
  private transient List<UserJnBankAccount> listBankAccount;
  
  private transient Object menus;
  private transient Setup setup;
}
