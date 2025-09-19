package encapsulation;


class Facebook{
private String pwd="sadiq123";
public String getpwd(){
return pwd;
}
public void setpwd(String pwd){
this.pwd=pwd;
}
}
class Main1{
public static void main(String[] args){
Facebook i=new Facebook();
System.out.println(i.getpwd());
i.setpwd("hello123");
System.out.println(i.getpwd());
}
}