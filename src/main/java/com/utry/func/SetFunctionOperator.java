package com.utry.func;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetFunctionOperator implements ZcOperator<Set>{

      private final int flag;

      private List<ZcOperator> params;

      private ZpContext context;

      public SetFunctionOperator(int flag, List<ZcOperator> params, ZpContext context){
          this.flag = flag;
          this.params = params;
          this.context = context;
      }

      public ZcResult<Set> operator(){
          List<Set> list = new ArrayList<Set>();

          for(ZcOperator op : params){
              if(op instanceof SetOperator){
                  SetOperator setOperator = (SetOperator) op;
                  list.add(setOperator.operator().getData());
              }

              if(op instanceof SetFunctionOperator){
                  SetFunctionOperator sfp = (SetFunctionOperator) op;
                  list.add(sfp.operator().getData());
              }
          }

          Set set = new LinkedHashSet();

          switch (flag){
              case 1:
                  if(list.size() > 2){
//                      set = Collections
                  }else {

                  }
                  break;
              case 2:
                  if(list.size() > 2){

                  }else {

                  }
                  break;
              case 3:
                  break;
          }

          return new ZcResult<Set>(set);
      }
}
