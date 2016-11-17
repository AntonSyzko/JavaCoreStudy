package AlgoritmicsTests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Admin on 17.11.2016.
 */

/**
 * Implementers can identify the index of a String efficiently within a sorted array of candidates.
 */
interface Locator
{
    /**
     * @param itemSought
     *        the item for which the index is sought
     * @param candidates
     *        a sorted array of items, from within which the itemSought must be found
     * @return the zero based index of the itemSought within the array of candidates. In the event that
     *        the itemSought is not found in the candidates array an index of -1 is returned.
     */
    public int getIndex(String itemSought, String[] candidates);
}

public class YospaceTest implements Locator {
   static String[] testArray = {"A", "B", "C", "DD", "Yospace"};
   static String serachFor = "Yospace";

    public static void main(String[] args) {
        YospaceTest testing = new YospaceTest();
        int index = testing.getIndex(serachFor, testArray);
        System.out.println(index);
    }

    @Override
    public int getIndex(String itemSought, String[] candidates) {
        if(candidates !=null && candidates.length >0 && itemSought !=null && itemSought.length()>0 ){
            int low = 0;
            int high = candidates.length - 1;
            int mid;

            while (low <= high) {
                mid = (low + high) / 2;

                if (candidates[mid].compareTo(itemSought) < 0) {
                    low = mid + 1;
                } else if (candidates[mid].compareTo(itemSought) > 0) {
                    high = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }

    @Test
    public void testingYospacetest(){
        YospaceTest testing = new YospaceTest();
        int indexforYospace = testing.getIndex(serachFor, testArray);
        int indexforB= testing.getIndex("B", testArray);
        int indexForNonExisting= testing.getIndex("stub", testArray);

        assertNotNull(testArray);
        assertNotNull(serachFor);
        assertNotEquals(0,testArray.length);
        assertNotEquals(0,serachFor.length());
        assertEquals(4,indexforYospace);
        assertNotEquals(0,indexforB);
        assertNotEquals(-1,"A");
        assertEquals(-1,indexForNonExisting);


    }
}
