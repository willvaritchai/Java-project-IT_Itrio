/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Member {
   private String name;
   private int weight;
   private int height;
   
   public Member(String name,int weight,int height){
       this.name=name;
       this.weight=weight;
       this.height=height;
   }

   
    @Override
    public  String toString() {
        return "   Member -> [" + "name= " + name + " , weight= " + weight + "kg." + " , height= " + height + "cm." + "] ";
    }


   
   
}
