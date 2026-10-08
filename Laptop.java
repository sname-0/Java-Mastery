import java.util.*;
class Laptop{
   private String Brand ;
   private int Ram ;

  Laptop(String Brand , int Ram){
    this.Brand = Brand ;
    this.Ram = Ram ;
  }
    public String getBrand(){
      return this.Brand;
    }
  
    public int getRam(){
      return this.Ram;
    }
  }
class Main{
  public static void main(String[] args) {
    Laptop lap = new Laptop("HP", 20);
    System.out.println(lap.getBrand());
    System.out.println(lap.getRam());
  }
}



    



  


