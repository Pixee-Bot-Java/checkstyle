/*
RightCurly
option = ALONE_OR_SINGLELINE
tokens = (default)LITERAL_TRY, LITERAL_CATCH, LITERAL_FINALLY, LITERAL_IF, LITERAL_ELSE


*/

package com.puppycrawl.tools.checkstyle.checks.blocks.rightcurly;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputRightCurlyTestIsAloneOrSinglelineLambda {

    static Runnable r1 = () -> {
        String.valueOf("Test rightCurly one!");
    };

    static Runnable r2 = () -> String.valueOf("Test rightCurly two!");

    static Runnable r3 = () -> {String.valueOf("Test rightCurly three!");};

    static Runnable r4 = () -> {
        String.valueOf("Test rightCurly four!");};

    static Runnable r5 = () ->
    {
        String.valueOf("Test rightCurly five!");
    };

    static Runnable r6 = () -> {};

    static Runnable r7 = () -> {
    };

    static Runnable r8 = () ->
    {
    };

    static Runnable r9 = () -> {
        String.valueOf("Test rightCurly nine!");
    }; int i;

    void foo1() {
        Stream.of("Hello").filter(s -> {
                return s != null;
            }
        ).collect(Collectors.toList());

        Stream.of("Hello").filter(s -> {
                return s != null;
        }).collect(Collectors.toList());

        Stream.of("H").filter(s -> {return s != null;}).collect(Collectors.toList());
    }
}
