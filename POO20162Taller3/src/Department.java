public class Department
{

    // ------------------------------------------------------------------------------ ATTRIBUTES

    private String name;
    private Professor chairman;

    // ------------------------------------------------------------------------------ CONSTRUCTOR

    public Department (String newName)
    {
        setName (newName);
    }

    // ------------------------------------------------------------------------------ METHODS

    public String getName()
    {
        return name;
    }

    private void setName(String name)
    {
        this.name = name;
    }

    public Professor getChairman()
    {
        return chairman;
    }

    public void setChairman(Professor chairman)
    {
        this.chairman = chairman;
    }

    public void printAllAttributes ()
    {
        TextIO.putln("Name: " + this.getName());
        TextIO.putln("Chariman: " + this.chairman.getName());
        TextIO.putln();
    }

}
