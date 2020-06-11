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
        int number_vector;

        unordered_set<int> int_set;
        for (int i = 0; i < nums.size(); i++)
        {
            number_vector = nums[i];
            //cout << "Number: " << number_vector << endl;

            if (int_set.find(number_vector) == int_set.end())
            {
                int_set.insert(number_vector);
            }
            else
            {
                return true;
            }
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