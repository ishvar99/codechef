//
// Created by HP on 2/10/2019.
//
#include <iostream>
using namespace std;
int main(){
    int t,n;
    cin>>t;
    while(t-->0){
        cin>>n;
        int a[n];
        int sum=0;
        for(int i=0;i<n;i++){
            cin>>a[i];
            sum+=a[i];
        }
        int s=sum-n+1;
        cout<<s<<endl;
    }
    return 0;
}
