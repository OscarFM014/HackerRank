//Problem: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
#include <iostream>
#include <vector>
using namespace std;

void rotate(vector<int> &nums, int k)
{
    if (k == 0 || nums.size() <= 1)
    {
        return;
    }
    int size = nums.size();
    k = k % size;
    int right = size - 1;
    int aux = 0;

    for (int i = 0; i < right; i++)
    {
        aux = nums.at(i);
        nums.at(i) = nums.at(right);
        nums.at(right) = aux;
        right--;
    }

    right = k - 1;

    for (int i = 0; i < right; i++)
    {
        aux = nums.at(i);
        nums.at(i) = nums.at(right);
        nums.at(right) = aux;
        right--;
    }

    right = size - 1;

    for (int i = k; i < right; i++)
    {

        aux = nums.at(i);
        nums.at(i) = nums.at(right);
        nums.at(right) = aux;
        right--;
    }

    for (int i = 0; i < size; i++)
    {
        cout << nums.at(i) << endl;
    }
}

int main()
{
    vector<int> myVector;
    myVector.push_back(1);
    myVector.push_back(2);
    myVector.push_back(3);
    myVector.push_back(4);
    myVector.push_back(5);
    /* myVector.push_back(6);
    myVector.push_back(7); */

    rotate(myVector, 4);
    return 0;
}

//Oscar