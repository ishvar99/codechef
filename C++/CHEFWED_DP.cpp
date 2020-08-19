
#include<iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t-->0)
    {
        int conflicts=0;
        vector<int> arguments(100,0);
        int n, k;
        cin>>n;
        cin>>k;
        int family[n+1];
        for (int i = 1; i <= n; i++)
        {
            cin >> family[i];
        }
        int dp[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            conflicts=0;
            dp[i]=dp[i-1]+k;
        for(int j=i;j>=1;j--){
            arguments[family[j]++];
            if(arguments[family[j]]==2)
                conflicts+=2;
            else if(arguments[family[j]]>2)
                conflicts+=1;
            dp[i]=min(dp[i],dp[j-1]+k+conflicts);
        }
        }
        cout<<dp[n]<<endl;
    }
}