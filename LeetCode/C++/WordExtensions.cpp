#include <iostream>
#include <vector>
using namespace std;

vector<vector<int > > word(string word)
{
    vector<vector<int > > positions;
    if (word.size() <= 2)
    {
        return positions;
    }

    char currentChar = word.at(0);
    int count = 0;
    int begin = -1;
    vector<int> pos;
    for (int i = 0; i < word.size(); i++)
    {
        if (currentChar == word.at(i))
        {
            if (begin <= i)
            {
                begin = i;
            }
            count++;
        }

        if (count >= 3)
        {
            pos.push_back(begin);
            pos.push_back(i);
            positions.push_back(pos);
            pos.clear();
            begin = i;
        }
    }

    for (int i = 0; i < positions.size(); i++)
    {
        for (int j = 0; j < positions[i].size(); j++)
        {
            cout << positions[i][j] << endl;
        }
    }

    return positions;
}

int main()
{
    string myWord = "hhellloooouu";
    word(myWord);
    return 0;
}
