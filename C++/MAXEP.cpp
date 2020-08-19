//
// Created by HP on 12/11/2018.
//
#include<iostream>
#include <cmath>
using namespace std;
int main() {
    int n,c,i=1,j,s,coin=1000,mid;
    cin>>n>>c;
    j=n;
    mid=i+j/8;
    while(i<=j&&coin>0)
    {
        cout << 1 << " " << mid << endl;
        cin>>s;
        if(s==1) {
            j = mid - 1;
            mid=(i+j)/2;
            cout<<2<<endl;
            coin-=c;
        }
        else if(s==0) {
            i = mid + 1;
            mid=(i+j)/2;
            coin--;
        }
    }
    cout<<3<<" "<<i<<endl;
    cout<<"Coins: "<<coin<<endl;
        return 0;
    }