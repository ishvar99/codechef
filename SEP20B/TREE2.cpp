#include<bits/stdc++.h>
using namespace std;
int main() {
    int t;
    cin >> t;
    while(t-->0) {
      int n;
      cin>>n;
      int a[n];
      set<int> s;
      for(int i =0;i<n;i++){
         cin>>a[i];
         s.insert(a[i]);
      }
     if(s.find(0)!=s.end())
        cout<<s.size()-1<<endl;
     else 
        cout<<s.size()<<endl;
    }
    return 0;
} 