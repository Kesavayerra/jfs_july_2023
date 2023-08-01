package com.careerit.jsf.day13;

class Sample {
    public String joiner(String delimiter, String... arr) {


            if (arr.length == 0) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (String ele : arr) {
                sb.append(ele).append(delimiter);
            }

             return sb.substring(0, sb.length() - 1);
        }
    }
public class VarargsExample {

    public static void main(String[] args) {
        // ",","a","b","c"=>a,b,c
        Sample obj = new Sample();
        System.out.println(obj.joiner(",","a","b","c","d","e"));
        System.out.println(obj.joiner("-","a","b","c","d","e"));


    }
}
