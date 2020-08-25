//Problem: https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/
#include <iostream>
#include <unordered_set>
#include <math.h>
using namespace std;

bool hasAllCodes(string s, int k)
{
    if (s.size() <= k)
    {
        return false;
    }
    unordered_set<string> binary;

    for (int i = 0; i < s.size() - k + 1; i++)
    {
        binary.insert(s.substr(i, k));
    }

    int elements = binary.size();
    int realCombinations = pow(2, k);

    if (elements >= realCombinations)
    {
        return true;
    }
    return false;
}

int main()
{
    string s = "00110";
    int k = 2;
    cout << hasAllCodes(s, k) << endl;
}