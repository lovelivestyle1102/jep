package com.utry.func;

public class ZcVoid extends ZcResult<ZcVoid>{

    private final static ZcVoid zcVoid = new ZcVoid();

    public ZcVoid(ZcVoid data){
        super(data);
    }

    private ZcVoid(){
        super(zcVoid);
    }

    @Override
    public ZcVoid getData() {
        throw new UnsupportedOperationException("UnSupported");
    }

    public static ZcVoid getInstance(){
        return zcVoid;
    }
}
