//Problem: https://leetcode.com/problems/binary-tree-level-order-traversal/

#include <iostream>
#include <vector>
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
    if (root != NULL)
    {
        elements.push_back(vector<int>());
        elements = order(root->left, elements, level + 1);
        elements[level].push_back(root->val);
        elements = order(root->right, elements, level + 1);
    }
    return elements;
}

vector<vector<int>> levelOrder(TreeNode *root)
{

    vector<vector<int>> elements;
    if (root == NULL)
    {
        return elements;
    }
    int level = 0;
    elements = order(root, elements, level);

    vector<vector<int>>::iterator it;
    it = elements.begin();
    for (int i = 0; i < elements.size(); i++)
    {
        if (elements[i].size() == 0)
        {
            elements.erase(it + i);
        }
    }

    return elements;
}

int main()
{

    /*  TreeNode tree;
    tree.val = 4;
    tree.right->val = 6;
    tree.left->val = 2;
    tree.left->left->val = 1;
    tree.left->right->val = 3;
    tree.right->right->val = 7;
    levelOrder(tree.left); */

    vector<vector<int>> matrix;
    cout << matrix[0].size() << endl;
    return 0;
}
//Oscar