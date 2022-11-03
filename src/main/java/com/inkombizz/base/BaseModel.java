/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkombizz.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

/**
 *
 * @author imamsolikhin
 */
@Data
@MappedSuperclass
public abstract class BaseModel {

  @JsonIgnore
  @CreatedBy
  @Column(name = "CreatedBy", updatable = false)
  private String createdBy = "";

  @JsonIgnore
  @CreatedDate
  @Column(name = "CreatedDate", updatable = false)
  @Temporal(javax.persistence.TemporalType.TIMESTAMP)
  private Date createdDate;

  @JsonIgnore
  @LastModifiedBy
  @Column(name = "UpdatedBy", updatable = true)
  private String updatedBy = "";

  @JsonIgnore
  @LastModifiedDate
  @Column(name = "UpdatedDate", updatable = true)
  @Temporal(javax.persistence.TemporalType.TIMESTAMP)
  private Date updatedDate;

  @PrePersist
  void onCreate() {
    this.createdBy = Session.username();
    this.createdDate = new Date();
  }

  @PreUpdate
  void onPersist() {
    this.updatedBy = Session.username();
    this.updatedDate = new Date();
  }
}
