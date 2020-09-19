//Problem: https://binarysearch.com/problems/Roomba

#include "solution.hpp"
using namespace std;

class Solution
{
public:
    bool solve(vector<string> &moves, int x, int y)
    {
        int xAux = 0;
        int yAux = 0;
        for (int i = 0; i < moves.size(); i++)
        {
            if (moves.at(i) == "NORTH")
            {
                yAux++;
            }
            else if (moves.at(i) == "EAST")
            {
                xAux++;
            }
            else if (moves.at(i) == "WEST")
            {
                xAux--;
            }
            else if (moves.at(i) == "SOUTH")
            {
                yAux--;
            }
        }

        if (x == xAux && y == yAux)
        {
            return true;
        }

        return false;
    }
};
//Oscar