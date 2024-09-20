package com.utry.func;

public class PrintOperator implements ZcOperator{

    private int flag;

    private Object target;

    public PrintOperator(int flag, Object target){
        this.flag = flag;
        this.target = target;
    }

    @Override
    public ZcResult operator() {
        Object t = target;

        if(target instanceof ZcOperator){
            ZcOperator zo = (ZcOperator) target;

            t = zo.operator().getData();
        }

        switch (flag){
            case 1:
                System.out.println(t);
            case 2:
                System.out.println(t);
        }
        return ZcVoid.getInstance();
    }
}
