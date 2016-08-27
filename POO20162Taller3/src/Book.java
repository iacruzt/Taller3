public class Book
{

    // ----------------------------------------------------------------- ATTRIBUTES

    private Author author;
    private String title;
    private int noOfPages;
    private boolean fiction;

    // --------------------------------------------------------------- CONSTRUCTOR

    public Book (String newTitle, int newNoOfPages, boolean isFiction) /* Notice this doesn't include the author.
                                                                          Such attribute will be valuated when the
                                                                          object is created, but differently.
                                                                          Go to the Main class to see how it goes. */
    {
        setTitle (newTitle);
        setNoOfPages (newNoOfPages);
        isFiction (isFiction);
    }

    // --------------------------------------------------------------- METHODS

    public void setAuthor (Author newAuthor)
    {
        this.author = newAuthor;
    }

    public void setTitle (String newTitle)
    {
        this.title = newTitle;
    }

    public void setNoOfPages (int newNoOfPages)
    {
        this.noOfPages = newNoOfPages;
    }
    public void isFiction (boolean isFiction)  /* Notice how "isFiction" is systematically preferred over
                                                  "newFiction" and "setFiction" as it makes more sense! */
    {
        this.fiction = isFiction;
    }

    public Author getAuthor ()
    {
        return this.author;
    }

    public String getTitle ()
    {
        return this.title;
    }

    public int getNoOfPages ()
    {
        return this.noOfPages;
    }

    public boolean getIsFiction ()
    {
        return this.fiction;
    }

}
