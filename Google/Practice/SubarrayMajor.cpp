#include <iostream>
#include <regex>
#include <string>
#include <vector>

using namespace std;

int solution(vector<int> A)
{
    // Your solution goes here.
    if (A.size() == 0)
    {
        return 0;
    }
    int major = A[0];
    int rows = 1;
    for (int i = 0; i < A.size() - 1; i++)
    {
        if (A.at(i) > major)
        {
            major = A.at(i);
            rows++;
        }
    }
    return 0;
}

int main()
{
    // Read in from stdin, solve the problem, and write answer to stdout.
    vector<int> vec;
    vec.push_back(5);
    vec.push_back(4);
    vec.push_back(3);
    vec.push_back(6);
    vec.push_back(1);
    cout << solution(vec);
}