import org.testng.Assert;
import org.testng.annotations.Test;

public class IntersectionTest {
    //Test Data:
    //{1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}

    @Test
    public void testIntersection_ArraysWithPositiveNumbers_HappyPath() {
        ///AAA
        //arrange
        int[] firstArray = {1, 2, 4, 5, 89};
        int[] secondArray = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        //act
        int[] actualResult = new Intersection().intersection(firstArray,secondArray);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //{1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
    @Test
    public void testIntersection_ArraysWithPositiveAndNegativeNumbers_HappyPath() {
        ///AAA
        //arrange
        int[] firstArray = {1, 2, 4, 5, 8, 9};
        int[] secondArray = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};

        //act
        int[] actualResult = new Intersection().intersection(firstArray,secondArray);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
    //{1, 2, 4, 5, 89}, {8, 9, 45} → {}
    @Test
    public void testIntersection_NoCommonNumbers_HappyPath() {
        ///AAA
        //arrange
        int[] firstArray = {1, 2, 4, 5, 89};
        int[] secondArray = {8, 9, 45};
        int[] expectedResult = {};

        //act
        int[] actualResult = new Intersection().intersection(firstArray,secondArray);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
