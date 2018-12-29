/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze;

import java.awt.Image;
import java.io.File;
import java.util.Scanner;
import javax.swing.ImageIcon;

/**
 *
 * @author keanYl
 */
public class map {

    private Scanner m;
    private String map[] = new String[12];
    private Image grass, wall, finish;
    private sleutelbaricade sb;
    private player p;

    private sleutelveld sv;
    private boolean removebaricade = false;
    private boolean removebaricade1 = false;
    private boolean removebaricade2 = false;
    private boolean removebaricade3 = false;

    public map() {
        ImageIcon img = new ImageIcon("C:\\map\\gras.png");
        grass = img.getImage();
        img = new ImageIcon("C:\\map\\wall.png");
        wall = img.getImage();
        img = new ImageIcon("C:\\map\\finish.png");
        finish = img.getImage();
        sb = new sleutelbaricade();
        p = new player();
        sv = new sleutelveld();

        openFile();
        readFile();
        closeFile();

    }

    public void setremovebaricade() {
        this.removebaricade = true;
    }

    public void setremovebaricade1() {
        this.removebaricade1 = true;
    }

    public void setremovebaricade2() {
        this.removebaricade2 = true;
    }

    public void setremovebaricade3() {
        this.removebaricade3 = true;
    }

    public boolean getremovebaricade() {
        return removebaricade;
    }

    public boolean getremovebaricade1() {
        return removebaricade1;
    }

    public boolean getremovebaricade2() {
        return removebaricade2;
    }

    public boolean getremovebaricade3() {
        return removebaricade3;
    }

    public Image getgrass() {
        return grass;
    }

    public Image getwall() {

        return wall;
    }

    public Image getfinish() {
        return finish;

    }

    public String getMap(int x, int y) {
        String index = "";
        if (!removebaricade) {

            if (y == sb.gettiley()) {
                char[] myChars = map[sb.gettiley()].toCharArray();

                myChars[sb.gettilex()] = 's';
                index = String.valueOf(myChars);

                index = index.substring(x, x + 1);
                return index;

            }
        } 
        if (!removebaricade3) {
            if (y == sb.gettiley3()) {
                char[] myChars = map[sb.gettiley3()].toCharArray();

                myChars[sb.gettilex3()] = 'v';
                index = String.valueOf(myChars);

                index = index.substring(x, x + 1);
                return index;
            }
        } 
        if (!removebaricade2) {

            if (y == sb.gettiley2()) {
                char[] myChars = map[sb.gettiley2()].toCharArray();

                myChars[sb.gettilex2()] = 'v';
                index = String.valueOf(myChars);

                index = index.substring(x, x + 1);
                return index;
            }
        } 
        if (!removebaricade1) {
            if (y == sb.gettiley1()) {
                char[] myChars = map[sb.gettiley1()].toCharArray();

                myChars[sb.gettilex1()] = 's';
                index = String.valueOf(myChars);

                index = index.substring(x, x + 1);
                return index;
            }
        } 
        index = map[y].substring(x, x + 1);
        return index;
    }

    public void openFile() {
        try {
            m = new Scanner(new File("C:\\map\\map.txt"));
        } catch (Exception e) {
            System.out.println("error loading map");
        }
    }

    public void readFile() {
        while (m.hasNext()) {
            // leest het per regel
            for (int i = 0; i < 12; i++) {
                map[i] = m.next();

            }
        }
    }

    public void closeFile() {
        m.close();
    }

}
