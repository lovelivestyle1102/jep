package com.utry.func;

import java.util.Set;

public class SetOperator implements ZcOperator<Set>{

    private ZcResult<Set> result;

    public SetOperator(Set data){
        result = new ZcResult<Set>(data);
    }

    @Override
    public ZcResult<Set> operator(){
        return result;
    }
}
