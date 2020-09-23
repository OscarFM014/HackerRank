//Problem: https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/

#include <iostream>
#include <vector>
using namespace std;

void reverseString(vector<char> &s)
{
    int left = 0;
    int right = s.size() - 1;
    char aux = 'a';
    while (left < right)
    {
        aux = s.at(left);
        s.at(left) = s.at(right);
        s.at(right) = aux;
        left++;
        right--;
    }
}

int main()
{
    vector<char> phrase = {'h', 'e', 'l', 'l', 'o'};
    reverseString(phrase);

    for (auto word : phrase)
    {
        cout << word << endl;
    }
    return 0;
}

//Oscar