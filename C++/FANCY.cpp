//
// Created by HP on 1/6/2019.
//
#include <iostream>
using namespace std;
int main(){
    string str1,str;
    int t;
    cin>>t;
    while(t-->0)
    {
        str1="";
        int flag=0;
        fflush(stdin);
        getline(cin,str);
        str.append(" ");
        for (int i=0;i<str.length();i++) {
            if(str[i]!=' ')
            {
                str1+=str[i];
            }
            else{
                if(str1=="not")
                {
                    flag=1;
                    break;
                }
                str1="";
            }
        }
        if(flag==1){
            cout<<"Real Fancy"<<endl;
        } else{
            cout<<"regularly fancy"<<endl;
        }
    }
    return 0;
}
