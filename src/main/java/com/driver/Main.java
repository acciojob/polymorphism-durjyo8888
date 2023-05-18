package com.driver;

public class Main {
  public class Product{

    public int product(int x, int y){
      return 1;
    }

    public int product(int x, int y, int z){
      return 2;
    }
    public double product(double x, double y){
      return 3;
    }

    public void main(String[]args){
      Product p = new Product();

      System.out.println(p.product(10,20));

      System.out.println(p.product(10,20,30));

      System.out.println(p.product(10.5,20.5));


    }
  }
}