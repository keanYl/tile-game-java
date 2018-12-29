/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Timer;

/**
 *
 * @author keanYl
 */
public class Board extends JPanel implements ActionListener {

    private Timer timer;

    private map m;

    private boolean win = false;
    private boolean removesleutel = false;
    private boolean removesleutel1 = false;
     private boolean removesleutel2 = false;
   
    private player p;

    private sleutelveld sv;

    private sleutelbaricade sb;

    private String message = " ";

    private Font font = new Font("Serif ", Font.BOLD, 48);

    public Board() {
        m = new map();
        p = new player();
        sv = new sleutelveld();
        sb = new sleutelbaricade();
        addKeyListener(new Al());
        setFocusable(true);
        timer = new Timer(25, this);
        timer.start();

    }

    public void actionPerformed(ActionEvent e) {
        if (m.getMap(p.gettilex(), p.gettiley()).equals("f")) {
            message = "winner";
            win = true;
        }

        if (p.gettilex() == sv.gettilex() && p.gettiley() == sv.gettiley()) {
            p.setsleutelwaarde(sv.getsleutelwaarde());
            removesleutel = true;
        }
        if (p.gettilex() == sv.gettilex1() && p.gettiley() == sv.gettiley1()) {
            p.setsleutelwaarde(sv.getsleutelwaarde1());
            removesleutel1 = true;
        }
         if (p.gettilex() == sv.gettilex2() && p.gettiley() == sv.gettiley2()) {
            p.setsleutelwaarde(sv.getsleutelwaarde());
            removesleutel2 = true;
        }

        if (p.gettilex() == sb.gettilex() && p.gettiley() == sb.gettiley()) {

            m.setremovebaricade();
        }
        if (p.gettilex() == sb.gettilex1() && p.gettiley() == sb.gettiley1()) {
            m.setremovebaricade1();
        }
        if (p.gettilex() == sb.gettilex2() && p.gettiley() == sb.gettiley2()) {

            m.setremovebaricade2();
        }
        if (p.gettilex() == sb.gettilex3() && p.gettiley() == sb.gettiley3()) {

            m.setremovebaricade3();
        }

        repaint();

    }

    public void paint(Graphics g) {
        super.paint(g);
        if (!win) {
            for (int y = 0; y < 12; y++) {
                for (int x = 0; x < 12; x++) {

                    if (m.getMap(x, y).equals("f")) {
                        g.drawImage(m.getfinish(), x * 32, y * 32, this);
                    }
                    if (m.getMap(x, y).equals("g")) {
                        g.drawImage(m.getgrass(), x * 32, y * 32, this);
                    }
                    if (m.getMap(x, y).equals("w")) {
                        g.drawImage(m.getwall(), x * 32, y * 32, this);
                    }

                }
            }

            if (!removesleutel) {
                g.drawImage(sv.getsleutelveld(), sv.gettilex() * 32, sv.gettiley() * 32, this);

            } else {
                sv.settilex(0);
                sv.settiley(0);
                g.drawImage(m.getwall(), sv.gettilex() * 32, sv.gettiley() * 32, this);
            }
            if (!removesleutel1) {
                g.drawImage(sv.getsleutelveld1(), sv.gettilex1() * 32, sv.gettiley1() * 32, this);

            } else {
                sv.settilex1(0);
                sv.settiley1(1);
                g.drawImage(m.getwall(), sv.gettilex1() * 32, sv.gettiley1() * 32, this);
            }
             if (!removesleutel2) {
                g.drawImage(sv.getsleutelveld(), sv.gettilex2() * 32, sv.gettiley2() * 32, this);

            } else {
                sv.settilex1(0);
                sv.settiley1(1);
                g.drawImage(m.getwall(), sv.gettilex1() * 32, sv.gettiley1() * 32, this);
            }

            if (!m.getremovebaricade()) {
                g.drawImage(sb.getsleutelbaricade(), sb.gettilex() * 32, sb.gettiley() * 32, this);

            }
            if (!m.getremovebaricade1()) {

                g.drawImage(sb.getsleutelbaricade(), sb.gettilex1() * 32, sb.gettiley1() * 32, this);

            }
            if (!m.getremovebaricade2()) {

                g.drawImage(sb.getsleutelbaricade1(), sb.gettilex2() * 32, sb.gettiley2() * 32, this);

            }
            if (!m.getremovebaricade3()) {

                g.drawImage(sb.getsleutelbaricade1(), sb.gettilex3() * 32, sb.gettiley3() * 32, this);

            }
            g.drawImage(p.getplayer(), p.gettilex() * 32, p.gettiley() * 32, this);
        }
        if (win) {
            g.setColor(Color.GREEN);

            g.setFont(font);

            g.drawString(message, 150, 300);
        }

    }

    public class Al extends KeyAdapter {

        public void keyPressed(KeyEvent e) {
            int keycode = e.getKeyCode();

            if (keycode == KeyEvent.VK_W) {
                if (!m.getMap(p.gettilex(), p.gettiley() - 1).equals("w")) {
                    if (!m.getMap(p.gettilex(), p.gettiley() - 1).equals("s") || p.getsleutelwaarde() == sb.getsleutelgat()) {
                        if (!m.getMap(p.gettilex(), p.gettiley() - 1).equals("v") || p.getsleutelwaarde() == sb.getsleutelgat1()) {
                            p.move(0, -1);
                        }
                    }
                }
            }
            if (keycode == KeyEvent.VK_S) {
                if (!m.getMap(p.gettilex(), p.gettiley() + 1).equals("w")) {
                    if (!m.getMap(p.gettilex(), p.gettiley() + 1).equals("s") || p.getsleutelwaarde() == sb.getsleutelgat()) {
                        if (!m.getMap(p.gettilex(), p.gettiley() + 1).equals("v") || p.getsleutelwaarde() == sb.getsleutelgat1()) {
                            p.move(0, 1);
                        }
                    }
                }
            }
            if (keycode == KeyEvent.VK_A) {
                if (!m.getMap(p.gettilex() - 1, p.gettiley()).equals("w")) {
                    if (!m.getMap(p.gettilex() - 1, p.gettiley()).equals("s") || p.getsleutelwaarde() == sb.getsleutelgat()) {
                        if (!m.getMap(p.gettilex() - 1, p.gettiley()).equals("v") || p.getsleutelwaarde() == sb.getsleutelgat1()) {
                            p.move(-1, 0);
                        }
                    }
                }
            }
            if (keycode == KeyEvent.VK_D) {
                if (!m.getMap(p.gettilex() + 1, p.gettiley()).equals("w")) {
                    if (!m.getMap(p.gettilex() + 1, p.gettiley()).equals("s") || p.getsleutelwaarde() == sb.getsleutelgat()) {
                        if (!m.getMap(p.gettilex() + 1, p.gettiley()).equals("v") || p.getsleutelwaarde() == sb.getsleutelgat1()) {
                            p.move(1, 0);
                        }
                    }

                }
            }
        }

        public void keyreleased(KeyEvent e) {
        }

        public void keytyped(KeyEvent e) {

        }

    }
}
