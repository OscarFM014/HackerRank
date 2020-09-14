//Problem: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/

#include <map>
#include <iostream>
#include <vector>
using namespace std;

vector<int> intersect(vector<int> &nums1, vector<int> &nums2)
{
    map<int, int> myMap;
    vector<int> result;

    for (int i = 0; i < nums1.size(); i++)
    {
        if (myMap.find(nums1.at(i)) != myMap.end())
        {
            myMap[nums1.at(i)]++;
        }
        else
        {
            myMap.insert(pair<int, int>(nums1.at(i), 1));
        }
    }

    for (int i = 0; i < nums2.size(); i++)
    {
        if (myMap.find(nums2.at(i)) != myMap.end())
        {
            if (myMap[nums2.at(i)] >= 1)
            {
                myMap[nums2.at(i)]--;
                result.push_back(nums2.at(i));
            }
        }
    }

    /* for (int i = 0; i < result.size(); i++)
    {
        cout << result.at(i) << endl;
    } */

    return result;
}
int main()
{
    vector<int> my_vector_one;
    my_vector_one.push_back(1);
    my_vector_one.push_back(2);
    my_vector_one.push_back(2);
    my_vector_one.push_back(3);
    my_vector_one.push_back(4);
    my_vector_one.push_back(4);

    vector<int> my_vector_two;
    my_vector_two.push_back(1);
    my_vector_two.push_back(2);
    my_vector_two.push_back(4);

    intersect(my_vector_one, my_vector_two);
    return 0;
}

//Oscar