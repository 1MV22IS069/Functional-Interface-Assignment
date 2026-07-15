package com.cl.stringoperation;


@FunctionalInterface
interface StringOperation {
    String perform(String s);
}

@FunctionalInterface
interface BooleanOperation {
    boolean check(String s);
}

@FunctionalInterface
interface IntegerOperation {
    int perform(String s);
}

@FunctionalInterface
interface LongOperation {
    long perform(String s);
}

@FunctionalInterface
interface PrintOperation {
    void Opprint(String s);
}

@FunctionalInterface
interface CharacterOperation {
    char perform(String s);
}
