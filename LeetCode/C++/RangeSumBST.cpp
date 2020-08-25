// Problem
//https://leetcode.com/problems/range-sum-of-bst/
#include <iostream>
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

int rangeSumBST(TreeNode *root, int L, int R)
{
    int totalSum = 0;
    totalSum = sumRecursive(root, L, R, totalSum);
    return totalSum;
}

int sumRecursive(TreeNode *root, int L, int R, int totalSum)
{
    if (root == NULL)
    {
        return totalSum;
    }
    if ((root->val < L && root->right == NULL) || (root->val > R && root->left == NULL))
    {
        return totalSum;
    }

    if (root->val >= L && root->val <= R)
    {
        totalSum += root->val;
    }
    totalSum = sumRecursive(root->left, L, R, totalSum);
    totalSum = sumRecursive(root->right, L, R, totalSum);
    return totalSum;
}

int main()
{

    TreeNode tree;
    tree.val = 10;
    tree.right->val = 15;
    tree.left->val = 5;
    tree.left->left->val = 3;
    tree.left->right->val = 7;
    tree.right->right->val = 18;

    cout << rangeSumBST(tree.left, 7, 15) << endl;
    return 0;
}

//Oscar