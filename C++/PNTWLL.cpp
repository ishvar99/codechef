//
// Created by HP on 12/19/2018.
//
#include <iostream>
#include <algorithm>

using namespace std;
int main(){
    int t,m,n,max,color=0;
    cin>>t;
    while(t-->0){
        cin>>n;
        cin>>m;
        int a[n][2],b[n],k=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                cin>>a[j][i];
            }
        }
        max=a[0][0];
        for(int i=0;i<n-1;i++){
            if(max<=a[i+1][0]){
                max=a[i+1][0];
            }else{
                b[k]=a[i][1];
            }
        }
    }
    return 0;
}