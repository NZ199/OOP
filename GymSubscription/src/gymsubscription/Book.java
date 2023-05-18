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
public class Book {
    //FILED

    public  int bookNumber=1; //Number of the book
    private Customer customer; // The customer
    private Subscription subscription; //The spscription
     //METHOD   
   public Book( ){
      bookNumber=0;
      
          
      
       
   }
    /**
     * This constructor initializes the book number ,customer and subscription filed.
     * @param num the number of the book
     * @param cou A Customer object.
     * @param sup A  Subscription.
     */
     public Book( int num ,Customer cou ,Subscription sup)
     {
         //Assign the booknumber
         bookNumber = num;
         customer =new Customer (cou);
         subscription= new Subscription(sup);
 
          
     
    
}

    Book(int num) {
      bookNumber =num;
      
    }


       public Customer getCustomer(){
           return new Customer(customer);
       }
        public Subscription getSubscription(){
        return new Subscription (subscription);
        }
           
        public int getBookNumber(){
            return bookNumber=1;
        }
        
        /**
         * toString method 
         * @return  A string containing the Book information .
         */
    @Override
        public String toString(){
             //Create a String representing the object .
            String str= "book number : "+bookNumber+
                       "\n Customer Customer :\n"+
                      customer +
                      "\nSubscription Information :\n"+
                       subscription ;
            //
            return str;
                         
        }
        
}
        
