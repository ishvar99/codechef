//
// Created by HP on 12/19/2018.
//

#include<iostream>
using namespace std;
int main(){
    int t,n,x,y;
    cin>>t;
    while(t-->0){
        int flag=0;
        cin>>n;
        int a[n][2];
        for(int i=0;i<n;i++) {
            for (int j = 0; j < 2; j++) {
                cin >> a[i][j];
            }
        }
        cin>>x;
        cin>>y;
        for(int i=0;i<n;i++) {
            for (int j = 0; j < 1; j++) {
                bool k1= (x==a[i][j]+1 && y==a[i][j+1]-2);
                bool k2=(x==a[i][j]-1 && y==a[i][j+1]+2);
                bool k3=(x==a[i][j]-1 && y==a[i][j+1]-2);
                bool k4=(x==a[i][j]+1 && y==a[i][j+1]+2);
                bool k5=(x==a[i][j]+2 && y==a[i][j+1]-1);
                bool k6=(x==a[i][j]-2 && y==a[i][j+1]+1);
                bool k7=(x==a[i][j]-2 && y==a[i][j+1]-1);
                bool k8=(x==a[i][j]+2 && y==a[i][j+1]+1);
                if(k1||k2||k3||k4||k5||k6||k7||k8){
                    flag=1;
                }
            }
        }
        if(flag==1){
            cout<<"YES"<<endl;
        }
        else{
            cout<<"NO"<<endl;
        }
    }
    return 0;
}