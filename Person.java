public class Person {
    /**modifier */   protected String name;
                     protected String address;
    /**
    *Default constructor
     */

    public Person(){
        System.out.println("Inside Person:Constructor");
    name = "";
    address = "";
    }
    /**
    *Constructor dengan dua parameter
     */
     public Person(String vname, String vaddress){
         this.name = vname;
         this.address = vaddress;
     }
    /**
    *Method accessor
    method utk menangani variabel atribut sebuah class
    - get : pakai function
    - set : method void pakai parameter
     */
     public String getName(){
         return name;
     }

     public String getAddress(){
         return address;
     }

    public void setName(String vname){
         this.name = vname;
     }

     public void setAddress(String vaddress){
         this.address= vaddress;
     }
     
}