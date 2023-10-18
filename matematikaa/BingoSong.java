
package matematikaa;

public class BingoSong {
    private final int claps;

    public BingoSong(int claps) {
        this.claps = claps;
    }

    public void singBingo() {
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        
        for (int i = 0; i < claps; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < claps - i; j++) {
                line.append("(clap)");
            }
            for (int j = 0; j < i; j++) {
                line.append("-");
            }
            line.append("O");
            System.out.println(line);
        }
        
        System.out.println("And Bingo was his name-o.");
    }

    public static void main(String[] args) {
        int numberOfClaps = 5;
        BingoSong bingoSong = new BingoSong(numberOfClaps);
        bingoSong.singBingo();
    }
}


