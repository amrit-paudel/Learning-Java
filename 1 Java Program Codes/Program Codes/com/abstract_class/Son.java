

package com.abstract_class;

public class Son extends Parent {

    Son(){

    }

    Son(String career){
        super(career);
    }
    
    @Override
    void career(){

        System.out.println("Career : "+super.career);

    }
    
}
