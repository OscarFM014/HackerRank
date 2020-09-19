//Problem: https://binarysearch.com/problems/Central-Linked-List

#include "solution.hpp"
using namespace std;

/**
 * class LLNode {
 *     public:
 *         int val;
 *         LLNode *next;
 * };
 */
class Solution
{
public:
    int solve(LLNode *node)
    {
        int size = 0;
        int go = 0;
        LLNode *aux = node;
        while (aux != NULL)
        {
            aux = aux->next;
            size++;
        }

        size = size / 2;
        while (go != size)
        {
            node = node->next;
            go++;
        }

        int result = node->val;
        return result;
    }
};
//Oscar