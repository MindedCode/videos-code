/*
n=9

                1 1
              2 1 2 1
            3 2 1 3 2 1
          4 3 2 1 4 3 2 1
        5 4 3 2 1 5 4 3 2 1
      6 5 4 3 2 1 6 5 4 3 2 1
    7 6 5 4 3 2 1 7 6 5 4 3 2 1
  8 7 6 5 4 3 2 1 8 7 6 5 4 3 2 1
  8 7 6 5 4 3 2 1 8 7 6 5 4 3 2 1
    7 6 5 4 3 2 1 7 6 5 4 3 2 1
      6 5 4 3 2 1 6 5 4 3 2 1
        5 4 3 2 1 5 4 3 2 1
          4 3 2 1 4 3 2 1
            3 2 1 3 2 1
              2 1 2 1
                1 1
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
            cout<<"  ";
            value++;
            col--;
        }

        int star= 1;
        while(star<=row)
        {
            cout<<star<<" ";
            star=star+1;
        }

        int star2= row-1;
        while(star2)
        {
            cout<<star2<<" ";
            star2=star2-1;
        }


        //fourth triangle
        int col2 = num-row+1;
        while(col2>=1)
        {
            cout<<"  ";

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
            cout<<"  ";
            values++;
            cols++;
        }

        int stars= 1;
        while(stars<=row)
        {
            cout<<stars<<" ";
            stars=stars+1;
        }

        int star2s= num-row1;
        while(star2s)
        {
            cout<<star2s<<" ";
            star2s=star2s-1;
        }


        //fourth triangle

        int cols2 = 1;
        int val = row1;
        while(cols2<=row1){
            cout<<"  ";
            val--;
            cols2++;
        }

        cout<<endl;
        row1=row1+1;


    }

}

