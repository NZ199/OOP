/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymsubscription;


/**
 *
 * @author noufz
 */
public class Subscription {
    //FILED
    private int  period; //Period of supscription
    public static  int price ;//price of subscription
    private String Coache;// The coache name
    
    
    //METHOD
public  Subscription(){
  period=0;
  Coache="";
    
}

/**
 * This constructor initializes the initializes the period,
 * and coaches filed
 * @param per  the Period of subscription.
 * @param coa  the Coaches name.
 */
public  Subscription(int per ,String coa){
    
 period =per; 

 Coache =coa; 
    
}

public Subscription(Subscription object2){
    period=object2.period;
    Coache=object2.Coache;
    
    
}

    Subscription( int Coac, int per) {
        period=per;
        Coac=0;
    }

    public int getSubscription(int period, int Coache) {
       return Coache;
      
    }

  

   
public void setperiod(int per){
     period =per; 

}
public int getperiod(){
    
    return period;
}   



public void setCoache(String coa){
Coache =coa;
}
public String getCoache1(){
    
    return Coache;
}
/**
  toString method 
  @return  A string containing the Subscription 
  information .
 */
    @Override
    public String toString (){
   //Create a String representing the object .
    String str =
                 "\nCoache "+Coache;
    //return the string .
    return str;
}


}
