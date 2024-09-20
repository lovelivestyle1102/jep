package com.utry.alg;

public class SearchAlg {

    public static int search(final String text, final String pattern) {
        int[] next = calNext(pattern);
        int k = -1;
        int N = text.length();
        int M = pattern.length();
        for (int i = 0; i < N; i++) {
            while(k > -1 && pattern.charAt(k+1) != text.charAt(i)) {
                // 不匹配回溯找最大相同前后缀子字符串
                k = next[k];
            }
            if (pattern.charAt(k+1) == text.charAt(i)) {
                k++;
            }

            if (k == M - 1) {
                return i - M + 1; // 已找到匹配字符
            }
        }
        return -1; // 未找到匹配字符
    }

    private static int[] calNext(final String pattern){
        int M = pattern.length();

        int[] next = new int[M];

        next[0] = -1;

        int k = -1;

        for(int i = 1; i < M; i++){
            while(k > -1 && pattern.charAt(k+1) != pattern.charAt(i)){
                k = next[k];
            }

            if(pattern.charAt(k+1) == pattern.charAt(i)){
                k++;
            }

            next[i] = k;
        }

        return next;
    }
}
