//
// Created by Ishan Varshney on 8/13/2020.
//
#include <iostream>
using namespace std;

int main(){
    int t,n,k;
    cin>>t;
    while(t-->0){
        cin>>n;
        cin>>k;
        int a[n];
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        int min=1000000009,ans=-1;
        for(int i=0;i<n;i++){
            if(k%a[i]==0){
                if(min>(k/a[i])){
                    min=k/a[i];
                    ans=a[i];
                }
            }
        }
        cout<<ans<<endl;
    }
    return  0;
}
