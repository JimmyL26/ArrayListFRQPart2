import java.util.ArrayList;

public class Delimiters
{
    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     *  close delimiter.
     *  Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens)
    {
        /* to be implemented in part (a) */
        ArrayList<String> delimiters = new ArrayList<String>();
        for (String text : tokens)
        {
            if (text.equals(openDel) || text.equals(closeDel))
            {
                delimiters.add(text);
            }
        }
        return delimiters;
    }

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters)
    {
        /* to be implemented in part (b) */
        int openDelimiter = 0;
        int closeDelimiter = 0;
        for (int i = 0; i < delimiters.size(); i++)
        {
            if (delimiters.get(i).equals(openDel))
            {
                openDelimiter++;
            }
            if (delimiters.get(i).equals(closeDel))
            {
                closeDelimiter++;
            }
            if (closeDelimiter > openDelimiter)
            {
                return false;
            }
        }
        return openDelimiter == closeDelimiter;
    }
}