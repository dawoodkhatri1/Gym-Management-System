/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym.management.system;

/**
 *
 * @author Msaif
 */
class customers2 {
     private String sno,weight,age,amount;
    private String name,mobilenumber,email,gender,fathername,address,height,membership, gymtime, cnicnumber;
    public customers2(String sno,String name,String mobilenumber,String email,String gender,String fathername,String address,String height,String weight,String membership,String gymtime,String cnicnumber,String age,String amount){
        this.sno=sno;
        this.name=name;
        this.mobilenumber=mobilenumber;
        this.email=email;
        this.gender=gender;
        this.fathername=fathername;
        this.address=address;
        this.height=height;
        this.weight=weight;
        this.membership=membership;
        this.gymtime=gymtime;
        this.cnicnumber=cnicnumber;
        this.age=age;
        this.amount=amount;
    }

    customers2(String string, String string0, String string1, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String getsno(){
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
    }public String getweight(){
        return weight;
    }public String getmembership(){
        return membership;
    }
    public String getgymtime(){
        return gymtime;
    }
    public String getcnicnumber(){
        return  cnicnumber;
    }
    public String getage(){
        return age;
    }
    public String getamount(){
        return amount;
    }
    
    
    
}



