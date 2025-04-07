/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym.management.system;

/**
 *
 * @author Msaif
 */
class customers {
    private String sno,name,membership,amount;
    public customers(String sno,String name,String membership,String amount){
        this.sno=sno;
        this.name=name;
       this.membership=membership;
      this.amount=amount;
    }
    public String getsno(){
        return sno;
    }
    public String getname(){
        return name;
    }
    public String getamount(){
        return amount;
    }
    public String getmembership(){
        return membership;
    }
}
