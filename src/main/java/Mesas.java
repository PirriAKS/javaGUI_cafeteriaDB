import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * @author Alejandro Alba
 */
public class Mesas extends JFrame {
    protected JPanel container;
    protected JButton mesa1Button;
    protected JButton mesa2Button;
    protected JButton mesa3Button;
    protected JButton mesa4Button;
    protected JButton mesa5Button;
    protected JButton mesa6Button;
    protected JButton mesa7Button;
    protected JButton mesa8Button;
    protected JButton mesa9Button;
    protected JButton mesa10Button;
    private JButton cancelarTicketButton;
    protected static Mesas m;
    protected static App a;
    protected static Login log;
    protected static int num_mesa;
    protected static ArrayList lista_mesas=new ArrayList<Mesa>();

    public Mesas() {
        mesa1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa=1;
                accederTicket(num_mesa);
                mesa1Button.setBackground(Color.YELLOW);
            }
        });
        mesa2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 2;
                accederTicket(num_mesa);
                mesa2Button.setBackground(Color.YELLOW);
            }
        });
        mesa3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 3;
                accederTicket(num_mesa);
                mesa3Button.setBackground(Color.YELLOW);
            }
        });
        mesa4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 4;
                accederTicket(num_mesa);
                mesa4Button.setBackground(Color.YELLOW);
            }
        });
        mesa5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 5;
                accederTicket(num_mesa);
                mesa5Button.setBackground(Color.YELLOW);
            }
        });
        mesa6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 6;
                accederTicket(num_mesa);
                mesa6Button.setBackground(Color.YELLOW);
            }
        });
        mesa7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 7;
                accederTicket(num_mesa);
                mesa7Button.setBackground(Color.YELLOW);
            }
        });
        mesa8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 8;
                accederTicket(num_mesa);
                mesa8Button.setBackground(Color.YELLOW);
            }
        });
        mesa9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 9;
                accederTicket(num_mesa);
                mesa9Button.setBackground(Color.YELLOW);
            }
        });
        mesa10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 10;
                accederTicket(num_mesa);
                mesa10Button.setBackground(Color.YELLOW);
            }
        });

        cancelarTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancelarTicket(num_mesa);
                num_mesa = 0;
            }
        });
    }
    protected static void init() {
        m = new Mesas();
        m.setContentPane(m.container);
        m.setVisible(true);
        m.pack();
    }
    protected static void accederTicket(int num_mesa){
        if(lista_mesas.size()==0){
            crearTicket(num_mesa);
        }else{
            boolean flag=false;
            for (int i = 0; i < lista_mesas.size(); i++) {
                Mesa mesa= (Mesa) lista_mesas.get(i);
                if(mesa.getNumero()==num_mesa){
                    flag=true;
                    a.init(mesa,true);
                    i= lista_mesas.size();
                }else{
                    flag=false;
                }
            }
            if(!flag){
                crearTicket(num_mesa);
            }
        }
    }
    protected static void crearTicket(int num_mesa){
        Mesa mesa=new Mesa(num_mesa,0.0f,false,log.u.getNombre(),null);
        lista_mesas.add(mesa);
        a.init(mesa,false);
    }
    protected static void cancelarTicket(int num_mesa){
        for (int i = 0; i < lista_mesas.size(); i++) {
            Mesa mesa= (Mesa) lista_mesas.get(i);
            if(mesa.getNumero()==num_mesa){
                lista_mesas.remove(mesa);
            }
        }
    }
}
