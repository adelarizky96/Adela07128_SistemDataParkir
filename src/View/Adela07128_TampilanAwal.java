package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Adela07128_TampilanAwal {
    JFrame Awalan = new JFrame();
    JLabel top,pertanyaan;
    JButton perjam,perhari;
    private boolean cek;
    public int cb;
    public Adela07128_TampilanAwal(){
        Awalan.setSize(450, 280);
        Awalan.setLayout(null);
        Awalan.getContentPane().setBackground(Color.PINK);
        top = new JLabel("Program Sistem Informasi Parkir");
        top.setBounds(30, 5, 500, 50);
        top.setFont(new Font("Times New Roman",Font.BOLD,25));
        Awalan.add(top);
        perjam = new JButton("Parkir Perjam");
        perjam.setBounds(130, 90, 200, 30);
        perjam.setBackground(Color.YELLOW);
        Awalan.add(perjam);
        perhari = new JButton("Parkir Perhari");
        perhari.setBounds(130, 130, 200, 30);
        perhari.setBackground(Color.GREEN);
        Awalan.add(perhari);
        Awalan.setVisible(true);
        Awalan.setLocationRelativeTo(null);
        Awalan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        perjam.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                cb = 1;
                Adela07128_Allobjctrl.nota.setMenu(cb);
                JOptionPane.showMessageDialog(null,"Anda akan mengisi data parkir perjam", "Information", JOptionPane.INFORMATION_MESSAGE);
                Adela07128_Parkir parkir = new Adela07128_Parkir();
                Awalan.dispose();
            }
        });
        perhari.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                cb = 2;
                Adela07128_Allobjctrl.nota.setMenu(cb);
                JOptionPane.showMessageDialog(null,"Anda akan mengisi data parkir perhari", "Information", JOptionPane.INFORMATION_MESSAGE);
                Adela07128_Parkir parkir = new Adela07128_Parkir();
                Awalan.dispose();
            }
        });
    }
    String parkirperhari(){
        String parkirH = "";
    return parkirH;
    }
}
