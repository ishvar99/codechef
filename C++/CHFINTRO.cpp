//
// Created by HP on 12/11/2018.
//
#include <iostream>
using namespace std;
int main(){
    int n,r;
    cin>>n;
    cin>>r;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    for(int i=0;i<n;i++){
        if(a[i]<r)
            cout<<"Bad boi"<<endl;
         else
            cout<<"Good boi"<<endl;
    }
    return 0;
}