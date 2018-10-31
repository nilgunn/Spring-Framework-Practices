package dao.impl;

import dao.PersonelDAO;
import enterprise.Personel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.*;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@SuppressWarnings({ "unhecked", "rawtypes" })
public class PersonelDAOImpl implements PersonelDAO {

	private JdbcTemplate jdbcTemplate;
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
		
		sqlKodu = "INSERT INTO personel (id, adi, soyadi, tecrube) VALUES (?,?,?,?)";
		
		jdbcTemplate = new JdbcTemplate(veriKaynagi);
		jdbcTemplate.update(sqlKodu, new Object[] {personel.getId(), personel.getAdi(), personel.getSoyadi(), personel.getTecrube() });
		
	}

	@Override
	public Personel idAra(int id) {

		sqlKodu = "SELECT * FROM personel WHERE id = ?";

		jdbcTemplate = new JdbcTemplate(veriKaynagi);
		Personel personel = (Personel) jdbcTemplate.queryForObject(sqlKodu, new Object[] { id },
				new BeanPropertyRowMapper(Personel.class));
		return personel;

	}
	
	public Personel adiAra(String adi) {

		sqlKodu = "SELECT * FROM personel WHERE adi = ?";

		jdbcTemplate = new JdbcTemplate(veriKaynagi);
		Personel personel = (Personel) jdbcTemplate.queryForObject(sqlKodu, new Object[] { adi },
				new BeanPropertyRowMapper(Personel.class));
		return personel;
	}


	public Personel soyadiAra(String soyadi) {

		sqlKodu = "SELECT * FROM personel WHERE soyadi = ?";

		jdbcTemplate = new JdbcTemplate(veriKaynagi);
		Personel personel = (Personel) jdbcTemplate.queryForObject(sqlKodu, new Object[] { soyadi },
				new BeanPropertyRowMapper(Personel.class));
		return personel;
	}


	@Override
	public Personel tecrubeAra(int tecrube) {

		sqlKodu = "SELECT * FROM personel WHERE tecrube = ?";

		jdbcTemplate = new JdbcTemplate(veriKaynagi);
		Personel personel = (Personel) jdbcTemplate.queryForObject(sqlKodu, new Object[] { tecrube },
				new BeanPropertyRowMapper(Personel.class));
		return personel;
	}

	@Override
	public List<Personel> butunKayitlariAra() {
		
		jdbcTemplate = new JdbcTemplate(veriKaynagi);
		String sql = "SELECT * FROM personel";
		List<Personel> personelListesi = new ArrayList<Personel>();
		List<Map<String, Object>> satirlar = jdbcTemplate.queryForList(sql);
		
		for(Map satir : satirlar) {
			Personel personel = new Personel();
			personel.setId(Integer.parseInt(String.valueOf(satir.get("id"))));
			personel.setAdi((String)satir.get("adi"));
			personel.setSoyadi((String)satir.get("soyadi"));
			personel.setTecrube(Integer.parseInt(String.valueOf(satir.get("tecrube"))));
			personelListesi.add(personel);
		}
		
		return personelListesi;
		
	}

	@Override
	public String idDegeriyleStringBirVeriyiCekme(int id) {
		
		jdbcTemplate = new JdbcTemplate(veriKaynagi);
		
		String sql = "SELECT soyadi FROM personel WHERE id = ?";
		
		String sonuc = (String)jdbcTemplate.queryForObject(sql, new Object[] {id}, String.class);
		return sonuc;
	}
	
}