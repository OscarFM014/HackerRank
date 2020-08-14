//Problem
//https://leetcode.com/problems/maximum-subarray/

#include <iostream>
#include <vector>

using namespace std;

class Solution
{
public:
    int maxSubArray(vector<int> &nums)
    {

        int maxSol = nums[0];
        int sumSub = 0;

        for (int i = 0; i < nums.size(); i++)
        {
            sumSub = maxPrevSum(sumSub + nums[i], nums[i]);
            if (sumSub >= maxSol)
            {
                maxSol = sumSub;
            }
        }
        return maxSol;
    }

    int maxPrevSum(int prevSum, int newNum)
    {
        if (prevSum <= newNum)
        {
            return newNum;
        }
        return prevSum;
    }
};

int main()
{
    Solution solution;

    vector<int> my_vector;
    int my_arr[9] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

    for (int i = 0; i < 9; i++)
    {
        my_vector.push_back(my_arr[i]);
    }

    cout << solution.maxSubArray(my_vector) << endl;

    return 0;
}

//Oscar