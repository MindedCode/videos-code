#include<iostream>
using namespace std;

int main(){
    int n;
    cin>>n;
    int a = 3;

    cout << (n&a) << " n&n" <<endl;
    cout << (n|n) << " n|n" <<endl;
    cout << ~n  << " ~n " <<endl;
    cout << (n^n) << " n^n" <<endl;
    
    return 0;
}

/**output of the code::**/

2
2 n&n
2 n|n
-3 ~n 
0 n^n
}
