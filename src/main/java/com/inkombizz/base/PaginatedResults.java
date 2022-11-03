package com.inkombizz.base;

import lombok.Data;

@Data
public class PaginatedResults {
  
  private Object status = 200;
  private Object message = "";
  private Object data = "";
  private long currentData = 0;
  private long totalData = 0;
  private long totalPage = 0;

  public PaginatedResults(Object data) {
    this.data = data;
  }

  public PaginatedResults(Object data, Object message) {
    this.data = data;
    this.message = message;
  }

  public PaginatedResults(Object data, Object message, long currentData, long totalData, long totalPage) {
    this.message = message;
    this.data = data;
    this.currentData = currentData;
    this.totalData = totalData;
    this.totalPage = totalPage;
  }
}
