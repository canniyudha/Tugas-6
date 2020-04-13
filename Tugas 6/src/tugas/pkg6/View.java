/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg6;

/**
 *
 * @author ASUS
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class View extends JFrame{
   JTextField tfNo = new JTextField(); 
   JTextField tfID = new JTextField();
   JLabel lJudul= new JLabel("Judul");
   JTextField tfJudul = new JTextField();
   JLabel lTipe = new JLabel("Tipe");
   JTextField tfTipe = new JTextField();
   JLabel lStatus = new JLabel("Status");
   String[] namaStatus =
            {" Belum"," Selesai"};
   JComboBox cmbStatus = new JComboBox(namaStatus);

   JLabel lEpisode = new JLabel("Episode");
   JTextField tfEpisode = new JTextField();
   JLabel lRating = new JLabel("Rating");
   JTextField tfRating = new JTextField();
   JLabel lGenre = new JLabel("Genre");
   JTextField tfGenre = new JTextField();
   
   JButton btnSearch = new JButton("Search");
   JTextField tfSearch = new JTextField();
   JButton btnRefershPanel = new JButton("Refesh");
   JButton btnCreatePanel = new JButton("Create");
   JButton btnUpdatePanel = new JButton("Update");
   JButton btnDeletePanel = new JButton("Delete");
   JButton btnExitPanel = new JButton("Exit");
   
   JTable tabel;
   DefaultTableModel tableModel;
   JScrollPane scrollPane;
   Object namaKolom[] = {"ID","Judul","Tipe","Episode","Genre","Status","Rating"};
   
   public View(){
        tableModel = new DefaultTableModel (namaKolom,0);
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);
       
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setSize(850,580);
        setLocation(225,75);
       
        add(tfID);
        add(lJudul);
        lJudul.setBounds(10,300,90,20);
        add(tfJudul);
        tfJudul.setBounds(10,320,245,20);
        add(lTipe);
        lTipe.setBounds(10,340,90,20);
        add(tfTipe);
        tfTipe.setBounds(10,360,120,20);
        add(lStatus);
        lStatus.setBounds(135,340,90,20);
        add(cmbStatus);
        cmbStatus.setBounds(135,360,120,20);
        add(lEpisode);
        lEpisode.setBounds(10,380,90,20);
        add(tfEpisode);
        tfEpisode.setBounds(10,400,120,20);
        add(lRating);
        lRating.setBounds(135,380,90,20);
        add(tfRating);
        tfRating.setBounds(135,400,120,20);
        add(lGenre);
        lGenre.setBounds(10,430,90,20);
        add(tfGenre);
        tfGenre.setBounds(10,450,245,20);
        add(btnSearch);
        btnSearch.setBounds(550,320,90,20);
        add(tfSearch);
        tfSearch.setBounds(300,320,245,20);
        
        add(btnRefershPanel);
        btnRefershPanel.setBounds(300,450,90,20);
        add(btnCreatePanel);
        btnCreatePanel.setBounds(400,450,90,20);
        add(btnUpdatePanel);
        btnUpdatePanel.setBounds(500,450,90,20);
        add(btnDeletePanel);
        btnDeletePanel.setBounds(600,450,90,20);
        add(btnExitPanel);
        btnExitPanel.setBounds(700,450,90,20);

        add(scrollPane);
        scrollPane.setBounds(110,50,600,200);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
   
       
        btnExitPanel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();

            }
        });         

        setVisible(true);
   }
   
   
    public String getID(){
        return tfID.getText();
    }
    public String getJudul(){
        return tfJudul.getText();
    }
    public String getTipe(){
        return tfTipe.getText();
    }
    public String getEpisode(){
        return tfEpisode.getText();
    }
    public String getGenre(){
        return tfGenre.getText();
    }
    public String getStatus(){
        return (String) cmbStatus.getSelectedItem();
    }
    public String getRating(){
        return tfRating.getText();
    }
  
    public String getSearch(){
        return tfSearch.getText();
    }
   
}
