/*

diamond pattern
4
      *       
    * * *     
  * * * * *   
    * * * 
      * 
        
    *     
  * * *   
    * 
      
  * 
*/


#include<iostream>
using namespace std;

int main()
{
    int num;
    cin>>num;
    while(num-->1){
        int row = 1;
        while(row<=num)
        {
            int col = 1;
            while(col<=num-row+1)
            {
                cout<<"  ";
                col++;
            }
    
            int star= 1;
            while(star<=row)
            {
                cout<<"*"<<" ";
                star=star+1;
            }
    
            int star2= row-1;
            while(star2)
            {
                cout<<"*"<<" ";
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
            int cols = 1;
            while(cols<=row1+1)
            {
                cout<<"  ";
                cols++;
            }
    
            int stars= 1;
            while(stars<=num-row1)
            {
                cout<<"*"<<" ";
                stars=stars+1;
            }
    
            int f = num-row1-1;
            while(f>=1){
                cout<<"*"<<" ";
                f--;
            }
    
    
            //fourth triangle
    
           /* int cols2 = 1;
            while(cols2<=row1+1){
                cout<<"* ";
                cols2++;
            } */
    
            cout<<endl;
            row1=row1+1;
    
    
        }
    }

}



**/Output of the Program:::/**

20
                                      *                                       
                                    * * *                                     
                                  * * * * *                                   
                                * * * * * * *                                 
                              * * * * * * * * *                               
                            * * * * * * * * * * *                             
                          * * * * * * * * * * * * *                           
                        * * * * * * * * * * * * * * *                         
                      * * * * * * * * * * * * * * * * *                       
                    * * * * * * * * * * * * * * * * * * *                     
                  * * * * * * * * * * * * * * * * * * * * *                   
                * * * * * * * * * * * * * * * * * * * * * * *                 
              * * * * * * * * * * * * * * * * * * * * * * * * *               
            * * * * * * * * * * * * * * * * * * * * * * * * * * *             
          * * * * * * * * * * * * * * * * * * * * * * * * * * * * *           
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *         
      * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *       
    * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *     
  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *   
    * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
      * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
          * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
            * * * * * * * * * * * * * * * * * * * * * * * * * * * 
              * * * * * * * * * * * * * * * * * * * * * * * * * 
                * * * * * * * * * * * * * * * * * * * * * * * 
                  * * * * * * * * * * * * * * * * * * * * * 
                    * * * * * * * * * * * * * * * * * * * 
                      * * * * * * * * * * * * * * * * * 
                        * * * * * * * * * * * * * * * 
                          * * * * * * * * * * * * * 
                            * * * * * * * * * * * 
                              * * * * * * * * * 
                                * * * * * * * 
                                  * * * * * 
                                    * * * 
                                      * 
                                        
                                    *                                     
                                  * * *                                   
                                * * * * *                                 
                              * * * * * * *                               
                            * * * * * * * * *                             
                          * * * * * * * * * * *                           
                        * * * * * * * * * * * * *                         
                      * * * * * * * * * * * * * * *                       
                    * * * * * * * * * * * * * * * * *                     
                  * * * * * * * * * * * * * * * * * * *                   
                * * * * * * * * * * * * * * * * * * * * *                 
              * * * * * * * * * * * * * * * * * * * * * * *               
            * * * * * * * * * * * * * * * * * * * * * * * * *             
          * * * * * * * * * * * * * * * * * * * * * * * * * * *           
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * *         
      * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *       
    * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *     
  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *   
    * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
      * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
          * * * * * * * * * * * * * * * * * * * * * * * * * * * 
            * * * * * * * * * * * * * * * * * * * * * * * * * 
              * * * * * * * * * * * * * * * * * * * * * * * 
                * * * * * * * * * * * * * * * * * * * * * 
                  * * * * * * * * * * * * * * * * * * * 
                    * * * * * * * * * * * * * * * * * 
                      * * * * * * * * * * * * * * * 
                        * * * * * * * * * * * * * 
                          * * * * * * * * * * * 
                            * * * * * * * * * 
                              * * * * * * * 
                                * * * * * 
                                  * * * 
                                    * 
                                      
                                  *                                   
                                * * *                                 
                              * * * * *                               
                            * * * * * * *                             
                          * * * * * * * * *                           
                        * * * * * * * * * * *                         
                      * * * * * * * * * * * * *                       
                    * * * * * * * * * * * * * * *                     
                  * * * * * * * * * * * * * * * * *                   
                * * * * * * * * * * * * * * * * * * *                 
              * * * * * * * * * * * * * * * * * * * * *               
            * * * * * * * * * * * * * * * * * * * * * * *             
          * * * * * * * * * * * * * * * * * * * * * * * * *           
        * * * * * * * * * * * * * * * * * * * * * * * * * * *         
      * * * * * * * * * * * * * * * * * * * * * * * * * * * * *       
    * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *     
  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *   
    * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
      * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
        * * * * * * * * * * * * * * * * * * * * * * * * * * * 
          * * * * * * * * * * * * * * * * * * * * * * * * * 
            * * * * * * * * * * * * * * * * * * * * * * * 
              * * * * * * * * * * * * * * * * * * * * * 
                * * * * * * * * * * * * * * * * * * * 
                  * * * * * * * * * * * * * * * * * 
                    * * * * * * * * * * * * * * * 
                      * * * * * * * * * * * * * 
                        * * * * * * * * * * * 
                          * * * * * * * * * 
                            * * * * * * * 
                              * * * * * 
                                * * * 
                                  * 
                                    
                                *                                 
                              * * *                               
                            * * * * *                             
                          * * * * * * *                           
                        * * * * * * * * *                         
                      * * * * * * * * * * *                       
                    * * * * * * * * * * * * *                     
                  * * * * * * * * * * * * * * *                   
                * * * * * * * * * * * * * * * * *                 
              * * * * * * * * * * * * * * * * * * *               
            * * * * * * * * * * * * * * * * * * * * *             
          * * * * * * * * * * * * * * * * * * * * * * *           
        * * * * * * * * * * * * * * * * * * * * * * * * *         
      * * * * * * * * * * * * * * * * * * * * * * * * * * *       
    * * * * * * * * * * * * * * * * * * * * * * * * * * * * *     
  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *   
    * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
      * * * * * * * * * * * * * * * * * * * * * * * * * * * 
        * * * * * * * * * * * * * * * * * * * * * * * * * 
          * * * * * * * * * * * * * * * * * * * * * * * 
            * * * * * * * * * * * * * * * * * * * * * 
              * * * * * * * * * * * * * * * * * * * 
                * * * * * * * * * * * * * * * * * 
                  * * * * * * * * * * * * * * * 
                    * * * * * * * * * * * * * 
                      * * * * * * * * * * * 
                        * * * * * * * * * 
                          * * * * * * * 
                            * * * * * 
                              * * * 
                                * 
                                  
                              *                               
                            * * *                             
                          * * * * *                           
                        * * * * * * *                         
                      * * * * * * * * *                       
                    * * * * * * * * * * *                     
                  * * * * * * * * * * * * *                   
                * * * * * * * * * * * * * * *                 
              * * * * * * * * * * * * * * * * *               
            * * * * * * * * * * * * * * * * * * *             
          * * * * * * * * * * * * * * * * * * * * *           
        * * * * * * * * * * * * * * * * * * * * * * *         
      * * * * * * * * * * * * * * * * * * * * * * * * *       
    * * * * * * * * * * * * * * * * * * * * * * * * * * *     
  * * * * * * * * * * * * * * * * * * * * * * * * * * * * *   
    * * * * * * * * * * * * * * * * * * * * * * * * * * * 
      * * * * * * * * * * * * * * * * * * * * * * * * * 
        * * * * * * * * * * * * * * * * * * * * * * * 
          * * * * * * * * * * * * * * * * * * * * * 
            * * * * * * * * * * * * * * * * * * * 
              * * * * * * * * * * * * * * * * * 
                * * * * * * * * * * * * * * * 
                  * * * * * * * * * * * * * 
                    * * * * * * * * * * * 
                      * * * * * * * * * 
                        * * * * * * * 
                          * * * * * 
                            * * * 
                              * 
                                
                            *                             
                          * * *                           
                        * * * * *                         
                      * * * * * * *                       
                    * * * * * * * * *                     
                  * * * * * * * * * * *                   
                * * * * * * * * * * * * *                 
              * * * * * * * * * * * * * * *               
            * * * * * * * * * * * * * * * * *             
          * * * * * * * * * * * * * * * * * * *           
        * * * * * * * * * * * * * * * * * * * * *         
      * * * * * * * * * * * * * * * * * * * * * * *       
    * * * * * * * * * * * * * * * * * * * * * * * * *     
  * * * * * * * * * * * * * * * * * * * * * * * * * * *   
    * * * * * * * * * * * * * * * * * * * * * * * * * 
      * * * * * * * * * * * * * * * * * * * * * * * 
        * * * * * * * * * * * * * * * * * * * * * 
          * * * * * * * * * * * * * * * * * * * 
            * * * * * * * * * * * * * * * * * 
              * * * * * * * * * * * * * * * 
                * * * * * * * * * * * * * 
                  * * * * * * * * * * * 
                    * * * * * * * * * 
                      * * * * * * * 
                        * * * * * 
                          * * * 
                            * 
                              
                          *                           
                        * * *                         
                      * * * * *                       
                    * * * * * * *                     
                  * * * * * * * * *                   
                * * * * * * * * * * *                 
              * * * * * * * * * * * * *               
            * * * * * * * * * * * * * * *             
          * * * * * * * * * * * * * * * * *           
        * * * * * * * * * * * * * * * * * * *         
      * * * * * * * * * * * * * * * * * * * * *       
    * * * * * * * * * * * * * * * * * * * * * * *     
  * * * * * * * * * * * * * * * * * * * * * * * * *   
    * * * * * * * * * * * * * * * * * * * * * * * 
      * * * * * * * * * * * * * * * * * * * * * 
        * * * * * * * * * * * * * * * * * * * 
          * * * * * * * * * * * * * * * * * 
            * * * * * * * * * * * * * * * 
              * * * * * * * * * * * * * 
                * * * * * * * * * * * 
                  * * * * * * * * * 
                    * * * * * * * 
                      * * * * * 
                        * * * 
                          * 
                            
                        *                         
                      * * *                       
                    * * * * *                     
                  * * * * * * *                   
                * * * * * * * * *                 
              * * * * * * * * * * *               
            * * * * * * * * * * * * *             
          * * * * * * * * * * * * * * *           
        * * * * * * * * * * * * * * * * *         
      * * * * * * * * * * * * * * * * * * *       
    * * * * * * * * * * * * * * * * * * * * *     
  * * * * * * * * * * * * * * * * * * * * * * *   
    * * * * * * * * * * * * * * * * * * * * * 
      * * * * * * * * * * * * * * * * * * * 
        * * * * * * * * * * * * * * * * * 
          * * * * * * * * * * * * * * * 
            * * * * * * * * * * * * * 
              * * * * * * * * * * * 
                * * * * * * * * * 
                  * * * * * * * 
                    * * * * * 
                      * * * 
                        * 
                          
                      *                       
                    * * *                     
                  * * * * *                   
                * * * * * * *                 
              * * * * * * * * *               
            * * * * * * * * * * *             
          * * * * * * * * * * * * *           
        * * * * * * * * * * * * * * *         
      * * * * * * * * * * * * * * * * *       
    * * * * * * * * * * * * * * * * * * *     
  * * * * * * * * * * * * * * * * * * * * *   
    * * * * * * * * * * * * * * * * * * * 
      * * * * * * * * * * * * * * * * * 
        * * * * * * * * * * * * * * * 
          * * * * * * * * * * * * * 
            * * * * * * * * * * * 
              * * * * * * * * * 
                * * * * * * * 
                  * * * * * 
                    * * * 
                      * 
                        
                    *                     
                  * * *                   
                * * * * *                 
              * * * * * * *               
            * * * * * * * * *             
          * * * * * * * * * * *           
        * * * * * * * * * * * * *         
      * * * * * * * * * * * * * * *       
    * * * * * * * * * * * * * * * * *     
  * * * * * * * * * * * * * * * * * * *   
    * * * * * * * * * * * * * * * * * 
      * * * * * * * * * * * * * * * 
        * * * * * * * * * * * * * 
          * * * * * * * * * * * 
            * * * * * * * * * 
              * * * * * * * 
                * * * * * 
                  * * * 
                    * 
                      
                  *                   
                * * *                 
              * * * * *               
            * * * * * * *             
          * * * * * * * * *           
        * * * * * * * * * * *         
      * * * * * * * * * * * * *       
    * * * * * * * * * * * * * * *     
  * * * * * * * * * * * * * * * * *   
    * * * * * * * * * * * * * * * 
      * * * * * * * * * * * * * 
        * * * * * * * * * * * 
          * * * * * * * * * 
            * * * * * * * 
              * * * * * 
                * * * 
                  * 
                    
                *                 
              * * *               
            * * * * *             
          * * * * * * *           
        * * * * * * * * *         
      * * * * * * * * * * *       
    * * * * * * * * * * * * *     
  * * * * * * * * * * * * * * *   
    * * * * * * * * * * * * * 
      * * * * * * * * * * * 
        * * * * * * * * * 
          * * * * * * * 
            * * * * * 
              * * * 
                * 
                  
              *               
            * * *             
          * * * * *           
        * * * * * * *         
      * * * * * * * * *       
    * * * * * * * * * * *     
  * * * * * * * * * * * * *   
    * * * * * * * * * * * 
      * * * * * * * * * 
        * * * * * * * 
          * * * * * 
            * * * 
              * 
                
            *             
          * * *           
        * * * * *         
      * * * * * * *       
    * * * * * * * * *     
  * * * * * * * * * * *   
    * * * * * * * * * 
      * * * * * * * 
        * * * * * 
          * * * 
            * 
              
          *           
        * * *         
      * * * * *       
    * * * * * * *     
  * * * * * * * * *   
    * * * * * * * 
      * * * * * 
        * * * 
          * 
            
        *         
      * * *       
    * * * * *     
  * * * * * * *   
    * * * * * 
      * * * 
        * 
          
      *       
    * * *     
  * * * * *   
    * * * 
      * 
        
    *     
  * * *   
    * 
      
  *  