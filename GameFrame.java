import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
    GameFrame(int score) {
        this.add(new GamePanel(score));
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
}
