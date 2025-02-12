public class WordManager {
    private String word;
    private int l;
    private String current;
    private int guesses;
    private String guessedLetters;

    public WordManager(String word) {
        this.word = word;
        this.l = word.length();
        this.guesses = 5;
        this.guessedLetters = "";

        current = "";
        for (int i=0; i<word.length(); i++) {
            current += "*";
        }
    }

    public String current() {
        return current;
    }

    public int guesses() {
        return guesses;
    }

    public String letters() {
        return guessedLetters;
    }

    public boolean solved(){
        return current.toLowerCase().equals(word.toLowerCase());
    }

    public String finalWord() {
        return word;
    }

    public boolean guess(String guess) {
        String temp = "";
        boolean correct = false;
        for (int i=0; i<l; i++) {
            String thisChar = word.substring(i, i+1).toLowerCase();
            if (thisChar.equals(guess.toLowerCase())) {
                temp += guess.toUpperCase();
                correct = true;
            } else {
                temp += current.substring(i, i+1);
            }
        }
        current = temp;
        if (!correct) {
            if (guessedLetters.indexOf(guess.toUpperCase()) == -1) guessedLetters += " " + guess.toUpperCase();
            this.guesses --;
        }
        return correct;
    }
}
