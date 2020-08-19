//
// Created by HP on 11/3/2018.
//
#include <iostream>
#include <algorithm>
int main(){
    using namespace std;
    int t;
    cin>>t;
    while (t-->0)
    {
        int n;
        cin>>n;
        int a[n],b[n],count=0,count1=0;
        for(int i=1;i<=n;i++){
            cin>>a[i];
        }
        for(int i=1;i<=n;i++){
            b[i]=a[a[i]];
        }
        sort(a,a+n);
        for(int i=1;i<=n;i++){
            cout<<a[i]<<" ";
        }
        sort(b,b+n);
        count=a[1];
        count1=b[1];
        for(int i=2;i<=n;i++)
        {
            if(count!=a[i]){
                count++;
                count=a[i];
            }
            if(count1!=b[1]){
                count1++;
                count1=b[i];
            }
        }
        cout<<count<<" "<<count1;
        if(count==count1){
            cout<<"Poor Chef"<<endl;
        }
        else{
            cout<<"Truly Happy"<<endl;
        }
    }
    return 0;
}