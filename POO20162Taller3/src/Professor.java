public class Professor
{

    // ----------------------------------------------------------------------- ATTRIBUTES

    private String name;
    private String employeeID;
    private String birthDate;
    private String address;
    private Department worksFor;
    private Student advisee;
    private double gpa;

    // ---------------------------------------------------------------------- CONSTRUCTOR

    public Professor (String newName, String newEmployeeID, String newBirthDate, String newAdress, Double newGpa)
    {
        setName(newName);
        setEmployeeID(newEmployeeID);
        setBirthDate(newBirthDate);
        setAddress(newAdress);
        setGpa(newGpa);
    }

    // ---------------------------------------------------------------------- METHODS

    public String getName()
    {
        return name;
    }

    private void setName(String name)
    {
        this.name = name;
    }

    public String getEmployeeID()
    {
        return employeeID;
    }

    private void setEmployeeID(String employeeID)
    {
        this.employeeID = employeeID;
    }

    public String getBirthDate()
    {
        return birthDate;
    }

    private void setBirthDate(String birthDate)
    {
        this.birthDate = birthDate;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public Department getWorksFor()
    {
        return worksFor;
    }

    public void setWorksFor(Department worksFor)
    {
        this.worksFor = worksFor;
    }

    public Student getAdvisee()
    {
        return advisee;
    }

    public void setAdvisee(Student advisee)
    {
        this.advisee = advisee;
    }

    public double getGpa()
    {
        return gpa;
    }

    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }

    public void printAllAttributes ()
    {
        TextIO.putln("Name: " + this.getName());
        TextIO.putln("ID: " + this.getEmployeeID());
        TextIO.putln("Address: " + this.getAddress());
        TextIO.putln("Birth date: " + this.getBirthDate());
        TextIO.putln("Department: " + this.worksFor.getName());
        TextIO.putln("Advisee: " + this.advisee.getName());
        TextIO.putln("GPA: " + this.getGpa());
        TextIO.putln();
    }


}
