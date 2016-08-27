public class Student
{

    // ------------------------------------------------------------------ ATTRIBUTES

    private String name;
    private String studentID;
    private String birthDate;
    private String address;
    private Department major;
    private double gpa;
    private Professor adviser;

    // ------------------------------------------------------------------ CONSTRUCTOR

    public Student (String newName, String newStudentID, String newBirthDate, String newAddress, double currentGPA)
    {
        setName(newName);
        setStudentID(newStudentID);
        setBirthDate(newBirthDate);
        setAddress(newAddress);
        setGpa(currentGPA);
    }

    // ------------------------------------------------------------------- METHODS

    public String getName()
    {
        return name;
    }

    private void setName(String name)
    {
        this.name = name;
    }

    public String getStudentID()
    {
        return studentID;
    }

    private void setStudentID(String studentID)
    {
        this.studentID = studentID;
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

    public Department getMajor()
    {
        return major;
    }

    public void setMajor(Department major)
    {
        this.major = major;
    }

    public double getGpa()
    {
        return gpa;
    }

    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }

    public Professor getAdviser()
    {
        return adviser;
    }

    public void setAdviser(Professor adviser)
    {
        this.adviser = adviser;
    }

    public void printAllAttributes ()
    {
        TextIO.putln("Name: " + this.getName());
        TextIO.putln("ID: " + this.getStudentID());
        TextIO.putln("Birthdate: " + this.getBirthDate());
        TextIO.putln("Address: " + this.getAddress());
        TextIO.putln("Major: " + this.major.getName() );
        TextIO.putln("GPA: " + this.getGpa());
        TextIO.putln("Adviser: " + this.adviser.getName());
        TextIO.putln();
    }
}
