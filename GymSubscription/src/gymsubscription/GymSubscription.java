

/**The project is  the customer books the participation 
in the sports club and determines the period of participation and the coaches
*/
package gymsubscription;


import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;



/**
 *
 * @author noufz
 */

// class GymSubscription

public class GymSubscription {





            /**
             * @param args the command line arguments
             * @throws java.io.FileNotFoundException
             */
            public static void main(String[] args) throws FileNotFoundException {
                final int PRICE_ONE_MONTH = 100;
                final int PRICE_THREE_MONTH = 300;
                final int PRICE_ONE_YEAR= 1200;
                String name;

                Long phone;
                int  period = 0;
                int select=0 ;
                int Coache = 0;
                int bookNumber = 0;




                // TODO code application logic here

                 Scanner scan = new Scanner(System.in);
                //Display  and get information Customer.
                System.out.println("<<<<< Welcome to the Gym >>>>>");

                System.out.println("Please Enter your name : ");
                      name = scan.nextLine();

                System.out.println("Please Enter your phone number : ");
                      phone= scan.nextLong();





               Customer cus = new Customer (name ,phone);//object 1 for class Customer.


                    Subscription Coache1= new Subscription();
                       Coache1.setCoache("Ahamd");
                    Subscription Coache2= new Subscription();
                       Coache2.setCoache("Mohamed");
                    Subscription Coache3= new Subscription();
                       Coache3.setCoache("Omar");


               System.out.println("Periods and Coaches available in the gym");
               System.out.println("Choose   "+"1 : One month with Coache Ahamd  " +" 3 : Three month with 1 : One month with Coache Mohamed   "
                                   +" 12 : One year with Coache Omar ");
               period=scan.nextInt();


                 Subscription sub= new Subscription(period,Coache); //object2 for class subscription. 
                 Book num=new Book(bookNumber);//object3 for class book.
               
                try ( //Print The Book in File.
                        PrintWriter outputFile = new PrintWriter("Book.txt")) {


                     outputFile.println("---------------------------------------");
                    outputFile.println("          "+"The book "+ " " +num.getBookNumber());        
                    outputFile.println("---------------------------------------");
                    outputFile.println("Customer Name : "+cus.name );
                    outputFile.println("Customer phone : "+cus.phone);
                    outputFile.println("The Subscription information  for  "+ period+ " month : ");


                 
                    switch(period)
                    {
                        case 1:

                            System.out.println("One month subscription ");
                            System.out.println("The price of one month is "+PRICE_ONE_MONTH );
                            System.out.println("with"+Coache1) ;
                            //output in file
                            // print in file
                              outputFile.println("Period :"+"One month subscription ");
                              outputFile.println("Price  :"+PRICE_ONE_MONTH+"SAR" );
                              outputFile.println("Coache :"+Coache1); 



                            break;

                        case 3 :
                            System.out.println("Three month subscription ");
                            System.out.println("The price of three month is "+ PRICE_THREE_MONTH);
                            System.out.println("with"+Coache2) ;
                                 // print in file
                              outputFile.println("Period :"+" Three month subscription ");
                              outputFile.println("Price  :"+ PRICE_THREE_MONTH +"SAR");
                              outputFile.println("Coache :"+Coache2); 

                            break;

                        case 12 :
                            System.out.println("One year subscription ");
                            System.out.println("The price of one year is "+ PRICE_ONE_YEAR);
                            System.out.println(Coache3) ;
                            // print in file
                              outputFile.println("Period :"+"One year subscription ");
                              outputFile.println("Price  :"+ PRICE_ONE_YEAR+"SAR");
                              outputFile.println("Coache :"+Coache3); 
                            break;

                        default:
                            System.out.println("Error ! Invalid period ");
                            System.out.println("The Subscription information will not print");
                            System.out.println("RUN CODE AGAIN!");
                            System.out.println("And Choose Number 1 ,3 or 12");
                                // print in file
                              outputFile.println("Error ! Invalid period ");
                              outputFile.println("The Subscription information will not print");
                              outputFile.println("RUN CODE AGAIN!"+"And Choose Number 1 ,3 or 12"); 


                            break;


                    }
                    outputFile.println("---------------------------------------");

                    }

                   }

                   }







    
  