#include <iostream>
#include <vector>

using namespace std;

class Solution
{
public:
    int maxSubArray(vector<int> &nums)
    {
        if (nums.size() <= 1)
        {
            return nums[0];
        }

        for (int i = 0; i < nums.size(); i++)
        {
            for (int j = 0; j < nums.size(); j++)
            {
            
            }
        }
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

    solution.maxSubArray(my_vector);

    return 0;
}