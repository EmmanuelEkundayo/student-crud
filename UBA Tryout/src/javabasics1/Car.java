package javabasics1;

import java.util.Date;

public class Car {

  private String name;
  private String color;

  private Date manufactureDate;

//  public Car(){
//
//  }

  public Car(String name){
      this.name = name;
      this.manufactureDate = new Date();

  }

  public String getName(){
      return name;
  }


  public void setName(String name){
      this.name = name;
  }

    public String getColor(){
        return color;
    }


    public void setColor(String color){
        this.color = color;
    }

    public Date getManufactureDate(){
        return manufactureDate;
    }


    public void setManufactureDate(Date date){
        this.manufactureDate = date;
    }


    @Override
    public String toString(){
      return "[name => "+name +" : color => "+color +  " manufactured date => "+manufactureDate + "]";

    }







}
