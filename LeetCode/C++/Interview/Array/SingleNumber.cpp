//Problem
//https://leetcode.com/problems/single-number/
#include <iostream>
#include <vector>
#include <unordered_set>
using namespace std;
class Solution
{
public:
    int singleNumber(vector<int> &nums)
    {
        if (nums.size() == 1)
        {
            return nums[0];
        }
        unordered_set<int> my_set;
        int ans;

        for (int i = 0; i < nums.size(); i++)
        {
            if (my_set.find(nums[i]) != my_set.end())
            {
                my_set.erase(nums[i]);
            }
            else
            {
                my_set.insert(nums[i]);
            }
        }
        return *begin(my_set);
    }
};

int main()
{
    vector<int> my_vector;
    for (int i = 0; i < 5; i++)
    {
        my_vector.push_back(i);
    }
    for (int i = 0; i < 4; i++)
    {
        my_vector.push_back(i);
    }

    Solution sol;
    int ans = sol.singleNumber(my_vector);
    cout << ans << endl;
}

//Oscar