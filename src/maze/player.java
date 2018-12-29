/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author keanYl
 */
public class player {

    private int tilex, tiley;

    private Image player;

    private int sleutelwaarde;



    public player() {
        ImageIcon img = new ImageIcon("C:\\map\\playe.png");
        player = img.getImage();
        sleutelwaarde = 0;
        tilex = 1;
        tiley = 1;

    }

  

    public int getsleutelwaarde() {
        return sleutelwaarde;
    }

    

    public void setsleutelwaarde(int sleutelwaarde) {
        this.sleutelwaarde = sleutelwaarde;
    }

    public Image getplayer() {
        return player;
    }

    public int gettilex() {
        return tilex;
    }

    public int gettiley() {
        return tiley;
    }

    public void move(int dx, int dy) {

        tilex += dx;
        tiley += dy;

    }
}
