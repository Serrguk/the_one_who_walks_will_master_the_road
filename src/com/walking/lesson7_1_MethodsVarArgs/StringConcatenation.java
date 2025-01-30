package com.walking.lesson7_1_MethodsVarArgs;

public class StringConcatenation {

    public String toMerge(String... s) {
        StringBuilder result = new StringBuilder();
        for (String str : s) {
            result.append("\n").append(str);
        }
        return result.toString();
    }
}
