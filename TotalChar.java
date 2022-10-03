package Array.String;

public class TotalChar
{
    public static void main(String[] args) {
        String s="Vipul Sharma is Champ";
        int a=0;
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)!= ' ')
            {
                a++;
            }
            System.out.println(a);
        }
    }
}
