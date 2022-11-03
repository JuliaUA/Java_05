import org.testng.Assert;
import org.testng.annotations.Test;


public class OddEvenTest {
    //Test Data:
    //-345 →  “Odd”
    @Test
    public void testOddEvenNegativeOddNumber_HappyPath() {
        ///AAA
        //arrange
        int number = -345;
        String expectedResult = "Odd";

        //act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //0 →  “Even”
    @Test
    public void testOddEvenZero_HappyPath() {
        ///AAA
        //arrange
        int number = 0;
        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    //222222 →  “Even”
    public void testOddEvenPositiveEvenNumber_HappyPath() {
        ///AAA
        //arrange
        int number = 222222;
        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }


}
