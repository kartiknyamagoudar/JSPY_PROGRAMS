package encapsulation;

class Instagram{
private String pwd="sadiq123";
public String getpwd(){
return pwd;
}
public void setpwd(String pwd){
this.pwd=pwd;
}
}
class Mainclass{
public static void main(String[] args){
Instagram i=new Instagram();
System.out.println(i.getpwd());
i.setpwd("hello123");
System.out.println(i.getpwd());
}
}