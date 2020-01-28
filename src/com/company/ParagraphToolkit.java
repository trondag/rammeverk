package com.company;

import com.company.component.Component;
import com.company.component.HeaderComponent;
import com.company.component.ParagraphComponent;

public class ParagraphToolkit extends AbstractFactory {

    @Override
    public Component createComponent() {
        return new ParagraphComponent("p");
    }
}
