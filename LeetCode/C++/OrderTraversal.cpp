//Problem: https://leetcode.com/problems/binary-tree-level-order-traversal/

#include <iostream>
#include <vector>
#include <queue>
using namespace std;

//Definition for a binary tree node.
struct TreeNode
{
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

vector<vector<int>> order(TreeNode *root, vector<vector<int>> elements, int level)
{
}

vector<vector<int>> levelOrder(TreeNode *root)
{
    vector<vector<int>> elements;
    if (root == NULL)
    {
        return elements;
    }
    queue<TreeNode *> nodes;
    nodes.push(root);
    while (!nodes.empty())
    {
        vector<int> level;
        int size = nodes.size();
        for (int i = 0; i < size; i++)
        {
            TreeNode *current = nodes.front();
            level.push_back(current->val);
            if (current->left != NULL)
            {
                nodes.push(current->left);
            }
            if (current->right != NULL)
            {
                nodes.push(current->right);
            }
            nodes.pop();
        }
        elements.push_back(level);
    }
    return elements;
}

int main()
{

    return 0;
}
//Oscar