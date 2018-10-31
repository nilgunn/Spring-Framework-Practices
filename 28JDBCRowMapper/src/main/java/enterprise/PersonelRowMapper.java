package enterprise;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonelRowMapper implements RowMapper<Personel> {

	@Override
	public Personel mapRow(ResultSet rs, int rownum) throws SQLException {
		Personel personel = new Personel();
		personel.setId(rs.getInt("id"));
		personel.setAdi(rs.getString("adi"));
		personel.setSoyadi(rs.getString("soyadi"));
		personel.setTecrube(rs.getInt("tecrube"));
		return personel;
	}
}
