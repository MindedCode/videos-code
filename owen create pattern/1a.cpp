


/*
n=9
1 2 3 4 5 6 7 8 9 9 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8     8 7 6 5 4 3 2 1
1 2 3 4 5 6 7         7 6 5 4 3 2 1
1 2 3 4 5 6             6 5 4 3 2 1
1 2 3 4 5                 5 4 3 2 1
1 2 3 4                     4 3 2 1
1 2 3                         3 2 1
1 2                             2 1
1                                 1
1                                 1
1 2                             2 1
1 2 3                         3 2 1
1 2 3 4                     4 3 2 1
1 2 3 4 5                 5 4 3 2 1
1 2 3 4 5 6             6 5 4 3 2 1
1 2 3 4 5 6 7         7 6 5 4 3 2 1
1 2 3 4 5 6 7 8     8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 9 9 8 7 6 5 4 3 2 1
*/


#include<iostream>
using namespace std;

int main()
{
    int num;
    cin>>num;

    int row = 1;
    while(row<=num)
    {
        int value =1;
        int col = num-row+1;
        while(col>=1)
        {
            cout<<value<<" ";
            value++;
            col--;
        }

        int star= row-1;
        while(star)
        {
            cout<<"  ";
            star=star-1;
        }

        int star2= row-1;
        while(star2)
        {
            cout<<"  ";
            star2=star2-1;
        }


        //fourth triangle
        int col2 = num-row+1;
        while(col2>=1)
        {
            cout<<col2<<" ";

            col2--;
        }

        cout<<endl;
        row=row+1;


    }
/////----------------------------- sec part-------------------------------------
       // cout<<"Adarsh"<<endl;
        int row1=1;


    while(row1<=num)
    {
        //cout<<"hii";
        int values =1;
        int cols = 1;
        while(cols<=row1)
        {
            cout<<values<<" ";
            values++;
            cols++;
        }

        int stars= num-row1;
        while(stars)
        {
            cout<<"  ";
            stars=stars-1;
        }

        int star2s= num-row1;
        while(star2s)
        {
            cout<<"  ";
            star2s=star2s-1;
        }


        //fourth triangle

        int cols2 = 1;
        int val = row1;
        while(cols2<=row1){
            cout<<val<<" ";
            val--;
            cols2++;
        }

        cout<<endl;
        row1=row1+1;


    }

}

