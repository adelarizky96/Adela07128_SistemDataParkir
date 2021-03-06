package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class Adela07128_Parkir {
    JFrame parkir = new JFrame();
    JLabel top,input,view,delete,cetaknota,jenisL,platL,hps,cetak,ctk,tglkeluarL,blnkeluarL,jamkeluarL,menitkeluarL,tahunkeluarL;
    JTextField jenis,plat,idxhps,idxctk,tglkeluar,blnkeluar,jamkeluar,menitkeluar,tahunkeluar;
    JRadioButton perjam,perhari;
    JButton reg,dlt,cetk,exit,back,lihatdata,insert,clear;
    JTextArea area = new JTextArea();
    JScrollPane areascroll;
    private int nonotajam,nonotahari,cekctk,harga1,harga2,harga3,totalH;
    private int durasijam,durasimenit,jammasuk,menitmasuk,durasihari,durasibulan,durasitahun;
    private boolean cek=true;
    private String parkirJ="",parkirH="";
    
    public Adela07128_Parkir(){
       initComponent();
    }
    
    public void initComponent(){
        parkir.setSize(980, 530);
        parkir.setLayout(null);
        parkir.getContentPane().setBackground(Color.PINK);
        
        tglkeluarL= new JLabel ("Tanggal Keluar");
        tglkeluarL.setBounds(700, 70, 200, 30);
        tglkeluarL.setFont(new Font("Times New Roman",Font.BOLD,15));
        parkir.add(tglkeluarL);
        
        tglkeluar= new JTextField();
        tglkeluar.setEditable(false);
        tglkeluar.setBounds(820, 70, 100, 30);
        parkir.add(tglkeluar);
        
        blnkeluarL= new JLabel ("Bulan Keluar");
        blnkeluarL.setBounds(700, 110, 200, 30);
        blnkeluarL.setFont(new Font("Times New Roman",Font.BOLD,15));
        parkir.add(blnkeluarL);
        
        blnkeluar= new JTextField();
        blnkeluar.setEditable(false);
        blnkeluar.setBounds(820, 110, 100, 30);
        parkir.add(blnkeluar);
        
        tahunkeluarL= new JLabel ("Tahun Keluar");
        tahunkeluarL.setBounds(700, 150, 200, 30);
        tahunkeluarL.setFont(new Font("Times New Roman",Font.BOLD,15));
        parkir.add(tahunkeluarL);
        
        tahunkeluar= new JTextField();
        tahunkeluar.setEditable(false);
        tahunkeluar.setBounds(820, 150, 100, 30);
        parkir.add(tahunkeluar);
        
        jamkeluarL= new JLabel ("Jam Keluar");
        jamkeluarL.setBounds(700, 190, 200, 30);
        jamkeluarL.setFont(new Font("Times New Roman",Font.BOLD,15));
        parkir.add(jamkeluarL);
        
        jamkeluar= new JTextField();
        jamkeluar.setEditable(false);
        jamkeluar.setBounds(820, 190, 100, 30);
        parkir.add(jamkeluar);
        
        menitkeluarL= new JLabel ("Menit Keluar");
        menitkeluarL.setBounds(700, 230, 200, 30);
        menitkeluarL.setFont(new Font("Times New Roman",Font.BOLD,15));
        parkir.add(menitkeluarL);
        
        menitkeluar= new JTextField(); 
        menitkeluar.setEditable(false);
        menitkeluar.setBounds(820, 230, 100, 30);
        parkir.add(menitkeluar);
        
        cetk = new JButton("CETAK");
        cetk.setBounds(750, 270, 100, 30);
        parkir.add(cetk);
        
        top = new JLabel ("PARKIR");
        top.setBounds(260, 20, 200, 30);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        parkir.add(top);
        
        areascroll=new JScrollPane(area);
        areascroll.setBounds(20, 80, 300,330);
        area.setEditable(false);
        parkir.add(areascroll);
        
        input = new JLabel ("Input");
        input.setBounds(340, 70, 100, 30);
        input.setFont(new Font("Times New Roman",Font.BOLD,20));
        parkir.add(input);
        
        jenisL = new JLabel ("Jenis kendaraan");
        jenisL.setBounds(350, 100, 100, 30);
        parkir.add(jenisL);
        
        jenis = new JTextField();
        jenis.setBounds(350, 130, 100, 30);
        parkir.add(jenis);
        
        platL = new JLabel ("Plat kendaraan");
        platL.setBounds(350, 160, 100, 30);
        parkir.add(platL);
        
        plat = new JTextField();
        plat.setBounds(350, 190, 100, 30);
        parkir.add(plat);
        
        reg = new JButton("daftar");
        reg.setBounds(350, 230, 80, 30);
        parkir.add(reg);
        
        delete = new JLabel ("Delete");
        delete.setBounds(480, 250, 100, 30);
        delete.setFont(new Font("Times New Roman",Font.BOLD,20));
        parkir.add(delete);
        
        hps = new JLabel ("Plat nomer yang dihapus");
        hps.setBounds(490, 280, 200, 30);
        parkir.add(hps);
        
        idxhps = new JTextField();
        idxhps.setBounds(490, 310, 100, 30);
        parkir.add(idxhps);
        
        dlt = new JButton("Delete");
        dlt.setBounds(490, 350, 80, 30);
        parkir.add(dlt);
        
        cetak = new JLabel ("Cetak");
        cetak.setBounds(480, 70, 100, 30);
        cetak.setFont(new Font("Times New Roman",Font.BOLD,20));
        parkir.add(cetak);
        
        ctk = new JLabel ("Plat nomer yang dicetak");
        ctk.setBounds(490, 100, 200, 30);
        parkir.add(ctk);
        
        idxctk = new JTextField();
        idxctk.setBounds(490, 130, 100, 30);
        parkir.add(idxctk);
        
        insert = new JButton("INSERT");
        insert.setBounds(490, 170, 80, 30);
        parkir.add(insert);
        
        lihatdata = new JButton("Lihat Data");
        lihatdata.setBounds(340, 310, 100, 30);
        parkir.add(lihatdata);
        
        exit = new JButton("EXIT");
        exit.setBounds(860, 450, 80, 30);
        exit.setBackground(Color.CYAN);
        parkir.add(exit);
        
        back = new JButton("BACK");
        back.setBounds(20, 450, 80, 30);
        back.setBackground(Color.red);
        parkir.add(back);
        
        clear = new JButton("CLEAR");
        clear.setBounds(450, 450, 80, 30);
        clear.setBackground(Color.GREEN);
        parkir.add(clear);
                
        parkir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        parkir.setVisible(true);
        parkir.setLocationRelativeTo(null);
        
        reg.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                try{
                    if(Adela07128_Allobjctrl.nota.getMenu()==1){
                        String jeniskendaraan = jenis.getText();
                        String platnomor = plat.getText();
                        nonotajam++;
                        if(nonotahari>=1){
                            nonotajam=nonotahari+1;
                        }
                        Adela07128_Allobjctrl.kendaraan.insert(platnomor, jeniskendaraan, "parkir");
                        DateFormat formatHmasuk = new SimpleDateFormat("HH");
                        DateFormat formatMmasuk = new SimpleDateFormat("mm");
                        Date getjammasuk = new Date();
                        Date getmenitmasuk = new Date();
                        String jammasuk = formatHmasuk.format(getjammasuk);
                        String menitmasuk = formatMmasuk.format(getmenitmasuk);
                        Adela07128_Allobjctrl.nota.insertNotaJam(0,nonotajam,"parkir",new Date(),jammasuk,menitmasuk,0,0);
                        JOptionPane.showMessageDialog(null,"Berhasil menginputkan data", "Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(Adela07128_Allobjctrl.nota.getMenu()==2){
                        String jeniskendaraan = jenis.getText();
                        String platnomor = plat.getText();
                        nonotahari++;
                        if(nonotajam>=1){
                            nonotahari=nonotajam+1;
                        }
                        Adela07128_Allobjctrl.kendaraan.insert(platnomor, jeniskendaraan, "parkir");
                        DateFormat formatTmasuk = new SimpleDateFormat("dd");
                        DateFormat formatBmasuk = new SimpleDateFormat("MM");
                        DateFormat formatTHmasuk = new SimpleDateFormat ("yyyy");
                        Date gettanggalmasuk = new Date();
                        Date getbulanmasuk = new Date();
                        Date gettahunmasuk = new Date();
                        String tanggalmasuk = formatTmasuk.format(gettanggalmasuk);
                        String bulanmasuk = formatBmasuk.format(getbulanmasuk);
                        String tahunmasuk = formatTHmasuk.format(gettahunmasuk);
                        Adela07128_Allobjctrl.nota.insertNotaHari(tanggalmasuk,bulanmasuk,tahunmasuk,0,0,0,"parkir",0,nonotahari);
                        JOptionPane.showMessageDialog(null,"Berhasil menginputkan data", "Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                }catch(Exception e){
                  JOptionPane.showMessageDialog(null,"Format Pengisian salah", "Information", JOptionPane.INFORMATION_MESSAGE);  
                }
            }
        });
        
        lihatdata.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                view();
                lihatdata.setEnabled(false);
                
                if(Adela07128_Allobjctrl.nota.getMenu()==1){ 
                    if(Adela07128_Allobjctrl.nota.loopingJam()==0){
                        JOptionPane.showMessageDialog(null,"Data kosong", "Information", JOptionPane.INFORMATION_MESSAGE);  
                    }
                    else{
                        area.setText(parkirJ);
                    }
                }
                else if(Adela07128_Allobjctrl.nota.getMenu()==2){
                    if(Adela07128_Allobjctrl.nota.loopingHari()==0){
                        JOptionPane.showMessageDialog(null,"Data kosong", "Information", JOptionPane.INFORMATION_MESSAGE);  
                    }
                    else{
                        area.setText(parkirH);
                    }
                }
            }
        });
        
        dlt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                int cek = Adela07128_Allobjctrl.kendaraan.cekdataAkun(idxhps.getText());
                if(Adela07128_Allobjctrl.nota.getMenu()==1){ 
                    Adela07128_Allobjctrl.nota.deleteNotaJam(cek);
                    JOptionPane.showMessageDialog(null,"Data berhasil dihapus", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
                else if(Adela07128_Allobjctrl.nota.getMenu()==2){
                    Adela07128_Allobjctrl.nota.deleteNotaHari(cek);
                    JOptionPane.showMessageDialog(null,"Data berhasil dihapus", "Information", JOptionPane.INFORMATION_MESSAGE); 
                } 
            }
        });
        
        insert.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                    if(Adela07128_Allobjctrl.nota.getMenu()==1){ 
                        jamkeluar.setEditable(true);
                        menitkeluar.setEditable(true);
                    }
                    else if(Adela07128_Allobjctrl.nota.getMenu()==2){
                        tglkeluar.setEditable(true);
                        blnkeluar.setEditable(true);
                        tahunkeluar.setEditable(true);   
                    }
            }
        });
        
        cetk.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                cekctk = Adela07128_Allobjctrl.kendaraan.cekdataAkun(idxctk.getText());
                Adela07128_Allobjctrl.kendaraan.showData(cekctk).setKondisi("sudah keluar");           
                if(Adela07128_Allobjctrl.nota.getMenu()==1){ 
                    int jmklr=Integer.parseInt(jamkeluar.getText());
                    int mntklr=Integer.parseInt(menitkeluar.getText());
                    Adela07128_Allobjctrl.nota.showDataNotajam(cekctk).setJamKeluar(jmklr);
                    Adela07128_Allobjctrl.nota.showDataNotajam(cekctk).setMenitKeluar(mntklr);    
                    jammasuk = Integer.parseInt(Adela07128_Allobjctrl.nota.showDataNotajam(cekctk).getJamMasuk());
                    menitmasuk = Integer.parseInt(Adela07128_Allobjctrl.nota.showDataNotajam(cekctk).getMenitMasuk());
                    durasijam = Adela07128_Allobjctrl.nota.showDataNotajam(cekctk).getJamKeluar() - jammasuk;
                    durasimenit = Adela07128_Allobjctrl.nota.showDataNotajam(cekctk).getMenitKeluar() - menitmasuk;
                    if ("mobil".equals(Adela07128_Allobjctrl.kendaraan.showData(cekctk).getJenisKendaraan())){
                        harga1 = durasijam*5000;
                        harga2 = durasimenit*100;
                        totalH = harga1 + harga2;
                    }
                    else if ("motor".equals(Adela07128_Allobjctrl.kendaraan.showData(cekctk).getJenisKendaraan())){
                        harga1 = durasijam*2000;
                        harga2 = durasimenit*50;
                        totalH = harga1 + harga2;
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"PILIHAN KENDARAAN SALAH", "Information", JOptionPane.INFORMATION_MESSAGE); 
                    }
                    area.setText(parkirjam(cekctk));
                }
                else if(Adela07128_Allobjctrl.nota.getMenu()==2){
                    int tglklr= Integer.parseInt(tglkeluar.getText());                     
                    int blnklr=Integer.parseInt(blnkeluar.getText());
                    int thnklr=Integer.parseInt(tahunkeluar.getText());
                    Adela07128_Allobjctrl.nota.showDataNotaHari(cekctk).setTanggalKeluar(tglklr);
                    Adela07128_Allobjctrl.nota.showDataNotaHari(cekctk).setBulanKeluar(blnklr);
                    Adela07128_Allobjctrl.nota.showDataNotaHari(cekctk).setTahunKeluar(thnklr);
                    int tanggalmasuk = Integer.parseInt(Adela07128_Allobjctrl.nota.showDataNotaHari(cekctk).getTanggalMasuk());
                    int bulanmasuk = Integer.parseInt(Adela07128_Allobjctrl.nota.showDataNotaHari(cekctk).getBulanMasuk());
                    int tahunmasuk = Integer.parseInt(Adela07128_Allobjctrl.nota.showDataNotaHari(cekctk).getTahunMasuk());
                    int durasihari = Adela07128_Allobjctrl.nota.showDataNotaHari(cekctk).getTanggalKeluar() - tanggalmasuk;
                    int durasibulan = Adela07128_Allobjctrl.nota.showDataNotaHari(cekctk).getBulanKeluar() - bulanmasuk;
                    int durasitahun = Adela07128_Allobjctrl.nota.showDataNotaHari(cekctk).getTahunKeluar() - tahunmasuk;
                    if ("mobil".equals(Adela07128_Allobjctrl.kendaraan.showData(cekctk).getJenisKendaraan())){
                        harga1 = durasihari*50000;
                        harga2 = durasibulan*500000;
                        harga3 = durasitahun*5000000;
                        totalH = harga1 + harga2 + harga3;
                    }
                    else if ("motor".equals(Adela07128_Allobjctrl.kendaraan.showData(cekctk).getJenisKendaraan())){
                        int harga1 = durasihari*30000;
                        int harga2 = durasibulan*300000;
                        int harga3 = durasitahun*3000000;
                        int totalH = harga1 + harga2 + harga3;
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"PILIHAN KENDARAAN SALAH", "Information", JOptionPane.INFORMATION_MESSAGE); 
                    }
                    area.setText(parkirhari(cekctk));  
                } 
            }
        });
        
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Adela07128_TampilanAwal awal = new Adela07128_TampilanAwal();
                parkir.dispose();
            }
        });
        
        clear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                area.setText("");
                parkirJ="";
                lihatdata.setEnabled(true);
            }
        });
        
        exit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                parkir.dispose();
            }
        });
    }
    String parkirjam(int i){
        String CparkirJ = "====BANDAR UDARA JUANDA SURABAYA===="+ 
                         "\nJenis kendaraan\t= "+Adela07128_Allobjctrl.kendaraan.showData(Adela07128_Allobjctrl.nota.showDataNotajam(i).getNoNota()-1).getJenisKendaraan()+
                         "\nPlat nomor\t\t= "+Adela07128_Allobjctrl.kendaraan.showData(Adela07128_Allobjctrl.nota.showDataNotajam(i).getNoNota()-1).getPlatNomor()+            
                         "\nTanggal parkir\t\t= "+new SimpleDateFormat("dd-MM-yyyy").format(Adela07128_Allobjctrl.nota.showDataNotajam(i).getTanggalMasuk())+
                         "\nWaktu masuk\t\t= "+Adela07128_Allobjctrl.nota.showDataNotajam(i).getJamMasuk() + " : " + Adela07128_Allobjctrl.nota.showDataNotajam(i).getMenitMasuk() + " WIB"+
                         "\nWaktu keluar\t\t= " +Adela07128_Allobjctrl.nota.showDataNotajam(i).getJamKeluar() + " : " + Adela07128_Allobjctrl.nota.showDataNotajam(i).getMenitKeluar() + " WIB"+   
                         "\nDurasi parkir\t\t= "+durasijam +" : " +durasimenit+
                         "\nHarga parkir\t\t= "+totalH;
        return CparkirJ;
    }
    
    String parkirhari(int i){
        String CparkirH ="====BANDAR UDARA JUANDA SURABAYA===="+  
                         "\nKondisi kendaraan\t= "+Adela07128_Allobjctrl.kendaraan.showData(Adela07128_Allobjctrl.nota.showDataNotaHari(i).getNoNota()-1).getKondisi()+    
                         "\nJenis kendaraan\t= "+Adela07128_Allobjctrl.kendaraan.showData(Adela07128_Allobjctrl.nota.showDataNotaHari(i).getNoNota()-1).getJenisKendaraan()+
                         "\nPlat nomor\t\t= "+Adela07128_Allobjctrl.kendaraan.showData(Adela07128_Allobjctrl.nota.showDataNotaHari(i).getNoNota()-1).getPlatNomor()+
                         "\nTanggal parkir\t\t= "+Adela07128_Allobjctrl.nota.showDataNotaHari(i).getTanggalMasuk()+"/"+Adela07128_Allobjctrl.nota.showDataNotaHari(i).getBulanMasuk()+"/"+Adela07128_Allobjctrl.nota.showDataNotaHari(i).getTahunMasuk()+
                         "\nTanggal keluar\t\t= " +Adela07128_Allobjctrl.nota.showDataNotaHari(i).getTanggalKeluar()+"/"+Adela07128_Allobjctrl.nota.showDataNotaHari(i).getBulanKeluar()+"/"+Adela07128_Allobjctrl.nota.showDataNotaHari(i).getTahunKeluar()+
                         "\nDurasi parkir\t\t= "+durasihari +" / " +durasibulan+"/"+durasitahun+
                         "\nHarga parkir\t\t= "+totalH;
        return CparkirH;
    }
    
    public void view(){
        for(int i=0;i<Adela07128_Allobjctrl.nota.loopingJam();i++){
            parkirJ+= "\n\nKondisi kendaraan\t= "+Adela07128_Allobjctrl.kendaraan.showData(Adela07128_Allobjctrl.nota.showDataNotajam(i).getNoNota()-1).getKondisi()
                    + "\nJenis kendaraan\t= "+Adela07128_Allobjctrl.kendaraan.showData(Adela07128_Allobjctrl.nota.showDataNotajam(i).getNoNota()-1).getJenisKendaraan()+
                      "\nPlat nomor\t\t= "+Adela07128_Allobjctrl.kendaraan.showData(Adela07128_Allobjctrl.nota.showDataNotajam(i).getNoNota()-1).getPlatNomor()+            
                      "\nTanggal parkir\t\t= "+new SimpleDateFormat("dd-MM-yyyy").format(Adela07128_Allobjctrl.nota.showDataNotajam(i).getTanggalMasuk())+
                      "\nWaktu masuk\t\t= "+Adela07128_Allobjctrl.nota.showDataNotajam(i).getJamMasuk() + " : " + Adela07128_Allobjctrl.nota.showDataNotajam(i).getMenitMasuk() + " WIB"+
                      "\nWaktu keluar\t\t= " +Adela07128_Allobjctrl.nota.showDataNotajam(i).getJamKeluar() + " : " + Adela07128_Allobjctrl.nota.showDataNotajam(i).getMenitKeluar() + " WIB"; 
        }
        
        for(int i=0;i<Adela07128_Allobjctrl.nota.loopingHari();i++){
            parkirH += "\n\nKondisi kendaraan\t= "+Adela07128_Allobjctrl.kendaraan.showData(Adela07128_Allobjctrl.nota.showDataNotaHari(i).getNoNota()-1).getKondisi()+    
                       "\nJenis kendaraan\t= "+Adela07128_Allobjctrl.kendaraan.showData(Adela07128_Allobjctrl.nota.showDataNotaHari(i).getNoNota()-1).getJenisKendaraan()+
                       "\nPlat nomor\t\t= "+Adela07128_Allobjctrl.kendaraan.showData(Adela07128_Allobjctrl.nota.showDataNotaHari(i).getNoNota()-1).getPlatNomor()+
                       "\nTanggal parkir\t\t= "+Adela07128_Allobjctrl.nota.showDataNotaHari(i).getTanggalMasuk()+"/"+Adela07128_Allobjctrl.nota.showDataNotaHari(i).getBulanMasuk()+"/"+Adela07128_Allobjctrl.nota.showDataNotaHari(i).getTahunMasuk()+
                       "\nTanggal keluar\t\t= " +Adela07128_Allobjctrl.nota.showDataNotaHari(i).getTanggalKeluar()+"/"+Adela07128_Allobjctrl.nota.showDataNotaHari(i).getBulanKeluar()+"/"+Adela07128_Allobjctrl.nota.showDataNotaHari(i).getTahunKeluar();
      }
    }
    public void kosong(){
        jenis.setText(null);
        plat.setText(null);
        idxhps.setText(null);
        idxctk.setText(null);
        tglkeluar.setText(null);
        blnkeluar.setText(null);
        jamkeluar.setText(null);
        menitkeluar.setText(null);
        tahunkeluar.setText(null);
    }
}