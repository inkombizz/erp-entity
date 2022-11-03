package com.inkombizz.entity.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.inkombizz.base.BaseModel;
import com.inkombizz.base.Session;
import java.util.Date;
import javax.persistence.PrePersist;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "scr_user_branch")
@NoArgsConstructor
public class UserJnBranch extends BaseModel implements Serializable {

  private static final long serialVersionUID = 5926468583005150707L;

  @Id
  @Column(name = "code")
  private String code;

  @Column(name = "UserCode")
  private String userCode;

  @Column(name = "BranchCode")
  private String branchCode;

  @Column(name = "PYQApprovalLimitFrom")
  private String pyqApprovalLimitFrom;

  @Column(name = "PYQApprovalLimitTo")
  private String pyqApprovalLimitTo;
}
