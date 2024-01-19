package org.checkstyle.suppressionxpathfilter.equalsavoidnull;

public class SuppressionXpathRegressionEqualsAvoidNull {
    public void test() {
        String nullString = null;
        "Another string".equals(nullString); //warn
    }
}
