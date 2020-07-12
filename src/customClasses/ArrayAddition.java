package customClasses;

public class ArrayAddition
{
    public static String[] add(String[] a, String[] b)
    {
        String[] added = new String[a.length + b.length];
        int j = 0;
        for (int i = 0; i < a.length; i++)
        {
            added[j] = a[i];
            j++;
        }
        for (int i = 0; i < b.length; i++)
        {
            added[j] = b[i];
            j++;
        }
        return added;
    }
}
