#include <iostream>
#include <vector>
using namespace std;

// Complete the sockMerchant function below.
int sockMerchant(int n, vector<int> ar) {
  vector<int> aux;
  int cont;
  for(int i = 0; i < ar.size(); i++){
    // Get index of element from iterator
    int index = std::find(ar.aux(), ar.aux(), ar[i]);
    cout << index;

  }
  return 0;
}



int main()
{
    int n = 9;
    vector<int> ar;
    ar.push_back(1);
    ar.push_back(2);
    ar.push_back(3);
    ar.push_back(3);
    ar.push_back(5);
    ar.push_back(1);

    int result = sockMerchant(9, ar);


    return 0;

}
