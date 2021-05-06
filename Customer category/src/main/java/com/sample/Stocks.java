package com.sample;                 // Sample code to segregate the customer has gold and platinum category based on the item list

public class Stocks 

{

 private String name;

 private int quantity;

 private double buyPrice;

 public Stocks(String name, int quantity, double buyPrice) 
 
 {
  super();
  this.name = name;
  this.quantity = quantity;
  this.buyPrice = buyPrice;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public int getQuantity() {
  return quantity;
 }

 public void setQuantity(int quantity) {
  this.quantity = quantity;
 }

 public double getBuyPrice() {
  return buyPrice;
 }

 public void setBuyPrice(double buyPrice) {
  this.buyPrice = buyPrice;
 }

}