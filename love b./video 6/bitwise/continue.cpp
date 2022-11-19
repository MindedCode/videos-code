/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int main()
{
    for(int i = 0; i<=15; i+=2){
        cout<< i << " ";
        
        
        if(i&1){
            continue;
        }
        i++;
    }

    return 0;    
}


output of the program:::
0 3 5 7 9 11 13 15 
