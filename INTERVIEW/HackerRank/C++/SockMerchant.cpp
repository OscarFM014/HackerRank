#include <iostream>
#include <vector>
using namespace std;

// Complete the sockMerchant function below.
//TO RUN C++ ON MAC
// g++ -std=c++11 -o NAME NAME.cpp
//./NAME

int sockMerchant(int n, vector<int> ar)
{
  vector<int> aux;
  aux.push_back(ar[0]);
  int cont = 0;

  for (int i = 1; i < ar.size(); i++)
  {

    for (int j = 0; j < aux.size(); j++)
    {

      if (ar[i] == aux[j])
      {
        aux.erase(aux.begin() + j);
        cont = cont + 1;
      }
      else
      {
        aux.push_back(ar[i]);
      }
    }
  }
  return cont;
}

int main()
{
  //int n = 9;
  //vector<int> vect{ 1,2,3,4,5,1 };
  //cout <<sockMerchant(n, vect)<< endl;
  cout << "Hola Mundo";

  return 0;
}
