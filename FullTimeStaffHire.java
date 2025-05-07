
//FullTimeStaffHire - Subclass of StaffHire for full-time staff
public class FullTimeStaffHire extends StaffHire 
{
    private double salary;
    private int weeklyFractionalHours;

    public FullTimeStaffHire(int newWeeklyFractionalHours,double newSalary,int vacancyNumber,
    String designation, String jobType, String staffName, String joiningDate, String 
    qualification, String appointedBy, boolean joined) 
    //Constructor that calls the superclass and sets the Fulltime attributes
    {  super( vacancyNumber, designation, jobType, staffName, joiningDate, qualification,
        appointedBy, joined);
      salary = newSalary;
      weeklyFractionalHours = newWeeklyFractionalHours;
      
    }
    //Set a new salary if staff is already joined
    public void setSalary(double newSalary) { 
        if (getJoined()) {
            salary = newSalary;
        }
        else { 
            System.out.println("N/A");
        }
    }
    // Getter and Setter methods
    public double getSalary() {
        return salary;
    }
    
    public void setWeeklyFractionalHours(int weeklyFractionalHours) {
        if(getJoined()){
        weeklyFractionalHours = weeklyFractionalHours;
        } else {
            System.out.println("Cannot change working hours after the staff has joined.");
        }
    }
    public int getWeeklyFractionalHours () {
        return weeklyFractionalHours;
    }
    @Override
    public void display() {
        super.display(); // Display base class details
        System.out.println("Salary: " + salary);
        System.out.println("Weekly Fractional Hours: " + weeklyFractionalHours);
    }
    
}
