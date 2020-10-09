#include <iostream>
#include <vector>
using namespace std;

vector<int> plusOne(vector<int> &digits)
{
    if (digits.size() <= 0)
    {
        return digits;
    }
    int right = digits.size() - 1;
    int aux = digits.at(right) + 1;

    while (aux == 10 && right != 0)
    {
        digits.at(right) = 0;
        right--;
        aux = digits.at(right) + 1;
    }

    if (aux == 10)
    {
        digits.at(right) = 0;
        digits.insert(digits.begin(), 1);
    }
    else
    {
        digits.at(right) = aux;
    }

    return digits;
}

int main()
{
    vector<int> vec;
    vec.push_back(1);
    vec.push_back(0);
    vec.push_back(0);
    vec.push_back(7);

    plusOne(vec);

    for (int i = 0; i < vec.size(); i++)
    {
        cout << vec.at(i) << endl;
    }

    return 0;
}