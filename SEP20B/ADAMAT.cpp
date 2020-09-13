#include<bits/stdc++.h>
using namespace std;
int main() {
    ios_base::sync_with_stdio(0), cin.tie(0), cout.tie(0);
    int t;
    cin >> t;
    while(t-->0) {
      int n;
      int ans=0;
      cin>>n;
      int m[n+1][n+1];
      // Input the matrix
      for(int i=1;i<=n;i++){
         for(int j=1;j<=n;j++){
            cin>>m[i][j];
         }
      }
      int temp =n;
      bool check=0;

      while(temp>0){
		if(check==1){ 
         swap(m[temp][1], m[1][temp]);
      }
		if(m[temp][1]!= (temp-1)*n+1) {
			if(check==1)
            check=0;
         else
            check=1;
			ans++;
		}
            temp--;
      }
      cout<<ans<<endl;
 }
  return 0;
      }

   
