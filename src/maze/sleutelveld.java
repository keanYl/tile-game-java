package maze;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author keanYl
 */
public class sleutelveld {

    private int tilex, tiley,tilex1, tiley1,tilex2,tiley2;

    private Image sleutelveld,sleutelveld1;

    private int sleutel,sleutel1,sleutel2;

    public sleutelveld() {
        ImageIcon img = new ImageIcon("C:\\map\\sleutel.png");
        sleutelveld = img.getImage();
        img = new ImageIcon("C:\\map\\sleutel1.png");
        sleutelveld1 = img.getImage();
        sleutel = 100;
      
        sleutel1=300;
        tilex = 5;
        tiley = 2;
        tilex1 = 6;
        tiley1 = 2;
        tilex2=9;
        tiley2=3;


        

    }

    public int gettilex2() {
        return tilex2;
    }

    public void settilex2(int tilex2) {
        this.tilex2 = tilex2;
    }

    public int gettiley2() {
        return tiley2;
    }

    public void settiley2(int tiley2) {
        this.tiley2 = tiley2;
    }

    public Image getsleutelveld() {
        return sleutelveld;
    }
     public Image getsleutelveld1() {
        return sleutelveld1;
    }
    
    

    public int getsleutelwaarde() {
        return sleutel;
    }
     public int getsleutelwaarde1() {
        return sleutel1;
    }
    

    public void setsleutelwaarde(int sleutel) {
        this.sleutel = sleutel;
    }

    public int gettilex() {
        return tilex;
    }

    public int gettiley() {
        return tiley;
    }

    public void settilex(int tilex) {
        this.tilex = tilex;
    }

    public void settiley(int tiley) {
        this.tiley = tiley;
    }
     public int gettilex1() {
        return tilex1;
    }

    public int gettiley1() {
        return tiley1;
    }

    public void settilex1(int tilex1) {
        this.tilex1 = tilex1;
    }

    public void settiley1(int tiley1) {
        this.tiley1 = tiley1;
    }


}
