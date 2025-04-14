import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GameFrame {
    private JFrame frame;
    private GameCanvas gamecanvas;
    private JPanel cp;
    private Player player; 

    public GameFrame() {
        frame = new JFrame();
        gamecanvas = new GameCanvas(); 
        cp = (JPanel) frame.getContentPane();
        cp.setFocusable(true);
        player = new Player(20, 20,  "V6 Engine", 0,  false);
    }

    public void setUpGUI()  {
        frame.setTitle("Final Project Camacho 245288 - Pardo 246268");
        frame.setLayout(new BorderLayout());
        frame.add(gamecanvas, BorderLayout.CENTER);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void addKeyBindings(){
        ActionMap am = cp.getActionMap();
        InputMap im = cp.getInputMap();

        AbstractAction speedUp = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae){
               player.checkEngine();
               System.out.println(player.getSpeed());
            }
        };

        AbstractAction speedDown = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae){
                player.addBreakPressure();
                System.out.println(player.getSpeed());
            }       
        };

        AbstractAction gearUp = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae){
                player.shiftUp();
                System.out.println(player.getGear());
            }
        };

        AbstractAction gearDown = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae){
                player.shiftDown();
                System.out.println(player.getGear());
            }
            
        };

            am.put("sUp", speedUp);
            am.put("sDown",speedDown );
            am.put("gUp", gearUp);
            am.put("gDown",gearDown );
            im.put(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE,0,false), "sUp");
            im.put(KeyStroke.getKeyStroke(KeyEvent.VK_S,0,false), "sDown");
            im.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q,0,false), "gUp");
            im.put(KeyStroke.getKeyStroke(KeyEvent.VK_E,0,false), "gDown");
            
    }
}
