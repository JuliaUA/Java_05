import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {
   @Test
    public void testRemoveSpaces_WithSpaces_HappyPath() {
        String text = "    Red Rover School   ";
        String  expectedResult = "Лишние пробелы удалены";

        String actualResult = new StringMethods().removeSpaces(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemoveSpaces_WithoutSpaces_HappyPath() {
        String text = "Red Rover School";
        String  expectedResult = "Пробелов не было";

        String actualResult = new StringMethods().removeSpaces(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemoveSpaces_EmptyString_HappyPath() {
        String text = "";
        String  expectedResult = "Строка пустая";

        String actualResult = new StringMethods().removeSpaces(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemoveAllAs_WithoutAs_HappyPath() {
        String text = "    Red Rover School   ";
        String  expectedResult = "Red Rover School";

        String actualResult = new StringMethods().removeAllAs(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemoveAllAs_WithAsWithSpaces_HappyPath() {
        String text = "panda   ";
        String  expectedResult = "pnd";

        String actualResult = new StringMethods().removeAllAs(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemoveAllAs_WithAsWithoutSpaces_HappyPath() {
        String text = "tramasalata";
        String  expectedResult = "trmslt";

        String actualResult = new StringMethods().removeAllAs(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemoveAllZeroes_DifferentNumbers_HappyPath() {
        String text = "3504209706040000 ";
        String  expectedResult = "35429764";

        String actualResult = new StringMethods().removeAllZeroes(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemoveAllZeroes_OnesAndZeroes_HappyPath() {
        String text = "0000000111";
        String  expectedResult = "111";

        String actualResult = new StringMethods().removeAllZeroes(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemoveAllZeroes_EmptyString_HappyPath() {
        String text = "";
        String  expectedResult = "Строка пустая";

        String actualResult = new StringMethods().removeAllZeroes(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemoveAllSpaces_WithSpacesThreeWords_HappyPath() {
        String text = "    R e d     Ro ve    r Sc   h ool   ";
        String  expectedResult = "RedRoverSchool";

        String actualResult = new StringMethods().removeAllSpaces(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemoveAllSpaces_WithSpacesOneWord_HappyPath() {
        String text = "p a     n   d a   ";
        String  expectedResult = "panda";

        String actualResult = new StringMethods().removeAllSpaces(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testcountAs_OneWord_HappyPath() {
        String text = "Abracadabra";
        String  expectedResult = "5, 6";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testcountAs_TwoWords_HappyPath() {
        String text = "Homenum Revelio";
        String  expectedResult = "0, 15";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testcountAs_NumberAndWord_HappyPath() {
        String text = "3 tarAmasAlatA";
        String  expectedResult = "6, 8";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCountJava_WithJava_HappyPath() {
        String text = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are" +
                " the current long-term support (LTS) versions. Oracle released the last zero-cost" +
                " public update for the legacy version Java 8 LTS in January 2019 for commercial use," +
                " although it will otherwise still support Java 8 with public updates for personal use indefinitely." +
                " Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving\n" +
                " security and other upgrades.";
        boolean  expectedResult = true;

        boolean actualResult = new StringMethods().countJava(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCountJava_WithoutJava_HappyPath() {
        String text = "99 little bugs in a code." +
                " 99 little bugs in a code." +
                " Take one down, and patch it around." +
                " 235 critical bugs in the code.";
        boolean  expectedResult = false;

        boolean actualResult = new StringMethods().countJava(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testInsertQuotes_HappyPath() {
        String word = "Abracadabra";
        String  expectedResult = "\"Abracadabra\"";

        String actualResult = new StringMethods().insertQuotes(word);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testInsertQuotes_Dostoevsky_HappyPath() {
        String text = "Федор Достоевский писал";
        String quote = "Надо любить жизнь больше, чем смысл жизни.";
        String  expectedResult = "Федор Достоевский писал: \"Надо любить жизнь больше, чем смысл жизни.\"";

        String actualResult = new StringMethods().insertQuotes(text,quote);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testInsertQuotes_Napoleon_HappyPath() {
        String text = "Наполеон Бонапарт писал";
        String quote = "В моем словаре нет слова «невозможно».";
        String  expectedResult = "Наполеон Бонапарт писал: \"В моем словаре нет слова \"невозможно\".\"";

        String actualResult = new StringMethods().insertQuotes(text,quote);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testImproveCityName_Tashkent_HappyPath() {
        String cityName = "ташкент";
        String  expectedResult = "Ташкент";

        String actualResult = new StringMethods().improveCityName(cityName);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testImproveCityName_Chikago_HappyPath() {
        String cityName = "ЧикаГО";
        String  expectedResult = "Чикаго";

        String actualResult = new StringMethods().improveCityName(cityName);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testFindStringBetweenIndices_Abracadabra_HappyPath() {
        String text = "Abracadabra";
        char letter = 'b';
        String  expectedResult = "bracadab";

        String actualResult = new StringMethods().findStringBetweenIndices(text,letter);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testFindStringBetweenIndices_Whippersnapper_HappyPath() {
        String text = "Whippersnapper";
        char letter = 'p';
        String  expectedResult = "ppersnapp";

        String actualResult = new StringMethods().findStringBetweenIndices(text,letter);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testFindIfBeginsAndEndsSameLetter_Abracadabra_HappyPath() {
        String word = "Abracadabra";
        boolean  expectedResult = true;

        boolean actualResult = new StringMethods().findIfBeginsAndEndsSameLetter(word);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testFindIfBeginsAndEndsSameLetter_Whippersnapper_HappyPath() {
        String word = "Whippersnapper";
        boolean  expectedResult = false;

        boolean actualResult = new StringMethods().findIfBeginsAndEndsSameLetter(word);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testFindLastWord_HappyPath() {
        String word = "Red Rover";
        String   expectedResult = "Rover";

        String  actualResult = new StringMethods().findLastWord(word);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemoveAllBetweenTwoIndices_HappyPath() {
        String text = "Red Rover";
        int firstIndex = 1;
        int lastIndex = 4;
        String   expectedResult = "Rover";

        String  actualResult = new StringMethods().removeAllBetweenTwoIndices(text, firstIndex,lastIndex);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testSplitToArray_EnglishWords_HappyPath() {
        String text = "QA for Everyone";
        String[]   expectedResult = {"QA", "for", "Everyone"};

        String[]  actualResult = new StringMethods().splitToArray(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testSplitToArray_RussianWords_HappyPath() {
        String text = "Александр Сергеевич Пушкин";
        String[]   expectedResult = {"Александр", "Сергеевич", "Пушкин"};

        String[]  actualResult = new StringMethods().splitToArray(text);

        Assert.assertEquals(actualResult,expectedResult);
    }
    // //Test Data:
    //    //“Александр Сергеевич Пушкин” →
    //    //
    //    //“Имя: Александр
    //    //Отчество: Сергеевич
    //    //Фамилия: Пушкин”
    @Test
    public void testSeparateNameAndLastname_HappyPath() {
        String text = "Александр Сергеевич Пушкин";
        String   expectedResult = "Имя: Александр" + "\n" + "Отчество: Сергеевич" + "\n" + "Фамилия: Пушкин";

        String  actualResult = new StringMethods().separateNameAndLastname(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRepeatWordNTimes_HappyPath() {
        String word = "one";
        int number = 5;
        String   expectedResult = "oneoneoneoneone";

        String  actualResult = new StringMethods().repeatWordNTimes(word,number);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRepeatWordNTimes_EmptyWord_HappyPath() {
        String word = "";
        int number = 5;
        String   expectedResult = "Enter valid data";

        String  actualResult = new StringMethods().repeatWordNTimes(word,number);

        Assert.assertEquals(actualResult,expectedResult);
    }


    @Test
    public void testFindIntValueOfChar_HappyPath() {
        String word = "RedRoverSchool";
        int index = 5;
        int   expectedResult = 118;

        int  actualResult = new StringMethods().findIntValueOfChar(word, index);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCompareWords_True_HappyPath() {
        String firstWord = "one";
        String secondWord = "One";
        String thirdWord = "ONE";
        boolean   expectedResult = true;

        boolean  actualResult = new StringMethods().compareWords(firstWord, secondWord, thirdWord);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCompareWords_False_HappyPath() {
        String firstWord = "one";
        String secondWord = "Один";
        String thirdWord = "ONE";
        boolean   expectedResult = false;

        boolean  actualResult = new StringMethods().compareWords(firstWord, secondWord, thirdWord);

        Assert.assertEquals(actualResult,expectedResult);
    }


}

