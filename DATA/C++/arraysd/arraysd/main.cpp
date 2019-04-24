//
//  main.cpp
//  arraysd
//
//  Created by Oscar Fernandez Moreno on 3/16/19.
//  Copyright © 2019 Oscar Fernandez Moreno. All rights reserved.
//

#include <iostream>
#include <vector>
using namespace std;
vector<int> reverseArray(vector<int> a) {
    vector<int> reverse;
    long tamano = (a.size() - 1);
    //cout << a.size() << endl;
    
    for (long i = tamano; i >= 0 ; i--){
        reverse.push_back(a[i]);
        cout << reverse[tamano - i] << endl;
    }
    return reverse;
}


int main(int argc, const char * argv[]) {
    // insert code here...
    vector<int> vector;
    for (int i = 0; i < 6; i++){
        vector.push_back(i);
        //cout << vector [i] << endl;
    }
    
    reverseArray(vector);
    
    return 0;
}
