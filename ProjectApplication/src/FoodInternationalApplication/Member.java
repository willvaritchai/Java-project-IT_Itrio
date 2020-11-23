package FoodInternationalApplication;

public class Member {
   private final String name;
   private final long id;
   
   public Member(String name,long id){
       this.name=name;
       this.id=id;
   }
   
   
    @Override
    public  String toString() {
        return "   [" + "name= " + name + " , id= " + id + "] ";
    }


   
   
}
