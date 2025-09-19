package encapsulation;

class Tiktok{
private  double balance=155.00;
private String username="sadiq";
private String pass="sad12";
public double getbalance(){
return balance;
}
public String getusername(){
return username;
}
public String getpass(){
return pass;
}

public void setbalance(double balance){
this.balance=balance;
}
public void setusername(String username){
this.username=username;
}
public void setpass(String pass){
this.pass=pass;
}
}
class Main2{
public static void main(String[] args){
Tiktok i=new Tiktok();
System.out.println(i.getbalance());
i.setbalance(2300.00);
System.out.println(i.getbalance());
System.out.println(i.getusername());
System.out.println(i.getpass());

}
}