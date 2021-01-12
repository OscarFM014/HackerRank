//Problem: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/

#include <iostream>
#include <vector>
using namespace std;

void moveZeroes(vector<int> &nums)
{
    if (nums.size() <= 1)
    {
        return;
    }

    int lastNonZero = 0;
    for (int i = 0; i < nums.size(); i++)
    {
        if (nums.at(i) != 0)
        {
            nums.at(lastNonZero) = nums.at(i);
            if (i != lastNonZero)
            {
                nums.at(i) = 0;
            }

            lastNonZero = lastNonZero + 1;
        }
    }

    for (int i = 0; i < nums.size(); i++)
    {
        cout << nums.at(i) << ", ";
    }
}

int main()
{
    vector<int> my_vector_one;
    my_vector_one.push_back(0);
    my_vector_one.push_back(1);
    my_vector_one.push_back(1);
    my_vector_one.push_back(0);
    my_vector_one.push_back(1);
    my_vector_one.push_back(0);
    moveZeroes(my_vector_one);

    return 0;
}

//Oscar