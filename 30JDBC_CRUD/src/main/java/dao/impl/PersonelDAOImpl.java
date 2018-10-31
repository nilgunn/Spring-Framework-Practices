package dao.impl;

import dao.PersonelDAO;
import enterprise.Personel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.*;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

@SuppressWarnings({ "unhecked", "rawtypes" })
public class PersonelDAOImpl implements PersonelDAO {

	private DataSource veriKaynagi;

	public DataSource getVeriKaynagi() {
		return veriKaynagi;
	}

	public void setVeriKaynagi(DataSource veriKaynagi) {
		this.veriKaynagi = veriKaynagi;
	}

	@Override
	public void createOlustur1(Personel personel) {
		String sorgu = "INSERT INTO personel (adi, soyadi, tecrube) VALUES(?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = veriKaynagi.getConnection();
			ps = con.prepareStatement(sorgu);
			ps.setString(1, personel.getAdi());
			ps.setString(2, personel.getSoyadi());
			ps.setInt(3, personel.getTecrube());

			int durum = ps.executeUpdate();
			if (durum != 0) {
				System.out.println("id değeri" + personel.getId() + " olan kayıt eklendi. \n");
			} else {
				System.err.println("id değeri" + personel.getId() + " olan kayıt eklenmedi. \n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void createOlustur2(Personel personel) {
		String sorgu = "INSERT INTO personel (adi, soyadi, tecrube) VALUES(?,?,?)";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(veriKaynagi);

		Object[] args = new Object[] { personel.getAdi(), personel.getSoyadi(), personel.getTecrube() };
		int durum = jdbcTemplate.update(sorgu, args);

		if (durum != 0) {
			System.out.println("id değeri" + personel.getId() + " olan kayıt eklendi. \n");
		} else {
			System.err.println("id değeri" + personel.getId() + " olan kayıt eklenmedi. \n");
		}
	}

	@Override
	public Personel readOku1(int id) {

		String sorgu = "SELECT * FROM personel WHERE id = ?";
		Personel personel = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = veriKaynagi.getConnection();
			ps = con.prepareStatement(sorgu);
			ps.setInt(1, id);
			rs = ps.executeQuery();

			if (rs.next()) {
				personel = new Personel();
				personel.setAdi(rs.getString("adi"));
				personel.setSoyadi(rs.getString("soyadi"));
				personel.setTecrube(rs.getInt("tecrube"));

				System.out.println("ID : " + rs.getInt("id") + " - ADI SOYADI : " + rs.getString("adi") + " "
						+ rs.getString("soyadi") + " - İŞ TECRÜBESİ : " + rs.getInt("tecrube") + " yıl\n");
			} else {
				System.err.println("id değeri" + id + " olan kayıt bulunamadı.\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return personel;
	}

	@Override
	public Personel readOku2(int id) {
		String sorgu = "SELECT * FROM personel WHERE id = '?'";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(veriKaynagi);
		try {
			Personel personel = jdbcTemplate.queryForObject(sorgu, new Object[] { id }, new RowMapper<Personel>() {
				@Override
				public Personel mapRow(ResultSet rs, int rowNum) throws SQLException {
					Personel personel = new Personel();
					personel.setId(rs.getInt("id"));
					personel.setAdi(rs.getString("adi"));
					personel.setSoyadi(rs.getString("soyadi"));
					personel.setTecrube(rs.getInt("tecrube"));

					System.out.println("ID : " + rs.getInt("id") + " - ADI SOYADI : " + rs.getString("adi") + " "
							+ rs.getString("soyadi") + " - İŞ TECRÜBESİ : " + rs.getInt("tecrube") + " yıl\n");
					return personel;
				}
			});
			return personel;
		} catch (Exception e) {
			System.out.println("null \n");
			return null;
		}
	}

	@Override
	public void updateGuncelle1(Personel personel, int id) {

		String sorgu = " UPDATE personel SET adi = ?, soyadi = ?, tecrube = ? WHERE id = ? ";
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = veriKaynagi.getConnection();
			ps = con.prepareStatement(sorgu);
			ps.setString(1, personel.getAdi());
			ps.setString(2, personel.getSoyadi());
			ps.setInt(3, personel.getTecrube());
			ps.setInt(4, id);

			System.out.println("ID : " + id + " - ADI SOYADI : " + personel.getAdi() + " " + personel.getSoyadi()
					+ " - İŞ TECRÜBESİ : " + personel.getTecrube() + " yıl\n");

			int durum = ps.executeUpdate();
			if (durum != 0) {
				System.out.println("id değeri" + id + " olan kayıt güncellendi. \n");
			} else {
				System.err.println("id değeri" + id + " olan kayıt güncellenemedi. \n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void updateGuncelle2(Personel personel, int id) {

		String sorgu = " UPDATE personel SET adi = ?, soyadi = ?, tecrube = ? WHERE id = ? ";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(veriKaynagi);

		Object[] args = new Object[] { personel.getAdi(), personel.getSoyadi(), personel.getTecrube(), id };
		int durum = jdbcTemplate.update(sorgu, args);
		if (durum != 0) {
			System.out.println("id değeri" + id + " olan kayıt güncellendi. \n");
		} else {
			System.err.println("id değeri" + id + " olan kayıt güncellenemedi. \n");
		}
	}

	@Override
	public void deleteSil1(int id) {
		String sorgu = " DELETE FROM personel WHERE id = ? ";
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = veriKaynagi.getConnection();
			ps = con.prepareStatement(sorgu);
			ps.setInt(1, id);

			int durum = ps.executeUpdate();
			if (durum != 0) {
				System.out.println("id değeri" + id + " olan kayıt silindi. \n");
			} else {
				System.err.println("id değeri" + id + " olan kayıt silinemedi. \n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void deleteSil2(int id) {
		String sorgu = " DELETE FROM personel WHERE id = ? ";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(veriKaynagi);

		int durum = jdbcTemplate.update(sorgu, id);
		if (durum != 0) {
			System.out.println("id değeri" + id + " olan kayıt silindi. \n");
		} else {
			System.err.println("id değeri" + id + " olan kayıt silinemedi. \n");
		}

	}

	@Override
	public List<Personel> getAllHepsiniGetir1() {
		String sorgu = " SELECT * FROM personel ";
		List<Personel> personelListesi = new ArrayList<Personel>();

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = veriKaynagi.getConnection();
			ps = con.prepareStatement(sorgu);
			rs = ps.executeQuery();

			while (rs.next()) {
				Personel personel = new Personel();
				personel.setId(rs.getInt("id"));
				personel.setAdi(rs.getString("adi"));
				personel.setSoyadi(rs.getString("soyadi"));
				personel.setTecrube(rs.getInt("tecrube"));
				personelListesi.add(personel);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return personelListesi;
	}

	@Override
	public List<Personel> getAllHepsiniGetir2() {

		String sorgu = " SELECT * FROM personel ";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(veriKaynagi);
		List<Personel> personelListesi = new ArrayList<Personel>();
		List<Map<String, Object>> personelKayıtlar = jdbcTemplate.queryForList(sorgu);

		for (Map<String, Object> personelKayıt : personelKayıtlar) {
			Personel personel = new Personel();
			personel.setId(Integer.parseInt(String.valueOf(personelKayıt.get("id"))));
			personel.setAdi(String.valueOf(personelKayıt.get("adi")));
			personel.setSoyadi(String.valueOf(personelKayıt.get("soyadi")));
			personel.setTecrube(Integer.parseInt(String.valueOf(personelKayıt.get("tecrube"))));

			personelListesi.add(personel);
		}

		return personelListesi;
	}

}
