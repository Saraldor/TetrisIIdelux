import javax.swing.*;

public class Windows {
    public static final int WIDTH = 445, HEIGHT = 629;
   private Board board;
    private JFrame window;
    public Windows() {
        window = new JFrame("Tetris II Delux");
window.setSize(WIDTH, HEIGHT);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setResizable(false);
window.setLocationRelativeTo(null);
board = new Board();
window.add(board);
window.setVisible(true);
    }
    public static void main(String[]args){
        new Windows();

    }


}

