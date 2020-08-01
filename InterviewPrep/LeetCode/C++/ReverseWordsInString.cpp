//Problem:
//https://leetcode.com/problems/reverse-words-in-a-string/
#include <iostream>
#include <stack>

using namespace std;

class Solution
{
public:
    string reverseWords(string s)
    {
        if (s.length() == 0)
        {
            return "";
        }

        string result = "";
        string word = "";
        bool beforeLetter = false;
        stack<string> myStack;

        for (int i = 0; i < s.length(); i++)
        {
            if (s.at(i) != ' ')
            {
                word.push_back(s.at(i));
                beforeLetter = true;
            }
            else if (beforeLetter)
            {
                myStack.push(word);
                word = "";
                beforeLetter = false;
            }
        }
        if (beforeLetter)
        {
            myStack.push(word);
        }

        while (myStack.size() > 1)
        {
            result += myStack.top();
            result += " ";
            myStack.pop();
        }

        if (myStack.size() == 1)
        {
            result += myStack.top();
            myStack.pop();
        }

        return result;
    }
};

int main()
{
    string sky = " the sky   is    blue ";
    Solution sol;
    cout << sol.reverseWords(sky) << endl;

    return 0;
}

//Oscar