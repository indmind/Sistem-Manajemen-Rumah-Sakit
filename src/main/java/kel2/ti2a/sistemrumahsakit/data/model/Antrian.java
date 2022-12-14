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
    protected int id;
    protected int pasien_id;
    protected int unitpelayanan_id;
    protected String timestamp;
    protected String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    public static ArrayList<Antrian> getAntrianByUnitPelayanan(int id){
        ArrayList<Antrian> listAntrian = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM antrean WHERE unitpelayanan_id = '" +id+"'");
        try{
            while (rs.next()) {
                Antrian a = new Antrian();
                a.setId(rs.getInt("id"));
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
        String sql = "SELECT * FROM antrean WHERE id = '" + noAntrean + "'";
        ResultSet rs = DBHelper.selectQuery(sql);
        try {
            if (rs.next()) {
                antre = new Antrian();
                antre.setId(rs.getInt("id"));
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
    
    public static Antrian getAntrianCheckupByUnitPelayanan(int id){
        Antrian an = new Antrian();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM antrean WHERE unitpelayanan_id = '" +id+"' AND status = 'CHECKUP'");
        try{
            while (rs.next()) {
                an.setId(rs.getInt("id"));
                an.setPasien_id(rs.getInt("pasien_id"));
                an.setStatus(rs.getString("status"));
                an.setTimestamp(rs.getString("timestamp"));
                an.setUnitpelayanan_id(rs.getInt("unitPelayanan_id"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return an;
    }
    
    public static Antrian getAntrianNextByUnitPelayanan(int id){
        Antrian an = new Antrian();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM antrean WHERE unitpelayanan_id = '" +id+"' AND (status = 'CHECKUP' OR status = 'OBAT')");
        try{
            while (rs.next()) {
                an.setId(rs.getInt("id"));
                an.setPasien_id(rs.getInt("pasien_id"));
                an.setStatus(rs.getString("status"));
                an.setTimestamp(rs.getString("timestamp"));
                an.setUnitpelayanan_id(rs.getInt("unitPelayanan_id"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return an;
    }
    
    public static int getLatestNoAntreanByUnitPelayanan(int id){
        int noAntrean = 0;
        ResultSet rs = DBHelper.selectQuery("SELECT MIN(id) AS no FROM antrean WHERE unitpelayanan_id = '" +id+"' AND status = 'ANTRI'");
        try{
            while (rs.next()) {
                noAntrean = rs.getInt("no");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return noAntrean;
    }
    
    public static int getLatestCheckupByUnitPelayanan(int id){
        int noAntrean = 0;
        ResultSet rs = DBHelper.selectQuery("SELECT MIN(nomorAntrean) AS no FROM antrean WHERE unitpelayanan_id = '" +id+"' AND status = 'CHECKUP'");
        try{
            while (rs.next()) {
                noAntrean = rs.getInt("no");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return noAntrean;
    }
    
    public static Boolean nextAntrian(int unitPelayanan){
        Boolean statusNext = false;
        
        String sqlUpdateCheckUp = "UPDATE antrean SET status = 'CHECKUP' WHERE unitpelayanan_id = " + unitPelayanan + " AND id = '" + String.valueOf(getLatestNoAntreanByUnitPelayanan(unitPelayanan)) + "'";
        statusNext = DBHelper.executeQuery(sqlUpdateCheckUp);
        
        return statusNext;
    }
    
    
    public int insertIntoAntrean(int pasien_id, int unitpelayanan_id){
        try {
            String sql = "INSERT INTO antrean (pasien_id, unitpelayanan_id, timestamp, status) VALUES ('"
                    + pasien_id + "', '"
                    + unitpelayanan_id + "', "
                    + "DATE(timestamp)," 
                    + "'ANTRI')";
            this.id = DBHelper.insertQueryGetId(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (Antrian.getById(this.id) != null) {
            return this.id;
        }
        return -1;
    }
}