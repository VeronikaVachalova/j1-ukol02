package cz.czechitas.turtle;
import cz.czechitas.turtle.engine.*;
import java.awt.*;
public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;
        zofka = new Turtle();
        zofka.setLocation(100, 100);
        Color cervenaBarva;
        cervenaBarva = new Color(255, 0, 0);
        Color zelenaBarva;
        zelenaBarva = new Color(0, 100, 0);
        Color zlutaBarva;
        zlutaBarva = new Color(200, 100, 0);

        //zmrzlina
        nakresliKruhVpravo(zofka,14.0, 20);
        zofka.turnRight(90);
        nakresliRovnostrannyTrojuhelnik(zofka, 90, zlutaBarva);

        //snehulak
        zofka.setLocation(300, 100);
        nakresliKruhVlevo(zofka, 10.0, 20);
        nakresliKruhVpravo(zofka,15.0, 20);
        zofka.penUp();
        for (int i = 0; i < 80; i++) {
            zofka.turnRight(1);
            zofka.move(1);
        }
        zofka.penDown();
        nakresliKruhVlevo (zofka,5.0, 24);
        zofka.penUp();
        for (int i = 0; i < 50; i++) {
            zofka.turnRight(2);
            zofka.move(1.5);
        }
        zofka.penDown();
        nakresliKruhVlevo(zofka, 18, 24);

        zofka.penUp();
        for (int i = 0; i < 50; i++) {
            zofka.turnRight(1.5);
            zofka.move(1.5);
        }
        zofka.penDown();
        nakresliKruhVlevo(zofka, 5.0, 24);

        // masinka
        zofka.setLocation(700, 300);
        zofka.penUp();
        for (int i = 0; i < 10; i++) {
            zofka.turnRight(1.5);
            zofka.move(1.5);
        }
        zofka.penDown();
        nakresliKruhVpravo(zofka, 10, 24);
        nakresliobdelnik(zofka, 110,75.0, cervenaBarva);
        zofka.turnLeft(90);
        nakresliobdelnik(zofka, 110,75.0,zelenaBarva);
        zofka.penUp();
        zofka.move(30);
        zofka.penDown();
        nakresliKruhVlevo(zofka,4.0,24);
        zofka.penUp();
        zofka.move(50);
        zofka.penDown();
        nakresliKruhVlevo(zofka,4.0,24);
        zofka.penUp();
        zofka.move(30);
        zofka.penDown();
        nakresliRovnostrannyTrojuhelnik(zofka, 35, cervenaBarva);
    }
    private void nakresliCtverec(Turtle zofka, double delkaStrany, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 4; i++) {
        zofka.move(delkaStrany);
        zofka.turnRight(90);
    }
    }
    private void nakresliRovnostrannyTrojuhelnik(Turtle zofka, double delkaStrany, Color barvaCary){
        zofka.setPenColor(barvaCary);
        zofka.move(delkaStrany);
        zofka.turnRight(120.0);
        zofka.move(delkaStrany);
        zofka.turnRight(120.0);
        zofka.move(delkaStrany);
        zofka.turnRight(120.0);
    }
    private void nakresliobdelnik(Turtle zofka, double delkaStranyA, double delkaStranyB, Color barvaCary){
        zofka.setPenColor(barvaCary);
        zofka.move(delkaStranyA);
        zofka.turnRight(90);
        zofka.move(delkaStranyB);
        zofka.turnRight(90);
        zofka.move(delkaStranyA);
        zofka.turnRight(90);
        zofka.move(delkaStranyB);
        zofka.turnRight(90);
    }
    private void nakresliKruhVpravo(Turtle zofka, double delkaStrany, int pocetStran) {
        double uhel = 360.0 / pocetStran;
        for (int i = 0; i < pocetStran; i++) {
        zofka.move(delkaStrany);
        zofka.turnRight(uhel);
    }
    }
     private void nakresliKruhVlevo(Turtle zofka, double delkaStrany, int pocetStran) {
         double uhel = 360.0 / pocetStran;
         for (int i = 0; i < pocetStran; i++) {
         zofka.move(delkaStrany);
         zofka.turnLeft(uhel);
     }
     }

}

