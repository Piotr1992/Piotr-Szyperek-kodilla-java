package com.kodilla.stream.beautifier;

import java.lang.*;

public class PoemBeautifier {
    public String beautify(String tekst, PoemDecorator pd) {
        return pd.decorate(tekst);
    }
}
