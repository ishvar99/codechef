//
// Created by HP on 2/5/2019.
//
#include <iostream>
using namespace std;
int main(){
   long int t,n,a,b,k;
   cin>>t;
   while(t-->0){
       cin>>n>>a>>b>>k;

       long int gcd = a;
       long int temp = b;

       while(gcd != temp)
       {
           if(gcd > temp)
               gcd -= temp;
           else
               temp -= gcd;
       }

       long int lcm = (a * b) / gcd;

         if((n/a)+(n/b)-2*(n/lcm)>=k)
               cout<<"Win"<<endl;
           else
               cout<<"Lose"<<endl;
   }
    return 0;
}

