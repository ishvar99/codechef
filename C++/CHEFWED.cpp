//
// Created by HP on 8/14/2020.
//

#include <iostream>
#include <set>
#include <vector>
#include <algorithm>
#include <cstring>

using namespace std;
int main()
{
    int t;
    cin >> t;
    while (t-- > 0)
    {
        int n, k;
        cin >> n;
        cin >> k;
        int f[n];
        /* create a vector to keep track of number of members
         in a family*/
        vector<int> family_count(100,0);
        vector<int> family_count1(100,0);
        vector<int> family_count2(100,0);
        vector<int> family_count3(100,0);
        vector<int> result;
        set<int> onHold;
        for (int i = 0; i < n; i++)
        {
            cin >> f[i];
        }
        int cost_per_table=k;
        int initial_tables=1;
        int inefficiency=cost_per_table*initial_tables;
        int inefficiency1=inefficiency;
        int inefficiency2=inefficiency;
        int inefficiency3=inefficiency;
        int conflicts=0;
        int conflicts1;
        int conflicts2;
        for(int i =0;i<n;i++){
            conflicts1=0;
            int conflict_member=0;
            // update count of family member
            family_count[f[i]-1]++;
            family_count1[f[i]-1]++;
            family_count2[f[i]-1]++;
            family_count3[f[i]-1]++;
            // find number of conflicting members in table
            for(int j: family_count1){
                if(j>1){
                    conflicts1+=j;
                }
            }
            if(family_count[f[i]-1]<=1)
                conflict_member=0;
            else if(family_count[f[i]-1]==2)
                conflict_member=2;
            else
                conflict_member=1;
            /* if conflicts are greater than cost of table,
             create a new table
            */
            if(family_count3[f[i]-1]>1){
                // remove member from previous table
                family_count3[f[i]-1]--;
                inefficiency3+=k;
                // reset the family counts for previous tables
                memset(&family_count3[0], 0, family_count3.size() * sizeof family_count3[0]);
                // add this member to new table
                family_count3[f[i]-1]++;
            }
            if(family_count2[f[i]-1]>1){
//                int conflict_member1=0;
                conflicts2=0;
                for(int j: family_count2){
                    if(j>1){
                        conflicts2+=j;
                    }
                }
//                if(family_count2[f[i]-1]<=1)
//                    conflict_member1=0;
//                else if(family_count2[f[i]-1]==2)
//                    conflict_member1=2;
//                else
//                    conflict_member1=1;
                if(conflicts2>k) {
                    conflicts2=0;
                    for(auto it=onHold.begin();it!=onHold.end();it++){
                        if(*it!=f[i]-1){
                            family_count2[*it]--;
                        }
                    }
                    // remove member from previous table
                    family_count2[f[i] - 1]--;
                    for(int j: family_count2){
                        if(j>1){
                            conflicts2+=j;
                        }
                    }
                    inefficiency2+=k+conflicts2;
                    // reset the family counts for previous tables
                    memset(&family_count2[0], 0, family_count2.size() * sizeof family_count2[0]);
                    // add this member to new table
                    family_count2[f[i] - 1]++;
                    for(auto it=onHold.begin();it!=onHold.end();it++){
                        if(*it!=f[i]-1){
                            family_count2[*it]++;
                        }
                    }
                }
                else{
                    onHold.insert(f[i]-1);
                }
            }
            else{
                onHold.clear();
            }
            if(conflicts1>k){
                // remove member from previous table
                family_count1[f[i]-1]--;
                conflicts1=0;
                /* calculate number of conflicting members in previous
                table after removing this member*/
                for(int j: family_count1){
                    if(j>1){
                        conflicts1+=j;
                    }
                }
                /* calculate inefficiency in before the creation of new
                table*/
                inefficiency1+=k+conflicts1;
                // reset the family counts for previous tables
                memset(&family_count1[0], 0, family_count1.size() * sizeof family_count1[0]);
                // add this member to new table
                family_count1[f[i]-1]++;
            }
            if(conflict_member>k){
                // remove member from previous table
                family_count[f[i]-1]--;
                conflicts=0;
                /* calculate number of conflicting members in previous
                table after removing this member*/
                for(int j: family_count){
                    if(j>1){
                        conflicts+=j;
                    }
                }
                /* calculate inefficiency in before the creation of new
                table*/
                inefficiency+=k+conflicts;
                // reset the family counts for previous tables
                memset(&family_count[0], 0, family_count.size() * sizeof family_count[0]);
                // add this member to new table
                family_count[f[i]-1]++;
            }
        }
        conflicts=0;
        conflicts1=0;
        conflicts2=0;
        // calculate conflicts for the final table
        for(int j: family_count){
            if(j>1){
                conflicts+=j;
            }
        }
        for(int j: family_count1){
            if(j>1){
                conflicts1+=j;
            }
        }
        for(int j: family_count2){
            if(j>1){
                conflicts2+=j;
            }
        }
        inefficiency+=conflicts;
        inefficiency1+=conflicts1;
        inefficiency2+=conflicts2;
        cout<<inefficiency<<endl;
        cout<<inefficiency1<<endl;
        cout<<inefficiency2<<endl;
        cout<<inefficiency3<<endl;
        result.push_back(inefficiency);
        result.push_back(inefficiency1);
        result.push_back(inefficiency2);
        result.push_back(inefficiency3);
        cout<<*min_element(result.begin(),result.end())<<endl;
    }
    return 0;
}