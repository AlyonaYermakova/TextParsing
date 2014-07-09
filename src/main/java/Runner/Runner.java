package Runner;

import static util.SimpleParsing.*;


public class Runner {

   public static void main(String[] args) {

        String str = new String("It is simple sentence. \n Does it work? ");
        printParsed(parseParagraphs(str));
        printParsed(parseSentences(str));
        printParsed(parseWords(str));

    }
}
