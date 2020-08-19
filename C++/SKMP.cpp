//
// Created by HP on 8/13/2020.
//
#include <iostream>
#include <string.h>
#include <vector>

using namespace std;
int main(){
    int t;
    string s,p;
    cin>>t;
    while(t-->0){
        string ans,ans1;
        cin>>s;
        cin>>p;
        vector<int> count_s(26,0);
        int p_size =p.size();
        int s_size=s.size();
        // checking frequency of characters in s
        for(int i=0;i<s_size;i++){
            count_s[s[i]-'a']+=1;
        }
        for(int i =0;i<p_size;i++){
            count_s[p[i]-'a']-=1;
        }
        vector <int> count_s_cpy=count_s;
        // adding smaller letters to answer string
        for(int i=0;i<26;i++){
            char k=(char)(i+'a');
            if(k<=p[0]){
                while(count_s[i]>0){
                    ans.push_back(k);
                    count_s[i]-=1;
                }
                if(k<p[0]){
                    while(count_s_cpy[i]>0){
                        ans1.push_back(k);
                        count_s_cpy[i]-=1;
                    }
                }
            }
        }
        // appending pattern to the string
        ans+=p;
        ans1+=p;
        // adding larger letters to answer string
        for(int i=0;i<26;i++){
            char k=(char)(i+'a');
            while (count_s[i]>0){
                ans.push_back(k);
                count_s[i]-=1;
            }
            while (count_s_cpy[i]>0){
                ans1.push_back(k);
                count_s_cpy[i]-=1;
            }

        }
        // Printing minimum of the two strings
        cout<<min(ans,ans1)<<endl;
    }
    return 0;
}

