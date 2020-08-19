package CODECHEF_BEGINNERS;

import java.util.ArrayList;
import java.util.Scanner;

class CHEFDIL {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int flag = 0;
            String str = s.next();
            ArrayList<Character> arr = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                arr.add(str.charAt(i));
            }
            int n = arr.size();
            while (arr.contains('1')) {
                for (int i = 0; i < n; i++) {
                    if (arr.get(i) == '1') {
                        arr.set(i, '#');
                        if (i > 0) {
                            if (arr.get(i - 1) != '#') {
                                if (arr.get(i - 1) == '1')
                                    arr.set(i - 1, '0');
                                else
                                    arr.set(i - 1, '1');
                            }
                        }
                        if (i < n - 1) {
                            if (arr.get(i + 1) != '#') {
                                if (arr.get(i + 1) == '1')
                                    arr.set(i + 1, '0');
                                else
                                    arr.set(i + 1, '1');
                            }

                        }
                    }
                }
            }
                System.out.println(arr);
                for (int i = 0; i < n; i++) {

                    if (arr.get(i) == '0') {
                        flag = 1;
                    }
                }
                if (flag == 1)
                    System.out.println("LOSE");
                else
                    System.out.println("WIN");
            }
        }
    }
