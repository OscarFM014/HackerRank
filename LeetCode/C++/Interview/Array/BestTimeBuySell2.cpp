//Problem: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
#include <iostream>
#include <vector>
using namespace std;

int maxProfit(vector<int> &prices)
{
    if (prices.size() == 0)
    {
        return 0;
    }

    int profit = 0;
    for (int i = 0; i < prices.size() - 1; i++)
    {
        if (prices[i + 1] > prices[i])
        {
            profit += prices.at(i + 1) - prices.at(i);
        }
    }
    return profit;
}

int main()
{
    vector<int> prices;
    prices.push_back(1);
    prices.push_back(2);
    prices.push_back(3);
    prices.push_back(4);
    prices.push_back(5);

    cout << maxProfit(prices) << endl;
    return 0;
}

//Oscar