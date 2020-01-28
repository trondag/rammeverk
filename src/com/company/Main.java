package com.company;

import com.company.component.Architecture;
import com.company.component.Component;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.getFactory(Architecture.COMPONENT);
        Component component = factory.createComponent();
    }
}
