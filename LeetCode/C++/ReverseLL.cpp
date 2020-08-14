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
    ListNode *reverseList(ListNode *head)
    {
        ListNode *prev = NULL;
        ListNode *current = head;
        ListNode *next = NULL;

        while (current != NULL)
        {
            next = current->next;
            current->next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
};

int main()
{
    ListNode *head = new ListNode(20);

    head->next = new ListNode(4);
    head->next->next = new ListNode(5);
    head->next->next->next = new ListNode(10);

    Solution sol;

    sol.reverseList(head);

    return 0;
}
