package com.company;

public class Context {
    private int c = 0;
    private static int ptr;
    private static final int LENGTH = 65535;
    private static final byte[] memory = new byte[LENGTH];
    private String code;

    public Context(){
        this.code = "";
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public void nextCell(){
        if (ptr == LENGTH - 1){
            ptr = 0;
        }
        else
            ptr ++;
    }

    public void previousCell(){
        if (ptr == 0)
            ptr = LENGTH - 1;
        else
            ptr --;
    }

    public void increase(){
        memory[ptr] ++;
    }

    public void decrease(){
        memory[ptr] --;
    }

    public void print(){
        System.out.print((char)(memory[ptr]));
    }

    public void cycle(String str, int n){
        BrainFuck bf = new BrainFuck();

         if (memory[ptr] == 0){
             n++;
             while (c > 0 || str.charAt(n) != ']'){
                 if (str.charAt(n) == '[')
                     c ++;
                 else if (str.charAt(n) == ']')
                     c --;
                 n++;
             }
             bf.interpret(str, n);
        }
    }

    public void repeat(String str, int n){
        BrainFuck bf = new BrainFuck();

         if (memory[ptr] != 0){
             n--;
             while (c > 0 || str.charAt(n) != '['){
                 if (str.charAt(n) == ']')
                     c ++;
                 else if (str.charAt(n) == '[')
                     c --;
                 n--;
             }
             bf.interpret(str, n--);
         }
    }


}