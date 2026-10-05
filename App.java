import java.util.*;
public class App {
public static boolean check (String name ){
  if (name.length() >= 8 && name.contains("@" ) ){
    return  true ;
  }
  else{
    return false;
  }
}
public static void main(String[] agrs){
  Scanner in = new Scanner(System.in);
  System.out.println("enter the password");
  String pass = in.nextLine();
  if (check(pass)){
    System.out.println("pass is strong");
  }

  else{
    System.out.println("pass is weak");
  }
}
}

      

  

   

    



  


