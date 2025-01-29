package com.walking.lesson7_MethodsVarArgsOverloading;

public class StringConcatenation {

    public String toMerge(String... s) {
        StringBuilder result = new StringBuilder();
        for (String str : s) {
            result.append(str);
        }
        return result.toString();
    }
}
