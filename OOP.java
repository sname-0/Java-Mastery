import java.util.*;
interface Chargeable{
  void chargeBattery() ;
}
interface NetworkConnectable{
  void connectToWifi();
}
abstract class SmartDevice implements Chargeable{
String deviceName;
  int batteryLevel;

public SmartDevice(String deviceName, int batteryLevel){
  this.deviceName = deviceName;
  this.batteryLevel = batteryLevel;
}
}
class SmartCar extends SmartDevice implements NetworkConnectable{
  public SmartCar(String deviceName , int batteryLevel){
    super(deviceName, batteryLevel);
  }
  @Override
  public void chargeBattery(){
    System.out.println(deviceName + "is charging now...Battery at" + batteryLevel+ "%"  );
  }
@Override
  public void connectToWifi(){
    System.out.println(deviceName + "is connected to smart city 5G Wi-Fi!");
}
}
class Main{
  public static void main(String[] args) {
    SmartCar Mycar = new SmartCar("Tesla",85);
    Mycar.chargeBattery();
    Mycar.connectToWifi();
  }
}








  

