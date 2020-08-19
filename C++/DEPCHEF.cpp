//
// Created by HP on 2/10/2019.
//
#include <iostream>
using namespace std;
int main()
{
    int t,n;
    cin>>t;
    while(t-->0)
    {
        cin>>n;
        int a[n],d[n],max=0;
        for(int i=1;i<=n;i++)
        {
            cin>>a[i];
        }
        for(int i=1;i<=n;i++)
        {
            cin>>d[i];
        }
        for(int i=1;i<=n;i++){
            if(i==1){
                if(a[n]+a[i+1]<d[i]){
                    max=d[i];
                }
            }
            else if(i==n){
                if(a[i-1]+a[1]<d[i]){
                       if(d[i]>max)
                           max=d[i];
                }
            } else {
                if (a[i - 1]+a[i + 1]<d[i]){
                     if(d[i]>max)
                         max=d[i];
                }
            }
        }
        if(max==0)
            cout<<"-1"<<endl;
         else
             cout<<max<<endl;

    }
    return 0;
}