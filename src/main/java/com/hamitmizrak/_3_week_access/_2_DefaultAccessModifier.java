package com.hamitmizrak._3_week_access;

import com.hamitmizrak.utils.SpecialColor;

public class _2_DefaultAccessModifier {

    public static void main(String[] args) {
        _1_PublicAccessModifier accessModifier= new _1_PublicAccessModifier();
        System.out.println(SpecialColor.BLUE+accessModifier.publicData+SpecialColor.RESET);
        System.out.println(SpecialColor.YELLOW+accessModifier.defaultData+SpecialColor.RESET);
        System.out.println(SpecialColor.PURPLE+accessModifier.protectedData+SpecialColor.RESET);
        //System.out.println(SpecialColor.RED+accessModifier.privateData+SpecialColor.RESET);
    }
}
