public class Solution
{
    public static void main(String[] args)
    {

        String myArray[] = {"Мама", "Мыла", "Раму"};
        for(int i = 0; i < myArray.length; i++)
        {
            for (int j = 0; j < myArray.length; j++)
            {
                for (int k = 0; k < myArray.length; k++)
                {
                    if (i != j && i != k && j != k)
                    {
                        System.out.println(myArray[i] + myArray[j] + myArray[k]);
                    }
                }
            }
        }

    }
}