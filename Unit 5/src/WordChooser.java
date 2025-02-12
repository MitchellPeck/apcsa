public class WordChooser {
    private static final String[] words = {"Computer Science", "Goose", "College Board", "Apple", "Banana", "Breakfast", "Assembly", "JavaScript", "Coding", "Programming", "Google", "Bing", "Microsoft", "Apple", "Among Us"};

    public static String getWord() {
        int l = words.length;
        int random = (int)(Math.random()*l);
        return words[random];
    }
}
