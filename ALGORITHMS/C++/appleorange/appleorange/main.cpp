//
//  main.cpp
//  appleorange
//
//  Created by Oscar Fernandez Moreno on 3/13/19.
//  Copyright © 2019 Oscar Fernandez Moreno. All rights reserved.
//
#include <vector>
#include <iostream>
using namespace std; //std automáticos
void countApplesAndOranges(int s, int t, int a, int b, vector<int> apples, vector<int> oranges) {
    int in_apple = 0;
    int in_orange = 0;
    
    
    for (int i = 0; i < apples.size(); i++){
        if ( ((apples[i] + a) <= t) && ((apples[i] + a) >= s) ){
            ++in_apple;
        }
    }
    
    for (int i = 0; i < oranges.size(); i++){
        if ( ((oranges[i] + b) <= t) && ((oranges[i] + b) >= s) ){
            ++in_orange;
        }
    }
    
    
    cout << in_apple << endl;
    cout << in_orange << endl;
    
}


int main(int argc, const char * argv[]) {
    int s = 7;
    int t = 11;
    int a = 5;
    int b = 15;
    
    vector <int> apples;
    apples.push_back(-2);
    apples.push_back(2);
    apples.push_back(1);

    vector <int> oranges;
    oranges.push_back(5);
    oranges.push_back(-6);

    
    countApplesAndOranges(s, t, a, b, apples, oranges);
    
    return 0;
}
