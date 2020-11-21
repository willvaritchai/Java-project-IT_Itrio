public class Member {
   private String name;
   private long id;
   
   public Member(String name,long id){
       this.name=name;
       this.id=id;
   }
   
   
    @Override
    public  String toString() {
        return "   Member -> [" + "name= " + name + " , id= " + id + "] ";
    }


   
   
}
