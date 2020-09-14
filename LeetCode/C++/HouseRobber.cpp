//Problem: https://leetcode.com/problems/house-robber/

#include <iostream>
#include <vector>
using namespace std;

int rob(vector<int> &nums)
{
    int odds = 0;
    int evens = 0;

    for (int i = 0; i < nums.size(); i++)
    {
        if (i % 2 == 0)
        {
            evens += nums.at(i);
        }
        else
        {
            odds += nums.at(i);
        }
    }

    if (evens >= odds)
    {
        return evens;
    }
    return odds;
}

int main()
{
    vector<int> my_vector_one;
    my_vector_one.push_back(1);
    my_vector_one.push_back(2);
    my_vector_one.push_back(3);
    my_vector_one.push_back(1);
    cout << rob(my_vector_one) << endl;
}