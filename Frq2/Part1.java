public class SignedText
{
    private String first, last;

    public SignedText(String first, String last)
    {
        this.first = first;
        this.last = last;
    }

    public String getSignature()
    {
        if(first.length() > 0)
            return first.substring(0, 1) + "-" + last;
        else
            return last;
    }
  
