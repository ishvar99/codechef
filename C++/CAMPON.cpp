//
// Created by HP on 12/23/2018.
//
#include <iostream>
using namespace std;
int main() {
    int t;
    while (t-- > 0) {
        int d, q;
        cin >> d;
        int s[d], p[d];
        for (int i = 1; i <= d; i++) {
            cin >> s[i];
            cin >> p[i];
        }
        cin >> q;
        int r[q], l[q];
        for (int i = 1; i <= q; i++) {
            cin >> l[i];
            cin >> r[i];
        }
        for (int i = 1; i <= q; i++) {
            for (int j = 1; j <= d; j++) {
                if (s[j] < l[i]) {

                }
            }
        }
    }
}