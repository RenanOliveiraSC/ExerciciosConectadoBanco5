package AnimaisDao;

import java.sql.Connection;

public class CachorroDAO extends AnimalDAO {

	private final Connection con;

	public CachorroDAO(Connection con) {
		this.con = con;
	}
}