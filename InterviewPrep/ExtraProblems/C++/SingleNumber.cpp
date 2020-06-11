
#include <iostream>
#include <vector>
#include <unordered_set>
using namespace std;
class Solution
{
public:
    int singleNumber(vector<int> &arr)
    {
        int ones = 0, twos = 0;
        int n = arr.size();

        int common_bit_mask;

        // Let us take the example of {3, 3, 2, 3} to understand this
        for (int i = 0; i < n; i++)
        {
            /* The expression "one & arr[i]" gives the bits that are  
        there in both 'ones' and new element from arr[]. We  
        add these bits to 'twos' using bitwise OR  
  
        Value of 'twos' will be set as 0, 3, 3 and 1 after 1st,  
        2nd, 3rd and 4th iterations respectively */
            cout << "twos = twos | (ones & arr[i]);" << endl;
            cout << "ones & arr[" << i << "]: " << (ones & arr[i]) << endl;
            cout << "twos before: " << twos << endl;

            twos = twos | (ones & arr[i]);

            cout << "twos after: " << twos << endl;
            cout << endl;
            /* XOR the new bits with previous 'ones' to get all bits  
        appearing odd number of times  
  
        Value of 'ones' will be set as 3, 0, 2 and 3 after 1st,  
        2nd, 3rd and 4th iterations respectively */
            cout << "ones = ones ^ arr[i];" << endl;
            cout << "nes ^ arr[" << i << "]: " << (ones ^ arr[i]) << endl;
            cout << "ones before: " << twos << endl;

            ones = ones ^ arr[i];

            cout << "ones after: " << ones << endl;
            cout << endl;

            /* The common bits are those bits which appear third time  
        So these bits should not be there in both 'ones' and 'twos'.  
        common_bit_mask contains all these bits as 0, so that the bits can  
        be removed from 'ones' and 'twos'  
  
        Value of 'common_bit_mask' will be set as 00, 00, 01 and 10  
        after 1st, 2nd, 3rd and 4th iterations respectively */
            common_bit_mask = ~(ones & twos);

            /* Remove common bits (the bits that appear third time) from 'ones'  
              
        Value of 'ones' will be set as 3, 0, 0 and 2 after 1st,  
        2nd, 3rd and 4th iterations respectively */
            ones &= common_bit_mask;

            /* Remove common bits (the bits that appear third time) from 'twos'  
  
        Value of 'twos' will be set as 0, 3, 1 and 0 after 1st,  
        2nd, 3rd and 4th itearations respectively */
            twos &= common_bit_mask;

            // uncomment this code to see intermediate values
            //printf (" %d %d n", ones, twos);
        }

        return ones;
    }
};

int main()
{
    vector<int> my_vector;
    my_vector.push_back(3);
    my_vector.push_back(3);
    my_vector.push_back(2);
    my_vector.push_back(3);
    Solution sol;
    int ans = sol.singleNumber(my_vector);
    cout << ans << endl;
}
//Oscar