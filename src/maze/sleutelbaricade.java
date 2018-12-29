package maze;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author keanYl
 */
public class sleutelbaricade {

    private int tilex, tiley, tilex1, tiley1, tilex2, tiley2,tilex3, tiley3;

    private Image sleutelbaricade, sleutelbaricade1;

    private int sleutelgat, sleutelgat1;

    public sleutelbaricade() {
        ImageIcon img = new ImageIcon("C:\\map\\sleutelbaricade.png");
        sleutelbaricade = img.getImage();
        img = new ImageIcon("C:\\map\\sleutelbaricade1.png");
        sleutelbaricade1 = img.getImage();
        sleutelgat = 100;
        sleutelgat1 = 300;
        tilex = 3;
        tiley = 5;

        tilex1 = 6;
        tiley1 = 8;

        
        tilex2 = 6;
        tiley2 = 7; 
        
        tilex3 = 8;
        tiley3 = 3;


    }

    public Image getsleutelbaricade() {
        return sleutelbaricade;
    }

    public Image getsleutelbaricade1() {
        return sleutelbaricade1;
    }

    public int getsleutelgat() {
        return sleutelgat;
    }

    public void settilex(int tilex) {
        this.tilex = tilex;
    }

    public void settiley(int tiley) {
        this.tiley = tiley;
    }

    public void settilex1(int tilex1) {
        this.tilex1 = tilex1;
    }

    public void settiley1(int tiley1) {
        this.tiley1 = tiley1;
    }

    public void settilex2(int tilex2) {
        this.tilex2 = tilex2;
    }

    public void settiley2(int tiley2) {
        this.tiley2 = tiley2;
    }

    public void settilex3(int tilex3) {
        this.tilex3 = tilex3;
    }

    public void settiley3(int tiley3) {
        this.tiley3 = tiley3;
    }

    public int getsleutelgat1() {
        return sleutelgat1;
    }

    public int gettilex() {
        return tilex;
    }

    public int gettiley() {
        return tiley;
    }

    public int gettilex1() {
        return tilex1;
    }

    public int gettiley1() {
        return tiley1;
    }

    public int gettilex2() {
        return tilex2;
    }

    public int gettiley2() {
        return tiley2;
    }
    public int gettilex3() {
        return tilex3;
    }

    public int gettiley3() {
        return tiley3;
    }

}
