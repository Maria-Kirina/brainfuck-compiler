package com.company;

public class Factory {
    public void getType(String str, Character Sym, int n) {
        Context ct = new Context();

        if (Sym.equals('>')) {
            ct.nextCell();
        }else if (Sym.equals('<')) {
            ct.previousCell();
        }else if (Sym.equals('+')) {
            ct.increase();
        } else if (Sym.equals('-')) {
            ct.decrease();
        } else if (Sym.equals('.')) {
            ct.print();
        }else if (Sym.equals('[')) {
            ct.cycle(str, n);
        }else if (Sym.equals(']')) {
            ct.repeat(str, n);
        }
        else
            System.out.print(" ");
    }
}