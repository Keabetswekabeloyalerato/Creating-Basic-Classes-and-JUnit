public class Student{
   private String firstName;
   private String middleName;
   private String lastName;
   
   public void setNames(String first,String middle, String last){
      firstName=first;
      middleName=middle;
      lastName=last;
   }
   
   public String getFullName(){
      String middleInitial= middleName.isEmpty()?"": middleName.substring(0,1)+".";
      return firstName+" "+middleInitial+" "+lastName;
      }
}