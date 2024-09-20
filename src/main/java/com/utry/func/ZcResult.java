package com.utry.func;

public class ZcResult<T> {
     private final T data;

     public ZcResult(T data){
         this.data = data;
     }

     public T getData(){
         return data;
     }
}
