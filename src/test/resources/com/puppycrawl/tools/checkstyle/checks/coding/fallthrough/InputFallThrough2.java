/*
FallThrough
checkLastCaseGroup = (default)false
reliefPattern = (default)falls?[ -]?thr(u|ough)


*/

package com.puppycrawl.tools.checkstyle.checks.coding.fallthrough;

public class InputFallThrough2 {
    enum Test {
        A, B, C
    }

    public static void test() {
        Test test = Test.A;
        int variable = 0;

        switch (test) {
            case A:
                break;
            case B:
                if (variable == 1) {
                    // some work
                    break;
                }
            case C: // violation 'Fall\ through from previous branch of the switch statement.'
                break;
        }

        int var2 = 1;
        switch (variable) {
            case 0:
            case 1:
            case 2:
                System.identityHashCode(var2);
                break;
            case 3:
                if (true) {
                    return;
                }
            case 4: // violation 'Fall\ through from previous branch of the switch statement.'
                if (var2 == 2) {
                    break;
                }
            case 5: // violation 'Fall\ through from previous branch of the switch statement.'
                if (var2 == 1) {

                }
                else if (true) {
                    return;
                }
            case 6: // violation 'Fall\ through from previous branch of the switch statement.'
                if (var2 > 1) {
                    break;
                }
                else {
                    break;
                }
            case 7:
                if (var2 ==1) {
                    break;
                }
                else if (true) {
                    return;
                }
            case 8: // violation 'Fall\ through from previous branch of the switch statement.'
                if(var2 == 5) {
                    System.identityHashCode("0xB16B00B5");
                }
                else {
                    break;
                }
            case 9: // violation 'Fall\ through from previous branch of the switch statement.'
                if(var2 == 5) {
                    System.identityHashCode("0xCAFED00D");
                }
                else {
                    String.CASE_INSENSITIVE_ORDER.equals("0x4B1D");
                }
                break;
            case 10:
                int var3 = 0xDEADBEEF;
                switch (var3) {
                    case 0xCAFEBABE:
                        String.CASE_INSENSITIVE_ORDER.equals("0x1CEB00DA");
                    default: // violation 'Fall\ through from prev.* br.* switch statement.'
                        String.CASE_INSENSITIVE_ORDER.equals("");
                }
                if(true) {
                    break;
                }
            case 11: // violation 'Fall\ through from previous branch of the switch statement.'
                if(false) {break;}
            case 12: // violation 'Fall\ through from previous branch of the switch statement.'
                if(true);
                break;
            default:
                break;
        }
    }
}
