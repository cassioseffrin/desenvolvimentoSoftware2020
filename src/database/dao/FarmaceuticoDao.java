package database.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import backend.farmacia.Farmaceutico;
import database.DatabaseMySQL;

/**
 *
 * @author cassioseffrin
 */
public final class FarmaceuticoDao {

	private Connection connection;

	public void setConnection(Connection con) {
		this.connection = con;
	}

	public FarmaceuticoDao() {
		Connection con = DatabaseMySQL.getConnection();
		setConnection((Connection) con);
	}

	public boolean inserir(Farmaceutico ea) {
		String sql = "INSERT INTO farmaceutico( nome,  cpf ) VALUES(?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, ea.getNome());
//	            stmt.setString(2, ea.getSobreNome());
			stmt.setString(2, ea.getCpf());
//	            stmt.setString(4, farmaceutico.getSexo());
//	            stmt.setDouble(5, farmaceutico.getSalarioMensal());
			stmt.execute();
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(FarmaceuticoDao.class.getName()).log(Level.SEVERE, null, ex);
			return false;
		}
	}

	public boolean remover(Integer id) {
		String sql = "DELETE FROM farmaceutico WHERE id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.execute();
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(FarmaceuticoDao.class.getName()).log(Level.SEVERE, null, ex);
			return false;
		}
	}

	public List<Farmaceutico> listar() {
		String sql = "SELECT * FROM farmaceutico";
		List<Farmaceutico> lista = new ArrayList<>();
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet resultado = stmt.executeQuery();
			while (resultado.next()) {
				Farmaceutico f1 = new Farmaceutico("Cassio", "234234", "asd2342", 23, "pis234234", "pasep234234",
						"Cart23234234", "anvisa23q4");

				lista.add(f1);
			}
		} catch (SQLException ex) {
			Logger.getLogger(FarmaceuticoDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return lista;
	}

	public boolean atualizar(Farmaceutico farmaceuticoSelecionado) {
		String sql = "UPDATE farmaceutico SET nome=?  WHERE id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, farmaceuticoSelecionado.getNome());

			stmt.execute();
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(FarmaceuticoDao.class.getName()).log(Level.SEVERE, null, ex);
			return false;
		}
	}
}