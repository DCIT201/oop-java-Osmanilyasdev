public class Customer {
   private String customerId;
   private String name;

   public Customer(String customerId, String name){
       this.customerId = customerId;
       this.name = name;
   }
   public String getName(){
       System.out.println(name);
       return name;
   }
}