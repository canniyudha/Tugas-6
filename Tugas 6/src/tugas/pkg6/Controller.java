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
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Controller {
    Model model;
    View view;
    
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        if(model.getBanyakData() !=0){
           String data[][]= model.readData();
           view.tabel.setModel((new JTable(data, view.namaKolom)).getModel());
        }
        else{
            JOptionPane.showMessageDialog(null,"Data Tidak ada");          
        }
        view.btnCreatePanel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (view.getJudul().equals("")
                        || view.getTipe().equals("")
                        || view.getEpisode().equals("")
                        || view.getGenre().equals("")
                        || view.getStatus().equals("")
                        || view.getRating().equals("")){
                    JOptionPane.showMessageDialog(null, "Field tidk boleh kosong");
                       
            }else{
                    String judul = view.getJudul();
                    String tipe = view.getTipe();
                    String episode = view.getEpisode();
                    String genre = view.getGenre();
                    String status = view.getStatus();
                    String rating = view.getRating();
                    model.insertData(/* id,*/judul, tipe, episode, genre, status,rating);
                    
                    String data[][] = model.readData();
                    view.tabel.setModel(new JTable (data, view.namaKolom).getModel());
                }     
            }
        }); 
        
        view.btnRefershPanel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String data[][] = model.readData();
                        view.tabel.setModel(new JTable (data, view.namaKolom).getModel());

                view.tfID.setText(null);
                view.tfJudul.setText(null);
                view.tfTipe.setText(null);
                view.tfEpisode.setText(null);
                view.tfGenre.setText(null);
                view.tfRating.setText(null);
                view.cmbStatus.setSelectedItem(this);
                view.tfSearch.setText(null);
            }
        });

        view.btnSearch.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String getSearch= view.getSearch();
                String data[][] = model.searchData(getSearch);
                view.tabel.setModel(new JTable (data, view.namaKolom).getModel());
            }
        }); 

        view.tabel.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int baris = view.tabel.getSelectedRow();
                int kolom = view.tabel.getSelectedColumn();
                String dataterpilih = view.tabel.getValueAt(baris, 0).toString();
                System.out.println(dataterpilih);

                String judul =view.tabel.getValueAt(baris, 1).toString();
                view.tfJudul.setText(judul);
                String tipe =view.tabel.getValueAt(baris, 2).toString();
                view.tfTipe.setText(tipe);
                String episode =view.tabel.getValueAt(baris, 3).toString();
                view.tfEpisode.setText(episode);
                String genre =view.tabel.getValueAt(baris, 4).toString();
                view.tfGenre.setText(genre);
                String status =view.tabel.getValueAt(baris, 5).toString();
                view.cmbStatus.setSelectedItem(status);
                String rating =view.tabel.getValueAt(baris, 6).toString();
                view.tfRating.setText(rating);        

                view.btnUpdatePanel.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){ 
                        String id = dataterpilih;
                        String judul = view.getJudul();
                        String tipe = view.getTipe();
                        String episode = view.getEpisode();
                        String genre = view.getGenre();
                        String status = view.getStatus();
                        String rating = view.getRating();
                        model.updateData( id,judul, tipe, episode, genre, status,rating);

                        String data[][]= model.readData();
                        view.tabel.setModel(new JTable(data, view.namaKolom).getModel());
                    }
                });

                view.btnDeletePanel.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){    
                        model.deleteData(dataterpilih);
                        String data[][]= model.readData();
                        view.tabel.setModel(new JTable(data, view.namaKolom).getModel()); 
                    }
                });
            }
        });
    }
}
