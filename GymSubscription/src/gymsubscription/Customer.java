/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymsubscription;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileNotFoundException;

/**
 *
 * @author noufz
 */
// class Customer 
public class Customer {
    //FILED
    //The Customer name
    public String name;
    //The Customer phone
     Long phone;
     
 
    
    

//METHOD


public Customer(){
name="";
phone=null;

}
/**
 *This constructor initializes  the name and phone
 * @param nam The Customer name
 * @param pho The Customer phone
 */
public Customer(String nam , Long pho){

this.name=nam;
this.phone=pho;
}


public Customer(Customer object2){
    
    name=object2.name;
    phone=object2.phone;
}

    Customer(String nam, int  phon) {
        name=nam;
        
        
    }
/**
 * 
 * @param p phone number of customer.
 */
 
public void setPhone(Long p){
    phone=p;
    
}
/**
 * 
 * @return phone number of customer 
 */
public Long getPhone(){
    return phone;
}

/**
     *
     * @return  string
     */
  
    @Override
    public String toString (){
     
     //Create a String representing the object .
    
  String str ="Name :"+name+
              "\n phone number :  "+phone;
  
  //return the String .
  return str;
}

    /**
     *
     * @param name name of customer.
     */
    public void addCustomer(String name)
{
    
    ArrayList<String>customerArray = new  ArrayList<>();
    customerArray.add(name);


   
    
}



  public void PrintCustomer() throws FileNotFoundException , IOException
        {

         
    File Open = new File ("C:\\Users\\noufz\\Documents\\NetBeansProjects\\GymSubscription-نسخة\\Customer.txt");

    FileWriter writte  =new FileWriter(Open,true);
        String customerArray = null;
     for(int count=0;count<customerArray.length();++count){
      writte.write(count+"   "+customerArray);

     }

     
     


        
}
}


        
  