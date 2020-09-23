#include <iostream>
#include <map>
#include <iterator>
using namespace std;

int firstUniqChar(string s)
{
    if (s.size() == 0)
    {
        return -1;
    }

    map<char, int> unique;
    for (int i = 0; i < s.size(); i++)
    {
        char letter = s.at(i);
        if (unique.find(letter) != unique.end())
        {
            unique.insert(std::pair<char, int>(letter, unique[letter]++));
        }
        else
        {
            unique.insert(std::pair<char, int>(letter, 1));
        }
    }
    for (int i = 0; i < s.size(); i++)
    {
        char letter = s.at(i);
        if (unique.find(letter) != unique.end())
        {
            if (unique[letter] == 1)
            {
                return i;
            }
        }
    }
    return -1;
};

int main()
{
    cout << firstUniqChar("loveleetcode") << endl;
    return 0;
}