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
    protected static boolean reserva1=false;
    protected static boolean reserva2=false;
    protected static boolean reserva3=false;
    protected static boolean reserva4=false;
    protected static boolean reserva5=false;
    protected static boolean reserva6=false;
    protected static boolean reserva7=false;
    protected static boolean reserva8=false;
    protected static boolean reserva9=false;
    protected static boolean reserva10=false;

    public Mesas() {
        mesa1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa=1;
                accederTicket(num_mesa);
                mesa1Button.setBackground(Color.YELLOW);
                reserva1=true;
            }
        });
        mesa2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 2;
                accederTicket(num_mesa);
                mesa2Button.setBackground(Color.YELLOW);
                reserva2=true;
            }
        });
        mesa3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 3;
                accederTicket(num_mesa);
                mesa3Button.setBackground(Color.YELLOW);
                reserva3=true;
            }
        });
        mesa4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 4;
                accederTicket(num_mesa);
                mesa4Button.setBackground(Color.YELLOW);
                reserva4=true;
            }
        });
        mesa5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 5;
                accederTicket(num_mesa);
                mesa5Button.setBackground(Color.YELLOW);
                reserva5=true;
            }
        });
        mesa6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 6;
                accederTicket(num_mesa);
                mesa6Button.setBackground(Color.YELLOW);
                reserva6=true;
            }
        });
        mesa7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 7;
                accederTicket(num_mesa);
                mesa7Button.setBackground(Color.YELLOW);
                reserva7=true;
            }
        });
        mesa8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 8;
                accederTicket(num_mesa);
                mesa8Button.setBackground(Color.YELLOW);
                reserva8=true;
            }
        });
        mesa9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 9;
                accederTicket(num_mesa);
                mesa9Button.setBackground(Color.YELLOW);
                reserva9=true;
            }
        });
        mesa10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 10;
                accederTicket(num_mesa);
                mesa10Button.setBackground(Color.YELLOW);
                reserva10=true;
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
        if(reserva1==true){
            m.mesa1Button.setBackground(Color.YELLOW);
        }else if(reserva2==true){
            m.mesa2Button.setBackground(Color.YELLOW);
        }else if(reserva3==true){
            m.mesa3Button.setBackground(Color.YELLOW);
        }else if(reserva4==true){
            m.mesa4Button.setBackground(Color.YELLOW);
        }else if(reserva5==true){
            m.mesa5Button.setBackground(Color.YELLOW);
        }else if(reserva6==true){
            m.mesa6Button.setBackground(Color.YELLOW);
        }else if(reserva7==true){
            m.mesa7Button.setBackground(Color.YELLOW);
        }else if(reserva8==true){
            m.mesa8Button.setBackground(Color.YELLOW);
        }else if(reserva9==true){
            m.mesa9Button.setBackground(Color.YELLOW);
        }else if(reserva10==true){
            m.mesa10Button.setBackground(Color.YELLOW);
        }
        m.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
        switch (num_mesa){
            case 1:
                m.mesa1Button.setBackground(Color.GREEN);
                reserva1=false;
                break;
            case 2:
                m.mesa2Button.setBackground(Color.GREEN);
                reserva2=false;
                break;
            case 3:
                m.mesa3Button.setBackground(Color.GREEN);
                reserva3=false;
                break;
            case 4:
                m.mesa4Button.setBackground(Color.GREEN);
                reserva4=false;
                break;
            case 5:
                m.mesa5Button.setBackground(Color.GREEN);
                reserva5=false;
                break;
            case 6:
                m.mesa6Button.setBackground(Color.GREEN);
                reserva6=false;
                break;
            case 7:
                m.mesa7Button.setBackground(Color.GREEN);
                reserva7=false;
                break;
            case 8:
                m.mesa8Button.setBackground(Color.GREEN);
                reserva8=false;
                break;
            case 9:
                m.mesa9Button.setBackground(Color.GREEN);
                reserva9=false;
                break;
            case 10:
                m.mesa10Button.setBackground(Color.GREEN);
                reserva10=false;
                break;
        }
        for (int i = 0; i < lista_mesas.size(); i++) {
            Mesa mesa= (Mesa) lista_mesas.get(i);
            if(mesa.getNumero()==num_mesa){
                lista_mesas.remove(mesa);
            }
        }
    }
}
