//StaffHire(Base class )This class holds vacancy information and general staff details.
public class StaffHire 
{
     private int vacancyNumber;
     private String designationType;
     private String jobType;
     private String staffName;
     private String joiningDate;
     private String qualification;
     private String appointedBy; 
     private boolean joined;
     
     public StaffHire(int newVacancyNumber,String newDesignationType
     ,String newJobType,String newStaffName,String
     newJoiningDate,String newQualification,String
     newAppointedBy, boolean newJoined) //constructor method initialising all the attributes
     { 
      vacancyNumber = newVacancyNumber ;
      designationType = newDesignationType;
      jobType = newJobType;
      staffName = newStaffName;
      joiningDate = newJoiningDate;
      qualification = newQualification;
      appointedBy = newAppointedBy; 
      joined = newJoined;
     }
     //Getter and Setter methods for all attributes
     public void setVancancyNumber(int vacancyNumber) {

     } 
     public int getVacancyNumber() {  
         return vacancyNumber;
     
     }
     
     public void setDesignationType(String designationType) {
     }
     public String getDesignationType()
     {   return designationType;
        
     }
     
     public void setJobType(String jobType) {
      
     }
     public String getJobType() 
     {   return jobType;
     
     }
     
     public void setStaffName(String staffName) {
     }
     public String getStaffName() 
     {  return staffName;
     
     }
     
     public void setJoiningDate(String joiningDate) {
     }
     public String getJoiningDate()
     {  return joiningDate;
        
     }
    
     public void setQualification(String qualification) {
    }
    public String getQualification() 
    {   return qualification; 
    
    } 
    
    public void setAppointedBy(String appointedBy) {
    }
    public String getAppointedBy()
    {   return appointedBy;
    
    }
    
    public void setjoined(boolean joined) {
    }
    public boolean getJoined()
    {   return joined;
    
    }
    //Display method to print basic staff information
    public void display() {
        System.out.println("Vacancy Number: " + vacancyNumber);
        System.out.println("Designation: " + designationType);
        System.out.println("Job Type: " + jobType);
        System.out.println("Staff Name: " + staffName);
        System.out.println("Joining Date: " + joiningDate);
        System.out.println("Qualification: " + qualification);
        System.out.println("Appointed By: " + appointedBy);
        System.out.println("Joined: " + joined);
    }
}
    
    
    
    