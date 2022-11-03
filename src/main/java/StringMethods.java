import java.sql.PreparedStatement;
import java.util.Locale;

public class StringMethods {
    //1.Написать метод removeSpaces(), который принимает на вход строку.
    //Если строка не пустая (проверить методом класса String), то примените метод по удалению пробелов
    // в начале и в конце строки.
    //Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
    //Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
    //Если пробелов не было, вернуть сообщение “Пробелов не было”.
    //Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”.
      public String removeSpaces(String text) {
        if(text.isEmpty()) {

            return "Строка пустая";
        } else {
            String result = text.trim();
            if(text.length() > result.length()) {

                return  "Лишние пробелы удалены";
            } else {

                return  "Пробелов не было";
            }
        }
    }

    //2.Написать алгоритм removeAllAs().
    //С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
    // Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
    // Метод возвращает обработанную строку.
    public String removeAllAs(String text) {
        if(text.isEmpty()) {

            return "Строка пустая";
        } else {

            return text.replace("a","").trim();
        }
    }

    //3.Написать алгоритм removeAllZeros().
    //С помощью методов из видео1,  написать алгоритм, который принимает на вход строку,
    // состоящую из цифр. Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
    // Метод возвращает обработанную строку, в которой нет нулей.
    // Если в строке не было нулей, метод возвращает сообщение “This is a valid string”.
    public String removeAllZeroes(String text) {
        if(text.isEmpty()) {
            return "Строка пустая";
        } else {
            text = text.replace(" ", "");
            String result = text.replace("0", "");
            if(text.length() == result.length()) {
                return  "This is a valid string";
            } else {
                return result;
            }
        }
    }
    //4.Написать алгоритм removeAllSpaces.
    //С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
    // Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
    // Метод возвращает обработанную строку.
    public String removeAllSpaces(String text) {
        if(!text.isEmpty()) {
            return text.replace(" ", "");
        } else {

            return "Строка пустая";
        }
    }

    //5.Напишите метод countAs(), который принимает на вход строку и считает, сколько букв а или А содержится в строке.
    // Метод возвращает количество букв a/A,  и количество букв/знаков в слове без букв a/A.
    // Итоговый результат должен строится с помощью метода из видео 2.
    public String countAs(String text) {
        if(text.isEmpty()) {
            return "Строка пустая";
        } else {
            text = text.toLowerCase();
            int countA = 0;
            for(int i = 0; i < text.length(); i++) {
                if(text.charAt(i) == 'a') {
                    countA++;
                }
            }
            int countNotA = text.length() - countA;

            return countA + ", " + countNotA;
        }
    }
    //6.Напишите метод countJava(), который принимает на вход текст и проверяет,
    // содержится ли в тексте хотя бы одно слово Java.
   public boolean countJava(String text) {
       if(text.isEmpty()) {
           System.out.println("Строка пустая");
       } else {

          return text.contains("Java");
       }

       return false;
   }
   //7.Напишите метод insertQuotes(), который принимает слово и возвращает строку,
    // в которой это слово “обернуто” в кавычки:
    public String insertQuotes(String word) {
        if(word.isEmpty()) {

            return "Введите слово";
        } else {

           return  "\"" + word + "\"";
        }
      }
    //8.Напишите метод insertQuotes(), который принимает на вход две строки, и добавляет знак :
    // после слова “писал”,  и оборачивает в кавычки вторую строку
    //(результат строится с помощью метода concat())
    public String insertQuotes(String text, String quote) {
        if(text.isEmpty() || quote.isEmpty()) {
            return "Введите строку и/или цитату";
        } else {
            quote = quote.replace("«","\"").replace("»","\"");
            return text.concat(": ").concat("\"").concat(quote).concat("\"");
        }
      }
    //9.Напишите метод, кторый принимает на вход название города и исправляет написание:
    public String improveCityName(String cityName) {
        if(cityName.isEmpty()) {
            return  "Введите название города";
        } else {
            char firstLetter = cityName.toUpperCase().charAt(0);
            String otherLetters = cityName.substring(1).toLowerCase();

            return firstLetter + otherLetters;
        }
    }
    //10.Напишите метод, который принимает на вход строку и букву-параметр,
    // и возвращает все, что находится между первой и последней буквой-параметром:
    public String findStringBetweenIndices(String text, char letter) {
          if(text.isEmpty() || letter == ' ') {
              return  "Enter valid data";
          } else {

              return text.substring((text.indexOf(letter)), (text.lastIndexOf(letter))+1);
          }
    }
    //11.Напишите метод, который принимает на вход слово, и возвращает true,
    // если слово начинается и заканчивается на одинаковую букву, и false иначе
   public boolean findIfBeginsAndEndsSameLetter(String word) {
          boolean result = false;
          if(word.isEmpty()) {
              System.out.println("Enter a word");
          } else {
              word = word.toLowerCase();
              if(word.charAt(0) == word.charAt(word.length()-1)) {
                  result = true;
              }
          }

          return result;
   }
   //12.Напишите метод, который принимает на вход строку из двух слов, разделенных пробелом,
    // и возвращает последнее слово
    public String findLastWord(String twoWords) {
        if(twoWords.isEmpty()) {
            return  "Введите 2 слова";
        } else {
            int indexOfSpace = twoWords.indexOf(" ");
            return twoWords.substring(indexOfSpace+1);
        }
    }
    //13.Написать метод, который принимает строку, и 2 индекса.
    // Метод удаляет все, что находится между двумя индексами включительно
    public String removeAllBetweenTwoIndices(String text, int firstIndex, int lastIndex) {
        if(text.isEmpty() || firstIndex < 0 || lastIndex <= 0 || firstIndex >= lastIndex) {
            return  "Введите валидные данные";
        } else {
            String firstPart = text.substring(0,firstIndex);
            String secondPart = text.substring(lastIndex+1);
            return firstPart.concat(secondPart);
        }
    }
    //14.Напишите метод, который принимает на вход предложение
    // и возвращает слова из этого предложения в виде массива слов
    public String[] splitToArray(String text) {
          if(!text.isEmpty()) {
              return text.split(" ");
          } else {
              return new String[]{};
          }
    }
    //15.Написать метод, который принимает на вход предложение, которое состоит из имени,
    // фамилии, отчества и возвращает текст:
   public String separateNameAndLastname(String nameAndLastName) {
          String result = "";
          if(!nameAndLastName.isEmpty()) {
              String[] nameArray = nameAndLastName.split(" ");
              result =  "Имя: " + nameArray[0] + "\n" + "Отчество: "
                      + nameArray[1] + "\n" + "Фамилия: " +nameArray[2];
          }

          return result;
   }
   //16.Написать метод, который принимает на вход слово и число n,
    // и возвращает строку, где слово повторяется n раз.
   public String repeatWordNTimes(String word, int number) {
          if(!(word.isEmpty()) && number > 0) {
              return word.repeat(number);
          } else {
              return "Enter valid data";
          }
   }
   //17. Напишите метод, который принимает строку и index,
    // и возвращает численное значение буквы, которая находится на позиции index
    // (использовать только один метод класса String)
    public int findIntValueOfChar(String text, int index) {
          if((!text.isEmpty()) && index >= 0) {
              return text.charAt(index);
        } else {
              return 0;
        }
    }
    //18.Написать метод, который принимает 3 слова, и сравнивает их методом,
    // который считает, что прописные и заглавные буквы - это одни и те же буквы.
    public boolean compareWords(String firstWord, String secondWord, String thirdWord) {
          if(!firstWord.isEmpty() && !secondWord.isEmpty() && !thirdWord.isEmpty()) {
              firstWord = firstWord.toLowerCase();
              secondWord = secondWord.toLowerCase();
              thirdWord = thirdWord.toLowerCase();
              if(firstWord.equals(secondWord) && firstWord.equals(thirdWord)) {
                  return true;
              }
          } else {
              System.out.println("Enter valid data");
              return false;
          }
          return false;
    }

    // Метод возвращает true, если все слова одинаковы, и метод возвращает false, если слова не одинаковы:
    //Test Data:
    //“one”, “One”, “ONE”  → true
    //“one”, “Один”, “ONE” → false

}
