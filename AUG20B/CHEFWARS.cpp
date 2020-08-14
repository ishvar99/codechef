//
// Created by Ishan Varshney on 8/13/2020.
//
#include <iostream>
using namespace std;

int main(){
    int t,h,p;
    cin>>t;
    while(t-->0){
        int flag=0;
        cin>>h;
        cin>>p;
        while(p>0){
            h-=p;
            if(h<=0){
                flag=1;
                break;
            }
            p/=2;
        }
        if(flag==0)
            cout<<0<<endl;

        else
            cout<<1<<endl;
    }
    return 0;
}

