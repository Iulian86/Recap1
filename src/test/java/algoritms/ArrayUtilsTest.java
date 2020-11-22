package algoritms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    @Test
    public void givenArrayWhenIsPalindromeThenTrue(){
        int[] a = {1,2,2,1};
        int[] b = {1,2,3,2,1};
        assertTrue(ArrayUtils.isPalindrome(a));
        assertTrue(ArrayUtils.isPalindrome(b));
    }

}