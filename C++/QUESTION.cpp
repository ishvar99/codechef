//
// Created by HP on 10/27/2018.
//
#include <iostream>
int hcf(int p, int q, int r)
{
    int gcf=1,flag=0, count;
    for(count=1; flag==0;count++)
    {
        if(p%count==0&&q%count==0&&r%count==0)
            gcf=count;
        if(count>p&&count>q&&count>r)
        {
            flag=1;
        }
    }
    return gcf;
}
int main(){
    using namespace std;
    int t,n,a,b,result;
    cin>>t;
    while(t-->0){
        result=0;
        cin>>n>>a>>b;
        if(a==b){
            result=(2*n)+1;
        }
        else {
            if ((a + b) > n) {
                if(hcf(n,a,b)!=1)
                {

                }
                else {
                    result = ((n * n) + (3 * n)) / 2 + 1;
                }
            }
            else if ((a + b) == n) {
                if(hcf(n,a,b)!=1){

                }
                else {
                    result = ((n * n) + (3 * n)) / 2;
                }
            }
            else {

            }
        }
        cout<<result;
    }
    return 0;
}
