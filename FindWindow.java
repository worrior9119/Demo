package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class FindWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int temp[] = new int[n];
            int a[] = new int[n];
            int start = 0,end = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                temp[i] = a[i];
            }
            Arrays.sort(temp);
            for (int i=0;i<n;i++){
                if(a[i]!=temp[i]) {
                    start = i;
                    break;
                }
            }
            for (int i=n-1;i>0;i--){
                if(a[i]!=temp[i]) {
                    end = i;
                    break;
                }
            }
            System.out.println(start+" "+end);
        }
    }
}
