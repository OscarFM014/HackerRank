//Problem: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/
#include <iostream>
#include <vector>
using namespace std;

vector<int> plusOne(vector<int> &digits)
{
    if (digits.size() <= 0)
    {
        return digits;
    }

    int right = digits.size() - 1;

    while (right >= 0)
    {
        if (digits.at(right) < 9)
        {
            digits.at(right)++;
            return digits;
        }
        digits[right] = 0;
        right--;
    }

    vector<int> res(digits.size() + 1, 0);
    res[0] = 1;
    /*   for (int i = 0; i < res.size(); i++)
    {
        cout << res[i] << endl;
    } */
    return res;
}

int main()
{
    vector<int> vec;
    vec.push_back(9);
    vec.push_back(9);
    vec.push_back(9);
    vec.push_back(9);

    plusOne(vec);
    return 0;
}

//Oscar