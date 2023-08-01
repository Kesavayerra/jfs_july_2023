package com.careerit.jsf.day11;

public class StringBuilderExample {

    // When ever we are making mutable String object we will be using String Builder or String Buffer
    public static void main(String[] args) {
        String username = "Manoj";
        String Description = "He works of SSGA Bengaluru";

        StringBuilder sb = new StringBuilder();
        sb.append("<!Doctype html>\n")
                .append ("<!DOCTYPE html>\n")
                .append("<html>\n")
                .append("<head>\n")
                .append("<title>Profile Introduction</title>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h1>Welcome : ")
                .append(username)
                .append("</h1>\n")
                .append("<p>")
                .append(Description)
                .append("</p>\n")
                .append ("</body>\n")
                .append("</html>\n");
        System.out.println(sb);


    }
}
