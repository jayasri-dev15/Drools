package com.sample;

import java.util.List;

public class Customer 

{

 private String custId;

 private String custType;

 private List<Stocks> stocks;

 public String getCustId() {
  return custId;
 }

 public void setCustId(String custId) {
  this.custId = custId;
 }

 public String getCustType() {
  return custType;
 }

 public void setCustType(String custType) {
  this.custType = custType;
 }

 public List<Stocks> getStocks() {
  return stocks;
 }

 public void setStocks(List<Stocks> stocks) {
  this.stocks = stocks;
 }
}
