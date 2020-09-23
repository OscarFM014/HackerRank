#include <iostream>
#include <math.h>
using namespace std;

int reverse(int x)
{
    bool isNegative = false;

    if (x <= INT_MIN)
    {
        return 0;
    }
    if (x < 0)
    {
        x = x * -1;
        isNegative = true;
    }

    long rev = 0;
    while (x > 0)
    {
        rev = (rev * 10) + (x % 10);
        x = x / 10;
    }

    if (rev > INT_MAX)
    {
        return 0;
    }

    if (isNegative)
    {
        return (int)rev * -1;
    }

    return (int)rev;
}

int main()
{

    int value = -2147483648;
    cout << reverse(value) << endl;
    return 0;
}