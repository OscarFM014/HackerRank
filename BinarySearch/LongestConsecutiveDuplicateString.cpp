//Problem: https://binarysearch.com/problems/Longest-Consecutive-Duplicate-String
#include "solution.hpp"
using namespace std;

class Solution
{
public:
    int solve(string s)
    {

        if (s.size() == 0)
        {
            return 0;
        }
        if (s.size() == 1)
        {
            return 1;
        }
        int max = 0;
        int aux = 1;
        for (int i = 0; i < s.size() - 1; i++)
        {
            if (s.at(i) == s.at(i + 1))
            {
                aux++;
            }
            else
            {
                if (aux >= max)
                {
                    max = aux;
                }
                aux = 1;
            }
        }

        if (aux >= max)
        {
            max = aux;
        }
        return max;
    }
};

//Oscar