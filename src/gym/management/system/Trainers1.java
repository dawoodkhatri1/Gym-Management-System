/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym.management.system;

/**
 *
 * @author Msaif
 */
class Trainers1 {
     private int sno,weight,age,amount;
    private String name,mobilenumber,email,gender,fathername,address,height,minimumagreement,membership, gymtime, cnicnumber;
    public Trainers1(int sno,String name,String mobilenumber,String email,String gender,String fathername,String address,String height,int weight,String minimumagreement, String membership,String gymtime,String cnicnumber,int age,int amount){
        this.sno=sno;
        this.name=name;
        this.mobilenumber=mobilenumber;
        this.email=email;
        this.gender=gender;
        this.fathername=fathername;
        this.address=address;
        this.height=height;
        this.weight=weight;
        this.minimumagreement=minimumagreement;
        this.membership=membership;
        this.gymtime=gymtime;
        this.cnicnumber=cnicnumber;
        this.age=age;
        this.amount=amount;
    }

    Trainers1(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public int getsno(){
        return sno; 
    }
    public String getname(){
        return name;
    }
    public String getmobilenumber(){
        return mobilenumber;
    }
    public String getemail(){
        return email;
    }
    public String getgender(){
        return gender;
    }
    public String getfathername(){
        return fathername;
    }
    public String getaddress(){
        return address;
    }public String getheight(){
        return height;
    }public int getweight(){
        return weight;
    }
    public String getminimumagreement(){
        return minimumagreement;
    }
      public String getmembership(){
        return membership;
    }
    public String getgymtime(){
        return gymtime;
    }
    public String getcnicnumber(){
        return  cnicnumber;
    }
    public int getage(){
        return age;
    }
    public int getamount(){
        return amount;
    }
    
    
    
}




