import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {
//createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}
@Test
public void testCreateIntArray_HappyPath() {
    ///AAA
    //arrange
    int one = 1;
    int two = 2;
    int three = 3;
    int four = 4;
    int five = 5;
    int[] expectedResult = {1, 2, 3, 4, 5};

    //act
    int[]actualResult = new CreateArray().createIntArray(one, two, three, four, five);

    //Assert
    Assert.assertEquals(actualResult,expectedResult);
}
//createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}
@Test
public void testCreateDoubleArray_HappyPath() {
    ///AAA
    //arrange
    double one = 1.1;
    double two = 2.5;
    double three = 3.7;
    double four = 4.0;
    double five = 5.5;
    double[] expectedResult = {1.1, 2.5, 3.7, 4.0, 5.5};

    //act
    double[] actualResult = new CreateArray().createDoubleArray(one, two, three, four, five);

    //Assert
    Assert.assertEquals(actualResult,expectedResult);
}
//createStringArray(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
@Test
public void testCreateStringArray_HappyPath() {
    ///AAA
    //arrange
    String one = "It";
    String two = "was";
    String three = "an";
    String four = "apple";
    String five = "pie";
    String[] expectedResult = {"It", "was", "an", "apple", "pie"};

    //act
    String[] actualResult = new CreateArray().createStringArray(one, two, three, four, five);

    //Assert
    Assert.assertEquals(actualResult,expectedResult);
}

//createArrayFromText(“It was an apple pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
@Test
public void testCreateArrayFromText_HappyPath() {
        ///AAA
        //arrange
        String text = "It was an apple pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

        //act
        String[] actualResult = new CreateArray().createArrayFromText(text);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
    //В классе CreateArray написать метод createIntArrayFromText(),
    // который принимает на вход строку чисел (н-р, “3 4 1 8 10 12.3”)
    // и возвращает массив типа int[] из этих чисел. (vожно использовать split() или toCharArray())
    @Test
    public void testCreateIntArrayFromText_HappyPath() {
        ///AAA
        //arrange
        String text = "3 4 1 8 10 12.3";
        int[] expectedResult = {3, 4, 1, 8, 10, 12};

        //act
        int[] actualResult = new CreateArray().createIntArrayFromText(text);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}

