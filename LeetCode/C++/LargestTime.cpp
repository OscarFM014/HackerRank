//Problem: https://leetcode.com/problems/largest-time-for-given-digits/
#include <iostream>
#include <vector>
#include <map>
using namespace std;

string twoCase(map<int, int> numbers, int H1, int H2, int M1, int M2)
{
    if (numbers.find(2) != numbers.end())
    {
        H1 = 2;
        numbers[2]--;
        for (int i = 3; i > -1; i--)
        {
            if (numbers.find(i) != numbers.end())
            {
                if (numbers[i] > 0)
                {
                    H2 = i;
                    numbers[i]--;
                    break;
                }
            }
        }
        for (int i = 5; i > -1; i--)
        {
            if (numbers.find(i) != numbers.end())
            {
                if (numbers[i] > 0)
                {
                    M1 = i;
                    numbers[i]--;
                    break;
                }
            }
        }
        for (int i = 9; i > -1; i--)
        {
            if (numbers.find(i) != numbers.end())
            {
                if (numbers[i] > 0)
                {
                    M2 = i;
                    numbers[i]--;
                    break;
                }
            }
        }
    }
    if ((H1 == -1 || H2 == -1 || M1 == -1 || M2 == -1))
    {
        return "";
    }
    string latestHour = to_string(H1) + to_string(H2) + ":" + to_string(M1) + to_string(M2);
    return latestHour;
}

string oneCase(map<int, int> numbers, int H1, int H2, int M1, int M2)
{
    if (numbers.find(1) != numbers.end() && ((H1 == -1 || H2 == -1 || M1 == -1 || M2 == -1)))
    {
        H1 = 1;
        numbers[1]--;

        for (int i = 9; i > -1; i--)
        {
            if (numbers.find(i) != numbers.end())
            {
                if (numbers[i] > 0)
                {
                    H2 = i;
                    numbers[i]--;
                    break;
                }
            }
        }

        for (int i = 5; i > -1; i--)
        {
            if (numbers.find(i) != numbers.end())
            {
                if (numbers[i] > 0)
                {
                    M1 = i;
                    numbers[i]--;
                    break;
                }
            }
        }

        for (int i = 9; i > -1; i--)
        {
            if (numbers.find(i) != numbers.end())
            {
                if (numbers[i] > 0)
                {
                    M2 = i;
                    numbers[i]--;
                    break;
                }
            }
        }
    }
    if ((H1 == -1 || H2 == -1 || M1 == -1 || M2 == -1))
    {
        return "";
    }
    string latestHour = to_string(H1) + to_string(H2) + ":" + to_string(M1) + to_string(M2);
    return latestHour;
}

string zeroCase(map<int, int> numbers, int H1, int H2, int M1, int M2)
{
    if (numbers.find(0) != numbers.end() && ((H1 == -1 || H2 == -1 || M1 == -1 || M2 == -1)))
    {

        H1 = 0;
        numbers[0]--;
        for (int i = 9; i > -1; i--)
        {
            if (numbers.find(i) != numbers.end())
            {
                if (numbers[i] > 0)
                {
                    H2 = i;
                    numbers[i]--;
                    break;
                }
            }
        }
        for (int i = 5; i > -1; i--)
        {
            if (numbers.find(i) != numbers.end())
            {
                if (numbers[i] > 0)
                {
                    M1 = i;

                    numbers[i]--;
                    break;
                }
            }
        }

        for (int i = 9; i > -1; i--)
        {
            if (numbers.find(i) != numbers.end())
            {
                if (numbers[i] > 0)
                {
                    M2 = i;
                    numbers[i]--;
                    break;
                }
            }
        }
    }
    if ((H1 == -1 || H2 == -1 || M1 == -1 || M2 == -1))
    {
        return "";
    }
    string latestHour = to_string(H1) + to_string(H2) + ":" + to_string(M1) + to_string(M2);
    return latestHour;
}

string largestTimeFromDigits(vector<int> &A)
{
    map<int, int> numbers;

    for (int i = 0; i < A.size(); i++)
    {
        int num = A.at(i);
        if (numbers.find(num) != numbers.end())
        {
            numbers[num]++;
        }
        else
        {
            numbers.insert(pair<int, int>(num, 1));
        }
    }

    int H1 = -1;
    int H2 = -1;
    int M1 = -1;
    int M2 = -1;
    string result = "";

    if (twoCase(numbers, H1, H2, M1, M2) != "")
    {
        return twoCase(numbers, H1, H2, M1, M2);
    }
    else if (oneCase(numbers, H1, H2, M1, M2) != "")
    {
        return oneCase(numbers, H1, H2, M1, M2);
    }
    else if (zeroCase(numbers, H1, H2, M1, M2) != "")
    {
        return zeroCase(numbers, H1, H2, M1, M2);
    }
    else
    {
        return "";
    }
}

int main()
{
    vector<int> numbers;
    numbers.push_back(0);
    numbers.push_back(2);
    numbers.push_back(6);
    numbers.push_back(6);
    cout << largestTimeFromDigits(numbers) << endl;

    return 0;
}

//Oscar