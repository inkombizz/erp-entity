package com.inkombizz.entity.model;

import com.inkombizz.base.BaseModel;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sys_setup")
@Data
@NoArgsConstructor
public class Setup extends BaseModel implements Serializable {

  @Id
  @NotEmpty
  @Column(name = "Code")
  private String code = "";

  @Column(name = "CompanyName")
  private String companyName = "";
  
  @Column(name = "CompanyAcronym")
  private String companyAcronym = "";
  
  @Column(name = "LogoPath")
  private String logoPath = "";
  
  @Column(name = "WebTitle")
  private String webTitle = "";
  
  @Column(name = "CurrencyCode")
  private String currencyCode = "";
  
  @Column(name = "DefaultDealerPriceTypeCode")
  private String defaultDealerPriceTypeCode = "";
  
  @Column(name = "VATPercent")
  private BigDecimal vatPercent = BigDecimal.ZERO;
  
  @Column(name = "VATDivision")
  private BigDecimal vatDivision = BigDecimal.ZERO;
  
  @Column(name = "JournalCode")
  private String journalCode = "";
  
  @Column(name = "EceranPalletTypeCode")
  private String eceranPalletTypeCode = "";
  
  @Column(name = "StockOpnameItemQuantity")
  private String stockOpnameItemQuantity = "";
}
