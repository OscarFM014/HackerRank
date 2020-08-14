//Problem:
//https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3409/
#include <iostream>
using namespace std;

class Solution
{
public:
    bool detectCapitalUse(string word)
    {
        int lower = 0;
        int upper = 0;
        for (int i = 0; i < word.length(); i++)
        {
            if (islower(word.at(i)))
            {
                lower++;
            }
            else
            {
                upper++;
            }
        }

        if (lower == 0 || upper == 0 || lower - word.length() == 0 || upper - word.length() == 0 || lower - upper == word.length() - 1 || upper - lower == word.length() - 1)
        {
            return true;
        }

        return false;
    }
};

int main()
{
    string word = "Hello";

    Solution sol;

    cout << sol.detectCapitalUse(word) << endl;
    return 0;
}

//Oscar