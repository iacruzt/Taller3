public class Author
{

    // ------------------------------------------------------------------- ATTRIBUTES

    private String name;

    // ------------------------------------------------------------------- CONSTRUCTOR

    public Author (String newName)
    {
        setName (newName);
    }

    // ------------------------------------------------------------------- METHODS

    public void setName (String newName)
    {
        this.name = newName;
    }

    public String getName ()
    {
        return this.name;
    }
}
