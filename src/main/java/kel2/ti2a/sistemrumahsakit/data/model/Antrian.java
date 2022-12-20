/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kel2.ti2a.sistemrumahsakit.data.model;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import kel2.ti2a.sistemrumahsakit.data.helper.DBHelper;

/**
 *
 * @author tioirawan
 */
public class Antrian {
    protected int nomorAntrean;
    protected int pasien_id;
    protected int unitpelayanan_id;
    protected String timestamp;
    protected String status;

    public int getNomorAntrean() {
        return nomorAntrean;
    }

    public void setNomorAntrean(int nomorAntrean) {
        this.nomorAntrean = nomorAntrean;
    }

    public int getPasien_id() {
        return pasien_id;
    }

    public void setPasien_id(int pasien_id) {
        this.pasien_id = pasien_id;
    }

    public int getUnitpelayanan_id() {
        return unitpelayanan_id;
    }

    public void setUnitpelayanan_id(int unitpelayanan_id) {
        this.unitpelayanan_id = unitpelayanan_id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public ArrayList<Antrian> getAntrianByUnitPelayanan(int id){
        ArrayList<Antrian> listAntrian = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM antrean WHERE unitpelayanan_id = '" +id+"'");
        try{
            while (rs.next()) {
                Antrian a = new Antrian();
                a.setNomorAntrean(rs.getInt("nomorAntrean"));
                a.setPasien_id(rs.getInt("pasien_id"));
                a.setStatus(rs.getString("status"));
                a.setTimestamp(rs.getString("timestamp"));
                a.setUnitpelayanan_id(rs.getInt("unitPelayanan_id"));
                
                listAntrian.add(a);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return listAntrian;
    }
    
    public static Antrian getById(int noAntrean){
        Antrian antre = null;
        String sql = "SELECT * FROM antrean WHERE nomorAntrean = '" + noAntrean + "'";
        ResultSet rs = DBHelper.selectQuery(sql);
        try {
            if (rs.next()) {
                antre = new Antrian();
                antre.setPasien_id(rs.getInt("pasien_id"));
                antre.setStatus(rs.getString("status"));
                antre.setTimestamp(rs.getString("timestamp"));
                antre.setUnitpelayanan_id(rs.getInt("unitpelayanan_id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return antre;
    }
    
    public boolean insertIntoAntrean(int pasien_id, int unitpelayanan_id){
        if (Antrian.getById(nomorAntrean) == null) {
            
        }
        return true;
    }
}