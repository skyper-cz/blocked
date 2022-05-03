import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main {


    public static int cislo = 0;
    public static boolean pressable1 = true;
    public static boolean pressable2 = false;
    public static boolean pressable3 = false;
    public static boolean pressable4 = false;
    public static boolean pressable5 = false;
    public static boolean pressable6 = false;
    public static boolean pressable7 = false;
    public static boolean pressable8 = false;
    public static boolean pressable9 = false;
    public static JFrame okno = new JFrame("Blocked");

    public static JButton jedna = new JButton("");
    public static JButton dva = new JButton("");
    public static JButton tri = new JButton("");
    public static JButton ctyri = new JButton("");
    public static JButton pet = new JButton("");
    public static JButton sest = new JButton("");
    public static JButton sedm = new JButton("");
    public static JButton osm = new JButton("");
    public static JButton devet = new JButton("");

    public static void main(String[] args) {
        okno.setVisible(true);
        okno.setBounds(660,350,170,190);
        okno.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        okno.setResizable(false);

        jedna.setBounds(10, 10, 50, 50);
        jedna.addActionListener(Main::Jedna);

        dva.setBounds(60, 10, 50, 50);
        dva.addActionListener(Main::Dva);

        tri.setBounds(110, 10, 50, 50);
        tri.addActionListener(Main::Tri);

        ctyri.setBounds(10, 60, 50, 50);
        ctyri.addActionListener(Main::Ctyri);

        pet.setBounds(60, 60, 50, 50);
        pet.addActionListener(Main::Pet);

        sest.setBounds(110, 60, 50, 50);
        sest.addActionListener(Main::Sest);

        sedm.setBounds(10, 110, 50, 50);
        sedm.addActionListener(Main::Sedm);

        osm.setBounds(60, 110, 50, 50);
        osm.addActionListener(Main::Osm);

        devet.setBounds(110, 110, 50, 50);
        devet.addActionListener(Main::Devet);

        jedna.setVisible(true);
        dva.setVisible(true);
        tri.setVisible(true);
        ctyri.setVisible(true);
        pet.setVisible(true);
        sest.setVisible(true);
        sedm.setVisible(true);
        osm.setVisible(true);
        devet.setVisible(true);

        okno.add(jedna);
        okno.add(dva);
        okno.add(tri);
        okno.add(ctyri);
        okno.add(pet);
        okno.add(sest);
        okno.add(sedm);
        okno.add(osm);
        okno.add(devet);

        PoSpusteni();
    }

    public static void PoSpusteni(){
        jedna.setBackground(Color.RED);
        jedna.setOpaque(true);
        cislo++;
    }
    public static void Jedna(ActionEvent e){
        if (pressable1){
           if (cislo == 0){

               pressable2 = false;
               pressable3 = false;
               pressable4 = false;
               pressable5 = false;
               pressable6 = false;
               pressable7 = false;
               pressable8 = false;
               pressable9 = false;

               cislo++;

               jedna.setBackground(Color.RED);
               jedna.setOpaque(true);
               dva.setBackground(null);
               dva.setOpaque(true);
               tri.setBackground(null);
               tri.setOpaque(true);
               ctyri.setBackground(null);
               ctyri.setOpaque(true);
               pet.setBackground(null);
               pet.setOpaque(true);
               sest.setBackground(null);
               sest.setOpaque(true);
               sedm.setBackground(null);
               sedm.setOpaque(true);
               osm.setBackground(null);
               osm.setOpaque(true);
               devet.setBackground(null);
               devet.setOpaque(true);
           }
           else {
               pressable1 = false;
               pressable2 = true;
               pressable3 = true;
               pressable4 = true;
               pressable5 = true;
               pressable6 = true;
               pressable7 = true;
               pressable8 = true;
               pressable9 = true;

               jedna.setBackground(null);
               jedna.setOpaque(true);
               dva.setBackground(Color.GREEN);
               dva.setOpaque(true);
               tri.setBackground(Color.GREEN);
               tri.setOpaque(true);
               ctyri.setBackground(Color.GREEN);
               ctyri.setOpaque(true);
               pet.setBackground(Color.GREEN);
               pet.setOpaque(true);
               sest.setBackground(Color.GREEN);
               sest.setOpaque(true);
               sedm.setBackground(Color.GREEN);
               sedm.setOpaque(true);
               osm.setBackground(Color.GREEN);
               osm.setOpaque(true);
               devet.setBackground(Color.GREEN);
               devet.setOpaque(true);
               cislo = 0;
           }
            
        }

    }
    public static void Dva(ActionEvent e){
        if (pressable2){
            if (cislo == 0){

                pressable1 = false;
                pressable3 = false;
                pressable4 = false;
                pressable5 = false;
                pressable6 = false;
                pressable7 = false;
                pressable8 = false;
                pressable9 = false;

                cislo++;

                jedna.setBackground(null);
                jedna.setOpaque(true);
                dva.setBackground(Color.RED);
                dva.setOpaque(true);
                tri.setBackground(null);
                tri.setOpaque(true);
                ctyri.setBackground(null);
                ctyri.setOpaque(true);
                pet.setBackground(null);
                pet.setOpaque(true);
                sest.setBackground(null);
                sest.setOpaque(true);
                sedm.setBackground(null);
                sedm.setOpaque(true);
                osm.setBackground(null);
                osm.setOpaque(true);
                devet.setBackground(null);
                devet.setOpaque(true);
            }
            else {
                pressable1 = true;
                pressable2 = false;
                pressable3 = true;
                pressable4 = true;
                pressable5 = true;
                pressable6 = true;
                pressable7 = true;
                pressable8 = true;
                pressable9 = true;

                jedna.setBackground(Color.GREEN);
                jedna.setOpaque(true);
                dva.setBackground(null);
                dva.setOpaque(true);
                tri.setBackground(Color.GREEN);
                tri.setOpaque(true);
                ctyri.setBackground(Color.GREEN);
                ctyri.setOpaque(true);
                pet.setBackground(Color.GREEN);
                pet.setOpaque(true);
                sest.setBackground(Color.GREEN);
                sest.setOpaque(true);
                sedm.setBackground(Color.GREEN);
                sedm.setOpaque(true);
                osm.setBackground(Color.GREEN);
                osm.setOpaque(true);
                devet.setBackground(Color.GREEN);
                devet.setOpaque(true);

                cislo = 0;
            }

        }
    }
    public static void Tri(ActionEvent e){
        if (pressable3){
            if (cislo == 0){

                pressable1 = false;
                pressable2 = false;
                pressable4 = false;
                pressable5 = false;
                pressable6 = false;
                pressable7 = false;
                pressable8 = false;
                pressable9 = false;

                cislo++;

                jedna.setBackground(null);
                jedna.setOpaque(true);
                dva.setBackground(null);
                dva.setOpaque(true);
                tri.setBackground(Color.RED);
                tri.setOpaque(true);
                ctyri.setBackground(null);
                ctyri.setOpaque(true);
                pet.setBackground(null);
                pet.setOpaque(true);
                sest.setBackground(null);
                sest.setOpaque(true);
                sedm.setBackground(null);
                sedm.setOpaque(true);
                osm.setBackground(null);
                osm.setOpaque(true);
                devet.setBackground(null);
                devet.setOpaque(true);
            }
            else {
                pressable1 = true;
                pressable2 = true;
                pressable3 = false;
                pressable4 = true;
                pressable5 = true;
                pressable6 = true;
                pressable7 = true;
                pressable8 = true;
                pressable9 = true;

                jedna.setBackground(Color.GREEN);
                jedna.setOpaque(true);
                dva.setBackground(Color.GREEN);
                dva.setOpaque(true);
                tri.setBackground(null);
                tri.setOpaque(true);
                ctyri.setBackground(Color.GREEN);
                ctyri.setOpaque(true);
                pet.setBackground(Color.GREEN);
                pet.setOpaque(true);
                sest.setBackground(Color.GREEN);
                sest.setOpaque(true);
                sedm.setBackground(Color.GREEN);
                sedm.setOpaque(true);
                osm.setBackground(Color.GREEN);
                osm.setOpaque(true);
                devet.setBackground(Color.GREEN);
                devet.setOpaque(true);

                cislo = 0;
            }

        }
    }
    public static void Ctyri(ActionEvent e){
        if (pressable4){
            if (cislo == 0){

                pressable1 = false;
                pressable2 = false;
                pressable3 = false;
                pressable5 = false;
                pressable6 = false;
                pressable7 = false;
                pressable8 = false;
                pressable9 = false;

                cislo++;

                jedna.setBackground(null);
                jedna.setOpaque(true);
                dva.setBackground(null);
                dva.setOpaque(true);
                tri.setBackground(null);
                tri.setOpaque(true);
                ctyri.setBackground(Color.RED);
                ctyri.setOpaque(true);
                pet.setBackground(null);
                pet.setOpaque(true);
                sest.setBackground(null);
                sest.setOpaque(true);
                sedm.setBackground(null);
                sedm.setOpaque(true);
                osm.setBackground(null);
                osm.setOpaque(true);
                devet.setBackground(null);
                devet.setOpaque(true);
            }
            else {
                pressable1 = true;
                pressable2 = true;
                pressable3 = true;
                pressable4 = false;
                pressable5 = true;
                pressable6 = true;
                pressable7 = true;
                pressable8 = true;
                pressable9 = true;

                jedna.setBackground(Color.GREEN);
                jedna.setOpaque(true);
                dva.setBackground(Color.GREEN);
                dva.setOpaque(true);
                tri.setBackground(Color.GREEN);
                tri.setOpaque(true);
                ctyri.setBackground(null);
                ctyri.setOpaque(true);
                pet.setBackground(Color.GREEN);
                pet.setOpaque(true);
                sest.setBackground(Color.GREEN);
                sest.setOpaque(true);
                sedm.setBackground(Color.GREEN);
                sedm.setOpaque(true);
                osm.setBackground(Color.GREEN);
                osm.setOpaque(true);
                devet.setBackground(Color.GREEN);
                devet.setOpaque(true);

                cislo = 0;
            }

        }
    }
    public static void Pet(ActionEvent e){
        if (pressable5){
            if (cislo == 0){

                pressable1 = false;
                pressable2 = false;
                pressable3 = false;
                pressable4 = false;
                pressable6 = false;
                pressable7 = false;
                pressable8 = false;
                pressable9 = false;

                cislo++;

                jedna.setBackground(null);
                jedna.setOpaque(true);
                dva.setBackground(null);
                dva.setOpaque(true);
                tri.setBackground(null);
                tri.setOpaque(true);
                ctyri.setBackground(null);
                ctyri.setOpaque(true);
                pet.setBackground(Color.RED);
                pet.setOpaque(true);
                sest.setBackground(null);
                sest.setOpaque(true);
                sedm.setBackground(null);
                sedm.setOpaque(true);
                osm.setBackground(null);
                osm.setOpaque(true);
                devet.setBackground(null);
                devet.setOpaque(true);
            }
            else {
                pressable1 = true;
                pressable2 = true;
                pressable3 = true;
                pressable4 = true;
                pressable5 = false;
                pressable6 = true;
                pressable7 = true;
                pressable8 = true;
                pressable9 = true;

                jedna.setBackground(Color.GREEN);
                jedna.setOpaque(true);
                dva.setBackground(Color.GREEN);
                dva.setOpaque(true);
                tri.setBackground(Color.GREEN);
                tri.setOpaque(true);
                ctyri.setBackground(Color.GREEN);
                ctyri.setOpaque(true);
                pet.setBackground(null);
                pet.setOpaque(true);
                sest.setBackground(Color.GREEN);
                sest.setOpaque(true);
                sedm.setBackground(Color.GREEN);
                sedm.setOpaque(true);
                osm.setBackground(Color.GREEN);
                osm.setOpaque(true);
                devet.setBackground(Color.GREEN);
                devet.setOpaque(true);

                cislo = 0;
            }

        }
    }
    public static void Sest(ActionEvent e){
        if (pressable6){
            if (cislo == 0){

                pressable1 = false;
                pressable2 = false;
                pressable3 = false;
                pressable4 = false;
                pressable5 = false;
                pressable7 = false;
                pressable8 = false;
                pressable9 = false;

                cislo++;

                jedna.setBackground(null);
                jedna.setOpaque(true);
                dva.setBackground(null);
                dva.setOpaque(true);
                tri.setBackground(null);
                tri.setOpaque(true);
                ctyri.setBackground(null);
                ctyri.setOpaque(true);
                pet.setBackground(null);
                pet.setOpaque(true);
                sest.setBackground(Color.RED);
                sest.setOpaque(true);
                sedm.setBackground(null);
                sedm.setOpaque(true);
                osm.setBackground(null);
                osm.setOpaque(true);
                devet.setBackground(null);
                devet.setOpaque(true);
            }
            else {
                pressable1 = true;
                pressable2 = true;
                pressable3 = true;
                pressable4 = true;
                pressable5 = true;
                pressable6 = false;
                pressable7 = true;
                pressable8 = true;
                pressable9 = true;

                jedna.setBackground(Color.GREEN);
                jedna.setOpaque(true);
                dva.setBackground(Color.GREEN);
                dva.setOpaque(true);
                tri.setBackground(Color.GREEN);
                tri.setOpaque(true);
                ctyri.setBackground(Color.GREEN);
                ctyri.setOpaque(true);
                pet.setBackground(Color.GREEN);
                pet.setOpaque(true);
                sest.setBackground(null);
                sest.setOpaque(true);
                sedm.setBackground(Color.GREEN);
                sedm.setOpaque(true);
                osm.setBackground(Color.GREEN);
                osm.setOpaque(true);
                devet.setBackground(Color.GREEN);
                devet.setOpaque(true);

                cislo = 0;
            }

        }
    }
    public static void Sedm(ActionEvent e){
        if (pressable7){
            if (cislo == 0){

                pressable1 = false;
                pressable2 = false;
                pressable3 = false;
                pressable4 = false;
                pressable5 = false;
                pressable6 = false;
                pressable8 = false;
                pressable9 = false;

                cislo++;

                jedna.setBackground(null);
                jedna.setOpaque(true);
                dva.setBackground(null);
                dva.setOpaque(true);
                tri.setBackground(null);
                tri.setOpaque(true);
                ctyri.setBackground(null);
                ctyri.setOpaque(true);
                pet.setBackground(null);
                pet.setOpaque(true);
                sest.setBackground(null);
                sest.setOpaque(true);
                sedm.setBackground(Color.RED);
                sedm.setOpaque(true);
                osm.setBackground(null);
                osm.setOpaque(true);
                devet.setBackground(null);
                devet.setOpaque(true);
            }
            else {
                pressable1 = true;
                pressable2 = true;
                pressable3 = true;
                pressable4 = true;
                pressable5 = true;
                pressable6 = true;
                pressable7 = false;
                pressable8 = true;
                pressable9 = true;

                jedna.setBackground(Color.GREEN);
                jedna.setOpaque(true);
                dva.setBackground(Color.GREEN);
                dva.setOpaque(true);
                tri.setBackground(Color.GREEN);
                tri.setOpaque(true);
                ctyri.setBackground(Color.GREEN);
                ctyri.setOpaque(true);
                pet.setBackground(Color.GREEN);
                pet.setOpaque(true);
                sest.setBackground(Color.GREEN);
                sest.setOpaque(true);
                sedm.setBackground(null);
                sedm.setOpaque(true);
                osm.setBackground(Color.GREEN);
                osm.setOpaque(true);
                devet.setBackground(Color.GREEN);
                devet.setOpaque(true);

                cislo = 0;
            }

        }
    }
    public static void Osm(ActionEvent e){
        if (pressable8){
            if (cislo == 0){

                pressable1 = false;
                pressable2 = false;
                pressable3 = false;
                pressable4 = false;
                pressable5 = false;
                pressable6 = false;
                pressable7 = false;
                pressable9 = false;

                cislo++;

                jedna.setBackground(null);
                jedna.setOpaque(true);
                dva.setBackground(null);
                dva.setOpaque(true);
                tri.setBackground(null);
                tri.setOpaque(true);
                ctyri.setBackground(null);
                ctyri.setOpaque(true);
                pet.setBackground(null);
                pet.setOpaque(true);
                sest.setBackground(null);
                sest.setOpaque(true);
                sedm.setBackground(null);
                sedm.setOpaque(true);
                osm.setBackground(Color.RED);
                osm.setOpaque(true);
                devet.setBackground(null);
                devet.setOpaque(true);

            }
            else {
                pressable1 = true;
                pressable2 = true;
                pressable3 = true;
                pressable4 = true;
                pressable5 = true;
                pressable6 = true;
                pressable7 = true;
                pressable8 = false;
                pressable9 = true;

                jedna.setBackground(Color.GREEN);
                jedna.setOpaque(true);
                dva.setBackground(Color.GREEN);
                dva.setOpaque(true);
                tri.setBackground(Color.GREEN);
                tri.setOpaque(true);
                ctyri.setBackground(Color.GREEN);
                ctyri.setOpaque(true);
                pet.setBackground(Color.GREEN);
                pet.setOpaque(true);
                sest.setBackground(Color.GREEN);
                sest.setOpaque(true);
                sedm.setBackground(Color.GREEN);
                sedm.setOpaque(true);
                osm.setBackground(null);
                osm.setOpaque(true);
                devet.setBackground(Color.GREEN);
                devet.setOpaque(true);

                cislo = 0;
            }

        }
    }
    public static void Devet(ActionEvent e){
        if (pressable9){
            if (cislo == 0){

                pressable1 = false;
                pressable2 = false;
                pressable3 = false;
                pressable4 = false;
                pressable5 = false;
                pressable6 = false;
                pressable7 = false;
                pressable8 = false;

                cislo++;

                jedna.setBackground(null);
                jedna.setOpaque(true);
                dva.setBackground(null);
                dva.setOpaque(true);
                tri.setBackground(null);
                tri.setOpaque(true);
                ctyri.setBackground(null);
                ctyri.setOpaque(true);
                pet.setBackground(null);
                pet.setOpaque(true);
                sest.setBackground(null);
                sest.setOpaque(true);
                sedm.setBackground(null);
                sedm.setOpaque(true);
                osm.setBackground(null);
                osm.setOpaque(true);
                devet.setBackground(Color.RED);
                devet.setOpaque(true);
            }
            else {
                pressable1 = true;
                pressable2 = true;
                pressable3 = true;
                pressable4 = true;
                pressable5 = true;
                pressable6 = true;
                pressable7 = true;
                pressable8 = true;
                pressable9 = false;

                jedna.setBackground(Color.GREEN);
                jedna.setOpaque(true);
                dva.setBackground(Color.GREEN);
                dva.setOpaque(true);
                tri.setBackground(Color.GREEN);
                tri.setOpaque(true);
                ctyri.setBackground(Color.GREEN);
                ctyri.setOpaque(true);
                pet.setBackground(Color.GREEN);
                pet.setOpaque(true);
                sest.setBackground(Color.GREEN);
                sest.setOpaque(true);
                sedm.setBackground(Color.GREEN);
                sedm.setOpaque(true);
                osm.setBackground(Color.GREEN);
                osm.setOpaque(true);
                devet.setBackground(null);
                devet.setOpaque(true);

                cislo = 0;
            }

        }
    }
}