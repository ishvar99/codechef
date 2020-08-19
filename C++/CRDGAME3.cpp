//
// Created by HP on 8/13/2020.
//
#include <iostream>
#include <math.h>
using namespace std;
int main(){
    int t,pc,pr;
    cin>>t;
    while(t-->0){
    cin>>pc;
    cin>>pr;
    double c=ceil(pc/9.0);
    double r=ceil(pr/9.0);
    if(c>=r){
        cout<<1<<" "<<r<<endl;
    }
    else if(c<r){
        cout<<0<<" "<<c<<endl;
    }
    }
    return 0;
}