#include <iostream>
using namespace std;

struct ListNode
{
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution
{
public:
    ListNode *addTwoNumbers(ListNode *l1, ListNode *l2)
    {
    }
};

int main()
{
    ListNode *head = new ListNode(20);

    head->next = new ListNode(4);
    head->next->next = new ListNode(5);
    head->next->next->next = new ListNode(10);

    cout << head->val << endl;

    return 0;
}
