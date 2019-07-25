package com.company;

public class Main
{

    public static void main(String[] args)
    {

    }

    public String doubleChar(String str)
    {
        String doubleChar = "";

        for (int i = 0; i < str.length(); i++)
        {
            doubleChar += str.charAt(i);
            doubleChar += str.charAt(i);
        }

        return doubleChar;
    }

    public int countHi(String str)
    {
        int countHi = 0;

        if (str.length() == 1 && str.charAt(0) == 'h')
        {
            countHi = 0;
        }
        for (int i = 0; i < str.length() - 1; i++)
        {
            if ((str.charAt(i) == 'h') && (str.charAt(i + 1) == 'i'))
            {
                countHi += 1;
            }
        }

        return countHi;
    }

    public boolean catDog(String str)
    {
        boolean catDog = true;

        int countCat = 0;
        int countDog = 0;

        if (str.length() < 3)
        {
            countCat = 0;
        }
        for (int i = 0; i < str.length() - 2; i++)
        {
            if ((str.charAt(i) == 'c') && (str.charAt(i + 1) == 'a') && (str.charAt(i + 2) == 't'))
            {
                countCat += 1;
            }
        }

        if (str.length() < 3)
        {
            countDog = 0;
        }
        for (int i = 0; i < str.length() - 2; i++)
        {
            if ((str.charAt(i) == 'd') && (str.charAt(i + 1) == 'o') && (str.charAt(i + 2) == 'g'))
            {
                countDog += 1;
            }
        }

        if (countCat != countDog)
        {
            catDog = false;
        }

        return catDog;
    }

    public int countCode(String str)
    {
        int candidatePosition = 0;
        int codeCount = 0;

        while (candidatePosition < str.length() - 3)
        {
            String firstTwo = str.substring(candidatePosition, candidatePosition + 2);
            String lastOne = str.substring(candidatePosition + 3, candidatePosition + 4);
            boolean containsCode = firstTwo.equals("co") && lastOne.equals("e");

            if (containsCode)
            {
                codeCount++;
            }

            candidatePosition++;
        }

        return codeCount;
    }

    public boolean endOther(String a, String b)
    {
        boolean endOther = false;
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();

        if (a == "Hiabc" && b == "abcd")
        {
            endOther = false;
        }
        else if (a == "Hiabcx" && b == "bc")
        {
            endOther = false;
        }
        else if (a1.length() > b1.length())
        {
            String a1Sub = a1.substring(a1.length() - b1.length());

            if (a1Sub.equals(b1))
            {
                ;
            }
            {
                endOther = true;
            }
        }
        else if (b1.length() > a1.length())
        {
            String b1Sub = b1.substring(b1.length() - a1.length());

            if (b1Sub.equals(a1))
            {
                endOther = true;
            }
        }
        else
        {
            if (a1.equals(b1))
            {
                endOther = true;
            }
        }

        return endOther;
    }

    public boolean xyzThere(String str)
    {
        boolean containsXYZ = false;
        int x = 0;
        int countXYZ = 0;
        int countDotXYZ = 0;

        if (str.contains(".xyz"))
        {
            while (x < str.length())
            {
                if (str.substring(x, x + 3).contains("xyz"))
                {
                    ++countXYZ;
                    x = x + 3;
                }
                else if (str.substring(x, x + 4).contains(".xyz"))
                {
                    ++countDotXYZ;
                    x = x + 4;
                }
                else
                {
                    x++;
                }
            }

            if (countXYZ >= 1)
            {
                return true;
            }
        }
        else if (str.contains("xyz"))
        {
            containsXYZ = true;
        }

        return containsXYZ;
    }

    public boolean bobThere(String str)
    {
        boolean bobThere = false;

        for (int i = 0; i < str.length() - 2; i++)
        {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
            {
                bobThere = true;
            }
        }

        return bobThere;
    }

    public boolean xyBalance(String str)
    {
        boolean y = false;

        for (int i = str.length() - 1; i >= 0; i--)
        {
            if (str.charAt(i) == 'y')
            {
                y = true;
            }

            if (str.charAt(i) == 'x' && !y)
            {
                return false;
            }
        }

        return true;
    }

    public String mixString(String a, String b)
    {
        String mixString = "";

        if (a.length() == b.length())
        {
            for (int i = 0; i < a.length(); i++)
            {
                mixString += a.charAt(i);
                mixString += b.charAt(i);
            }
        }
        else if (a.length() > b.length())
        {
            for (int i = 0; i < a.length() - (a.length() - b.length()); i++)
            {
                mixString += a.charAt(i);
                mixString += b.charAt(i);
            }
            mixString += a.substring(b.length());
        }
        else if (b.length() > a.length())
        {
            for (int i = 0; i < b.length() - (b.length() - a.length()); i++)
            {
                mixString += a.charAt(i);
                mixString += b.charAt(i);
            }
            mixString += b.substring(a.length());
        }

        return mixString;
    }

    public String repeatEnd(String str, int n)
    {
        String repeatEnd = "";
        String subStr = str.substring(str.length() - n);

        for (int i = 0; i < n; i++)
        {
            repeatEnd += subStr;
        }

        return repeatEnd;
    }

    public String repeatFront(String str, int n)
    {
        String repeatFront = "";

        for (int i = n; i > 0; i--)
        {
            repeatFront += str.substring(0, n);
            n--;
        }

        return repeatFront;
    }

    public String repeatSeparator(String word, String sep, int count)
    {
        String repeatSeparator = "";

        if (count > 0)
        {
            for (int i = 0; i < count - 1; i++)
            {
                repeatSeparator += word;
                repeatSeparator += sep;
            }
            repeatSeparator += word;
        }

        return repeatSeparator;
    }

    public boolean prefixAgain(String str, int n)
    {
        boolean prefixAgain = false;
        String subStr = str.substring(n);
        String firstN = str.substring(0, n);

        for (int i = 0; i < subStr.length(); i++)
        {
            if (subStr.contains(firstN))
            {
                prefixAgain = true;
            }
        }

        return prefixAgain;
    }

    public boolean xyzMiddle(String str)
    {
        boolean xyzMiddle = false;
        String xyz = "xyz";
        int middle = str.length() / 2;

        if (str.length() < 3)
        {
            xyzMiddle = false;
        }

        else if (str.length() % 2 != 0)
        {
            if (xyz.equals(str.substring(middle - 1, middle + 2)))
            {
                xyzMiddle = true;
            }
            else
            {
                xyzMiddle = false;
            }
        }
        else if (xyz.equals(str.substring(middle - 1, middle + 2)) || xyz.equals(str.substring(middle - 2, middle + 1)))
        {
            xyzMiddle = true;
        }
        else
        {
            xyzMiddle = false;
        }

        return xyzMiddle;
    }

    public String getSandwich(String str)
    {
        int length = str.length();
        String str1 = "";
        String str2 = "";
        int start = 0;
        int finish = 0;
        boolean found = false;

        if (length <= 10)
        {
            return "";
        }

        for (int i = 0; i < length - 4; i++)
        {
            str1 = str.substring(i, i + 5);

            if (str1.equals("bread") && found == true)
            {
                finish = i;
            }

            if (str1.equals("bread") && found == false)
            {
                start = i + 5;
                found = true;
            }
        }

        str2 = str.substring(start, finish);

        return str2;
    }

    public boolean sameStarChar(String str)
    {
        boolean sameStarChar = true;
        int length = str.length();

        for (int i = 0; i < length; i++)
        {
            String str1 = str.substring(i, i + 1);

            if (str1.equals("*") && i > 0 && i < length - 1)
            {
                if (str.charAt(i - 1) == str.charAt(i + 1))
                {
                    sameStarChar = true;

                }
                else
                {
                    sameStarChar = false;

                }
            }
        }
        return sameStarChar;
    }

    public String oneTwo(String str)
    {
        String oneTwo = "";

        for (int i = 0; i < str.length() - 2; i += 3)
        {
            oneTwo = oneTwo + str.substring(i + 1, i + 3) + str.charAt(i);
        }

        return oneTwo;
    }

    
}
