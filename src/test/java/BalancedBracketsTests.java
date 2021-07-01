import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BalancedBracketsTests {

//    @Test
//    public void starterTest() {
//        assertEquals(10, 10, .001);
//    }

    @Test
    public void testBasicBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testEmptyStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    //"[L]au[n]ch[c]od[]e"
    @Test
    public void testInterspersedBracketPairs(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[L]au[n]ch[c]od[]e"));
    }

    //[LaunchCode
    @Test
    public void testOneOpenBracketIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    //"[[[[a]a][]]][]"
    @Test
    public void testRandomNestedBracketPairs(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[a]a][]]][]"));
    }

    //"]asd[f]aaa[df]vag[]"
    @Test
    public void testLoneClosingBracketIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]asd[f]aaa[df]vag[]"));
    }

    //"]"
    @Test
    public void testSingleClosingBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    //"]["
    @Test
    public void testClosingThenOpeningBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testClosingBeforeOpeningAmonCharacters(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void testLostsOfPairsWithExtraOpenBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[][][][][][][]"));
    }

    @Test
    public void testLostsOfPairsWithExtraCloseBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][][][][][][]]]]"));
    }
}
