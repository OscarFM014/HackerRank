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
        int right = nums.size() - 1;
        int left = 0;
        unordered_set<int> int_set;

        while (left < right)
        {
            if (int_set.find(nums[right]) != int_set.end())
            {
                return true;
            }
            int_set.insert(nums[right]);
            right--;

            if (int_set.find(nums[left]) != int_set.end())
            {
                return true;
            }
            int_set.insert(nums[left]);
            left++;
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