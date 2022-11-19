
#include <iostream>

using namespace std;

int main()
{
   int n;
   cout<< "enter the value of  n" <<endl;
   cin >> n;
   int i= 1;

   for(;;){
       if(i<=n){
           cout<< i << endl;
           break;
       }

       i++;
   }

    return 0;
}


output of the program :::

enter the value of  n
0
-2147483648
