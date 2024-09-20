package org.parsers;

import java.io.IOException;

public class Parser {
    public static int lookhead;

    public Parser() throws IOException{
        lookhead = System.in.read();
    }

    public void expr() throws IOException{
        term();
        while(true){
            if(lookhead == '+'){
                match('+');term();System.out.write('+');
            }else if(lookhead == '-'){
                match('-');term();
                System.out.write('-');
            }else{
                return;
            }
        }
    }

    public void term() throws IOException {
        if( Character.isDigit((char)lookhead)){
            System.out.write((char)lookhead);match(lookhead);
        }else{
            throw new Error("syntax error");
        }
    }

    public void match(int t) throws IOException {
        if(lookhead == t){
            lookhead = System.in.read();
        }else {
            throw new Error("syntax error");
        }
    }

    public static void main(String[] args) throws IOException {
        Parser parser = new Parser();
        parser.expr();
        System.out.println("\n");
    }
}


