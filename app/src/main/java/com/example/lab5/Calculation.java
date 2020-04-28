package com.example.lab5;

public class Calculation {
    static public String Ferma(String str){
        int n = Integer.parseInt(str);
        if (n % 2 == 0) return "Error.\nNeed odd number.";
        int nSqrt = (int) Math.ceil(Math.sqrt(n));
        double res;
        boolean isTrue = true;
        int[] result = new int[2];
        while(true){
            res = Math.pow(nSqrt,2) - n;
            if(Math.sqrt(res) % 1 == 0){
                result[0] = nSqrt - (int)Math.sqrt(res);
                result[1] = nSqrt + (int)Math.sqrt(res);
                String strRes ="x= " +  result[0] + "\ny= " + result[1];
                return strRes;
            }
            else{nSqrt++;}
        }
    }
}
