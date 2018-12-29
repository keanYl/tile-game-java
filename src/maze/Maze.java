/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze;

import javax.swing.JFrame;

/**
 *
 * @author keanYl
 */
public class Maze {

    public Maze() {
        JFrame f = new JFrame();
        f.setTitle("maze game");
        f.add(new Board());
        f.setSize(464, 485);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Maze();

    }

}
