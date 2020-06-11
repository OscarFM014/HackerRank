//Problem:
//https://leetcode.com/problems/contains-duplicate/
//#include <bits/stdc++.h>
#include <iostream>
#include <vector>
#include <unordered_set>
#include <iterator>
using namespace std;

class Solution
{
public:
    bool containsDuplicate(vector<int> &nums)
    {
        if (nums.size() <= 1)
        {
            return false;
        }
        unordered_set<int> int_set;
        for (int i : nums)
        {
            if (int_set.find(i) != int_set.end())
            {
                return true;
            }
            int_set.insert(i);
        }
        return false;
    }
};

int main()
{
    vector<int> my_vector;

    for (int num = 0; num < 5; num++)
    {
        my_vector.push_back(num);
    }

    //my_vector.push_back(0);

    Solution sol;
    bool answer = sol.containsDuplicate(my_vector);
    cout << answer << endl;

    return 0;
}
//Oscar