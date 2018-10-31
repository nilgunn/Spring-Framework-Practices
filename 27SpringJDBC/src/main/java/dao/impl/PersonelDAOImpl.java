package dao.impl;

import dao.PersonelDAO;
import enterprise.Personel;

import java.sql.*;
import javax.sql.*;

public class PersonelDAOImpl implements PersonelDAO {
	
	private Connection baglanti = null;
	private String sqlKodu = null;
	private DataSource veriKaynagi;
	
	public DataSource getVeriKaynagi() {
		return veriKaynagi;
	}

	public void setVeriKaynagi(DataSource veriKaynagi) {
		this.veriKaynagi = veriKaynagi;
	}

	@Override
	public void ekle(Personel personel) {
		sqlKodu = "INSERT INTO personel (adi, soyadi, tecrube) VALUES (?,?,?)";
		Connection baglanti = null;
		try {
			baglanti = veriKaynagi.getConnection();
			PreparedStatement prs;
			prs = baglanti.prepareStatement(sqlKodu);
			prs.setString(1, personel.getAdi());
			prs.setString(2, personel.getSoyadi());
			prs.setInt(3, personel.getTecrube());
			prs.executeUpdate();
			prs.close();
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}finally {
			if(baglanti != null) {
				try {
					baglanti.close();
				}
				catch(SQLException e) {
					
				}
			}
		}
	}

	@Override
	public Personel idAra(int id) {
		
		sqlKodu = "SELECT * FROM personel WHERE id = ?";
		
		try {
			baglanti = veriKaynagi.getConnection();
			PreparedStatement prs;
			prs = baglanti.prepareStatement(sqlKodu);
			prs.setInt(1, id);
			Personel personel = null;
			ResultSet rs = prs.executeQuery();
			if(rs.next()){
				personel = new Personel(
				rs.getInt("id"),
				rs.getString("adi"),
				rs.getString("soyadi"),
				rs.getInt("tecrube")
				);
			}
			rs.close();
			prs.close();
			return personel;
			
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}finally {
			if(baglanti != null) {
				try {
					baglanti.close();
				}catch(SQLException e) {}
			}
		}
	}

	@Override
	public Personel adiAra(String adi) {
		
		sqlKodu = "SELECT * FROM personel WHERE adi = ?";
		
		try {
			baglanti = veriKaynagi.getConnection();
			PreparedStatement prs;
			prs = baglanti.prepareStatement(sqlKodu);
			prs.setString(1, adi);
			Personel personel = null;
			ResultSet rs = prs.executeQuery();
			if(rs.next()){
				personel = new Personel(
				rs.getInt("id"),
				rs.getString("adi"),
				rs.getString("soyadi"),
				rs.getInt("tecrube")
				);
			}
			rs.close();
			prs.close();
			return personel;
			
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}finally {
			if(baglanti != null) {
				try {
					baglanti.close();
				}catch(SQLException e) {}
			}
		}
	}

	@Override
	public Personel soyadiAra(String soyadi) {
		
		sqlKodu = "SELECT * FROM personel WHERE soyadi = ?";
		
		try {
			baglanti = veriKaynagi.getConnection();
			PreparedStatement prs;
			prs = baglanti.prepareStatement(sqlKodu);
			prs.setString(1, soyadi);
			Personel personel = null;
			ResultSet rs = prs.executeQuery();
			if(rs.next()){
				personel = new Personel(
				rs.getInt("id"),
				rs.getString("adi"),
				rs.getString("soyadi"),
				rs.getInt("tecrube")
				);
			}
			rs.close();
			prs.close();
			return personel;
			
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}finally {
			if(baglanti != null) {
				try {
					baglanti.close();
				}catch(SQLException e) {}
			}
		}
	}

	@Override
	public Personel tecrubeAra(int tecrube) {
		
		sqlKodu = "SELECT * FROM personel WHERE tecrube = ?";
		
		try {
			baglanti = veriKaynagi.getConnection();
			PreparedStatement prs;
			prs = baglanti.prepareStatement(sqlKodu);
			prs.setInt(1, tecrube);
			Personel personel = null;
			ResultSet rs = prs.executeQuery();
			if(rs.next()){
				personel = new Personel(
				rs.getInt("id"),
				rs.getString("adi"),
				rs.getString("soyadi"),
				rs.getInt("tecrube")
				);
			}
			rs.close();
			prs.close();
			return personel;
			
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}finally {
			if(baglanti != null) {
				try {
					baglanti.close();
				}catch(SQLException e) {}
			}
		}
	}
}
