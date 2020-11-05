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
import database.DatabaseMySQLSingleton;

/**
 *
 * @author cassioseffrin
 */
public final class FarmaceuticoDao {

	private Connection connection;

	public void setConnection(Connection con) {
		this.connection = con;
	}

	public void closeConnection() {
		try {
			this.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			Logger.getLogger("Falha ao fechar conexao");
		}
	}

	public FarmaceuticoDao() {
		Connection con = DatabaseMySQLSingleton.getConnection();
		setConnection((Connection) con);
	}

	public boolean inserir(Farmaceutico farmaceutico) {
		String sql = "INSERT INTO farmaceutico( nome,  cpf, rg,   idade,   pis,   pasep,  carteiraTrabalho, registroAnvisa  ) VALUES(?,?, ?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, farmaceutico.getNome());
			stmt.setString(2, farmaceutico.getCpf());
			stmt.setString(3, farmaceutico.getRg());
			stmt.setInt(4, farmaceutico.getIdade());
			stmt.setString(5, farmaceutico.getPis());
			stmt.setString(6, farmaceutico.getPasep());
			stmt.setString(7, farmaceutico.getCarteiraTrabalho());
			stmt.setString(8, farmaceutico.getRegistroAnvisa());

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
				Integer id = resultado.getInt(1);
				String nome = resultado.getString(2);
				String cpf = resultado.getString(3);
				String rg = resultado.getString(4);
				Integer idade = resultado.getInt(5);
				String pis = resultado.getString(6);
				String pasep = resultado.getString(7);
				String carteriaTrabalho = resultado.getString(8);
				String registroAnvisa = resultado.getString(9);
				Farmaceutico f1 = new Farmaceutico(nome, cpf, rg, idade, pis, pasep,
						carteriaTrabalho,registroAnvisa);
				f1.setId(id);
				lista.add(f1);
			}
		} catch (SQLException ex) {
			Logger.getLogger(FarmaceuticoDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return lista;
	}

	public boolean atualizar(Farmaceutico farmaceuticoSelecionado) {
		String sql = "UPDATE farmaceutico SET nome=?, cpf=?, rg=?  WHERE id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, farmaceuticoSelecionado.getNome());
			stmt.setString(2, farmaceuticoSelecionado.getCpf());
			stmt.setString(3, farmaceuticoSelecionado.getRg());
			stmt.setInt(4, farmaceuticoSelecionado.getId());
			stmt.execute();
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(FarmaceuticoDao.class.getName()).log(Level.SEVERE, null, ex);
			return false;
		}
	}
}