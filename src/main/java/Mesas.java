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

    public Mesas() {
        mesa1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 1;
                if (!log.mesa1.isCreada()) {
                    log.mesa1.setCreada(true);
                    log.mesa1.setCamarero(log.u.getNombre());
                    log.mesa1.setNumero(num_mesa);
                    log.mesa1.setLista(null);
                    a.init(log.mesa1, false);
                } else {
                    a.init(log.mesa1, true);
                }
                mesa1Button.setBackground(Color.YELLOW);
            }
        });
        mesa2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 2;
                if (!log.mesa2.isCreada()) {
                    log.mesa2.setCreada(true);
                    log.mesa2.setCamarero(log.u.getNombre());
                    log.mesa2.setNumero(2);
                    log.mesa2.setLista(null);
                    a.init(log.mesa2, false);
                } else {
                    a.init(log.mesa2, true);
                }
                mesa2Button.setBackground(Color.YELLOW);
            }
        });
        mesa3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 3;
                if (!log.mesa3.isCreada()) {
                    log.mesa3.setCreada(true);
                    log.mesa3.setCamarero(log.u.getNombre());
                    log.mesa3.setNumero(3);
                    log.mesa3.setLista(null);
                    a.init(log.mesa3, false);
                } else {
                    a.init(log.mesa3, true);
                }
                mesa3Button.setBackground(Color.YELLOW);
            }
        });
        mesa4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 4;
                if (!log.mesa4.isCreada()) {
                    log.mesa4.setCreada(true);
                    log.mesa4.setCamarero(log.u.getNombre());
                    log.mesa4.setNumero(4);
                    log.mesa4.setLista(null);
                    a.init(log.mesa4, false);
                } else {
                    a.init(log.mesa4, true);
                }
                mesa4Button.setBackground(Color.YELLOW);
            }
        });
        mesa5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 5;
                if (!log.mesa5.isCreada()) {
                    log.mesa5.setCreada(true);
                    log.mesa5.setCamarero(log.u.getNombre());
                    log.mesa5.setNumero(5);
                    log.mesa5.setLista(null);
                    a.init(log.mesa5, false);
                } else {
                    a.init(log.mesa5, true);
                }
                mesa5Button.setBackground(Color.YELLOW);
            }
        });
        mesa6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 6;
                if (!log.mesa6.isCreada()) {
                    log.mesa6.setCreada(true);
                    log.mesa6.setCamarero(log.u.getNombre());
                    log.mesa6.setNumero(6);
                    log.mesa6.setLista(null);
                    a.init(log.mesa6, false);
                } else {
                    a.init(log.mesa6, true);
                }
                mesa6Button.setBackground(Color.YELLOW);
            }
        });
        mesa7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 7;
                if (!log.mesa7.isCreada()) {
                    log.mesa7.setCreada(true);
                    log.mesa7.setCamarero(log.u.getNombre());
                    log.mesa7.setNumero(7);
                    log.mesa7.setLista(null);
                    a.init(log.mesa7, false);
                } else {
                    a.init(log.mesa7, true);
                }
                mesa7Button.setBackground(Color.YELLOW);
            }
        });
        mesa8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 8;
                if (!log.mesa8.isCreada()) {
                    log.mesa8.setCreada(true);
                    log.mesa8.setCamarero(log.u.getNombre());
                    log.mesa8.setNumero(8);
                    log.mesa8.setLista(null);
                    a.init(log.mesa8, false);
                } else {
                    a.init(log.mesa8, true);
                }
                mesa8Button.setBackground(Color.YELLOW);
            }
        });
        mesa9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 9;
                if (!log.mesa9.isCreada()) {
                    log.mesa9.setCreada(true);
                    log.mesa9.setCamarero(log.u.getNombre());
                    log.mesa9.setNumero(9);
                    log.mesa9.setLista(null);
                    a.init(log.mesa9, false);
                } else {
                    a.init(log.mesa9, true);
                }
                mesa9Button.setBackground(Color.YELLOW);
            }
        });
        mesa10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_mesa = 10;
                if (!log.mesa10.isCreada()) {
                    log.mesa10 = new Mesa();
                    log.mesa10.setCreada(true);
                    log.mesa10.setCamarero(log.u.getNombre());
                    log.mesa10.setNumero(10);
                    log.mesa10.setLista(null);
                    a.init(log.mesa10, false);
                } else {
                    a.init(log.mesa10, true);
                }
                mesa10Button.setBackground(Color.YELLOW);
            }
        });
        cancelarTicketButton.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                     cancelarMesa(num_mesa);
                     num_mesa = 0;
               }
        });
    }
    protected static void init() {
        m = new Mesas();
        m.setContentPane(m.container);
        m.setVisible(true);
        m.pack();
        pinta();
        m.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    protected static void pinta() {
        if (log.mesa1.isCreada()) {
            m.mesa1Button.setBackground(Color.YELLOW);
        }
        if (log.mesa2.isCreada()) {
            m.mesa2Button.setBackground(Color.YELLOW);
        }
        if (log.mesa3.isCreada()) {
            m.mesa3Button.setBackground(Color.YELLOW);
        }
        if (log.mesa4.isCreada()) {
            m.mesa4Button.setBackground(Color.YELLOW);
        }
        if (log.mesa5.isCreada()) {
            m.mesa5Button.setBackground(Color.YELLOW);
        }
        if (log.mesa6.isCreada()) {
            m.mesa6Button.setBackground(Color.YELLOW);
        }
        if (log.mesa7.isCreada()) {
            m.mesa7Button.setBackground(Color.YELLOW);
        }
        if (log.mesa8.isCreada()) {
            m.mesa8Button.setBackground(Color.YELLOW);
        }
        if (log.mesa9.isCreada()) {
            m.mesa9Button.setBackground(Color.YELLOW);
        }
        if (log.mesa10.isCreada()) {
            m.mesa10Button.setBackground(Color.YELLOW);
        }
    }
    protected static void cancelarMesa(int num_mesa) {
        switch (num_mesa) {
            case 1:
                log.mesa1=new Mesa();
                m.mesa1Button.setBackground(Color.GREEN);
                break;
            case 2:
                log.mesa2=new Mesa();
                m.mesa2Button.setBackground(Color.GREEN);
                break;
            case 3:
                log.mesa3=new Mesa();
                m.mesa3Button.setBackground(Color.GREEN);
                break;
            case 4:
                log.mesa4=new Mesa();
                m.mesa4Button.setBackground(Color.GREEN);
                break;
            case 5:
                log.mesa5=new Mesa();
                m.mesa5Button.setBackground(Color.GREEN);
                break;
            case 6:
                log.mesa6=new Mesa();
                m.mesa6Button.setBackground(Color.GREEN);
                break;
            case 7:
                log.mesa7=new Mesa();
                m.mesa7Button.setBackground(Color.GREEN);
                break;
            case 8:
                log.mesa8=new Mesa();
                m.mesa8Button.setBackground(Color.GREEN);
                break;
            case 9:
                log.mesa9=new Mesa();
                m.mesa9Button.setBackground(Color.GREEN);
                break;
            case 10:
                log.mesa10=new Mesa();
                m.mesa10Button.setBackground(Color.GREEN);
                break;
        }
    }
}
