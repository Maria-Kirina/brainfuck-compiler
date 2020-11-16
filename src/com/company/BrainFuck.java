package com.company;

public class BrainFuck {

    public void interpret(String str, int n){
        Factory fctr = new Factory();

            for(; n < str.length(); n++){
                fctr.getType(str, str.charAt(n), n);
            }
    }

}
