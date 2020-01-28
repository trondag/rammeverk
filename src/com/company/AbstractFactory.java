package com.company;

import com.company.component.Architecture;
import com.company.component.Component;

public abstract class AbstractFactory {
    private static final ParagraphToolkit COMPONENT_TOOLKIT = new ParagraphToolkit();

    static AbstractFactory getFactory(Architecture architecture){
        AbstractFactory factory = null;
        switch (architecture){
            case COMPONENT:
                factory = COMPONENT_TOOLKIT;
                break;
        }
        return factory;
    }


    public abstract Component createComponent();
}
