package kel2.ti2a.sistemrumahsakit.data.model;

import java.sql.ResultSet;
import java.util.ArrayList;
import kel2.ti2a.sistemrumahsakit.data.helper.DBHelper;

public class Obat {
    private String nama, merek;
    private int id, harga;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public static ArrayList<Obat> getAll() {
        ArrayList<Obat> ListObat = new ArrayList<>();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM obat");

        try {
            while (rs.next()) {
                Obat d = new Obat();
                d.setId(rs.getInt("id"));
                d.setMerek(rs.getString("merek"));
                d.setNama(rs.getString("nama"));
                d.setHarga(rs.getInt("harga"));
                ListObat.add(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListObat;
    }

    public static ArrayList<Obat> search(String s) {
        ArrayList<Obat> ListObat = new ArrayList<>();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM obat WHERE nama LIKE '%" + s + "%'");

        try {
            while (rs.next()) {
                Obat d = new Obat();
                d.setId(rs.getInt("id"));
                d.setMerek(rs.getString("merek"));
                d.setNama(rs.getString("nama"));
                d.setHarga(rs.getInt("harga"));
                ListObat.add(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListObat;
    }

    public static Obat getById(int id) {
        Obat d = null;
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM obat WHERE id = '" + id + "'");

        try {
            if (rs.next()) {
                d = new Obat();
                d.setId(rs.getInt("id"));
                d.setMerek(rs.getString("merek"));
                d.setNama(rs.getString("nama"));
                d.setHarga(rs.getInt("harga"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return d;
    }

    public void save() {
        if (getById(id) == null) {
            insertObat();
        } else {
            updateObat();
        }
    }

    private void updateObat() {
        String SQL = "UPDATE obat SET merek = '"
                + getMerek() + "', nama = '"
                + getNama() + "', harga = '"
                + getHarga() + "' WHERE id = " + getId() + ";";

        DBHelper.executeQuery(SQL);
    }

    private void insertObat() {
        String SQL = "INSERT INTO obat (merek, nama, harga) VALUES ('"
                + getMerek() + "', '"
                + getNama() + "', '"
                + getHarga() + "');";

        this.id = DBHelper.insertQueryGetId(SQL);
        System.out.println(this.id);
    }

    public static void main(String[] args) {
        Obat o = new Obat();
        o.setMerek("Kimia Farm");
        o.setNama("Paracetamol");
        o.setHarga(5000);

        // o.save();

        ArrayList<Obat> aro = Obat.search("Para");

        for (Obat obi : aro) {
            // obi.setHarga(10000);
            // obi.save();
            System.out.println("Nama : " + obi.getNama());
            System.out.println("Merek : " + obi.getMerek());
            System.out.println("Harga : " + obi.getHarga());
        }
    }
}
