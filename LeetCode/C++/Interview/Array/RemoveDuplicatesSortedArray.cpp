//Problem: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/

#include <iostream>
#include <vector>
using namespace std;

int removeDuplicates(vector<int> &nums)
{
    if (nums.size() == 0)
    {
        return 0;
    }
    int current = nums.at(0);
    int len = 0;
    for (int i = 0; i < nums.size(); i++)
    {
        if (current != nums.at(i))
        {
            //cout << len << "<-" << current << endl;
            nums.at(len) = current;
            current = nums.at(i);
            len++;
        }
    }
    nums.at(len) = current;
    len++;
    return len;
}

int main()
{
    vector<int> nums;
    nums.push_back(1);
    nums.push_back(1);
    nums.push_back(2);
    nums.push_back(3);
    nums.push_back(3);
    nums.push_back(4);
    nums.push_back(4);
    nums.push_back(4);

    int len = removeDuplicates(nums);
    cout << len << endl;
    cout << "Results: " << endl;
    for (int i = 0; i < len; i++)
    {
        cout << nums.at(i) << endl;
    }

    return 0;
}

//Oscar