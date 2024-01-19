package org.checkstyle.suppressionxpathfilter.equalsavoidnull;

public class SuppressionXpathRegressionEqualsAvoidNullIgnoreCase {
    public void test() {
        String nullString = null;
        "Another string".equalsIgnoreCase(nullString); //warn
    }
}
