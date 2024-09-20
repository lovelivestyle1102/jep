package com.utry.func;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ZpContext {
    protected ZpContext(){}

    private Map<String,ZcResult> context = new ConcurrentHashMap<String, ZcResult>(256);

    public boolean existVariable(String var){
        return context.containsKey(var);
    }

    public void putVariable(String var,Object data){
        context.put(var, new ZcResult(data));
    }

    public <T> T getVariable(String var){
        ZcResult result = context.get(var);

        if(result == null){
            throw new IllegalArgumentException("不存在变量："+var);
        }

        return (T) result.getData();
    }
}
