
//PartTimeStaffHire -Subclass of StaffHire for part-time staff
public class PartTimeStaffHire extends StaffHire
{
    // instance variables - replace the example below with your own
    private int workingHour;
    private double wagesPerHour;
    private String shifts;
    private boolean terminated;

    
     public PartTimeStaffHire(int newWorkingHour, double newWagesPerHour, String newShifts, int vacancyNumber, String designation, String jobType,String staffName, String joiningDate, String qualification,
     String appointedBy, boolean joined) //Constructor that calls the superclass and sets the Parttime attributes
     {
        super(vacancyNumber, designation, jobType, staffName, joiningDate, qualification, appointedBy, joined);
        workingHour = newWorkingHour;
        wagesPerHour = newWagesPerHour;
        shifts = newShifts;
        terminated = false; 
    }
    //Getter and Setter Methods
    public void setWorkingHour(int workingHour) { 
        if (getJoined()) {
            workingHour = workingHour;
        } else {
            System.out.println("Cannot update working hours after staff has joined.");
        }
    }
    public int getWorkingHour() 
    { 
        return workingHour;
    }
    
    public void setWagesPerHour(double wagesPerHour) {
        if (getJoined()) {
            wagesPerHour = wagesPerHour;
        } else {
            System.out.println("Cannot update wage after staff has joined.");
        }
    
    }
    public double getWagesPerHour()
    {
        return wagesPerHour;
    }
    //set shift is staff has joined
    public void setShifts(String newShifts) {
        if (getJoined()) {
            shifts = newShifts;
        }
        else { System.out.println("Staff member has to join before shift is set");
        }
    }
    //terminate the staff
    public void terminate(boolean terminate){
        if (terminated) {
            System.out.println("This staff member has been terminated.");
        } else {
            System.out.println("Staff member has not been terminated.");
        }
    }
    public String getShifts() 
    {   
        return shifts;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Working Hour: " + workingHour);
        System.out.println("Wages Per Hour: " + wagesPerHour);
        System.out.println("Shifts: " + shifts);
        System.out.println("Terminated: " + terminated);
        if (getJoined()) {
            System.out.println("Income per Day: " + (workingHour * wagesPerHour));
        }
    }
    }
