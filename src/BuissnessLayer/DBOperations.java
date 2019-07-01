package BuissnessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ClassLibrary.*;

public class DBOperations {
	String DEFAULT_DRIVER = "org.sqlite.JDBC";
	String DEFAULT_URL = "jdbc:sqlite:data/test.db";
	Connection conn;

	public List<WorldMarket> GetMarketData() throws ClassNotFoundException, SQLException {
		conn = createConnection(DEFAULT_DRIVER, DEFAULT_URL);

		List<WorldMarket> lstWorldMarket = new ArrayList<WorldMarket>();
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery("select * from WorldMarket;");
		while (rs.next()) {
			lstWorldMarket.add(new WorldMarket(rs.getString("name"), rs.getDouble("price"), rs.getDouble("percent")));
		}
		close(stat);
		close(rs);

		return lstWorldMarket;
	}

	public void InsertMarketData(Connection conn, List<WorldMarket> lstWorldMarket)

			throws SQLException {
		PreparedStatement prep = conn.prepareStatement("insert into WorldMarket values (?, ?, ?);");
		for (WorldMarket objWorldMarket : lstWorldMarket) {
			prep.setString(1, objWorldMarket.getStockName());
			prep.setDouble(2, objWorldMarket.getPrice());
			prep.setDouble(3, objWorldMarket.getPercent());
			prep.addBatch();
		}
		conn.setAutoCommit(false);
		prep.executeBatch();
		conn.setAutoCommit(true);
		close(prep);

	}

	public List<MarketSummary> GetMarketSummary() throws ClassNotFoundException, SQLException {
		conn = createConnection(DEFAULT_DRIVER, DEFAULT_URL);

		List<MarketSummary> lstMarketSummary = new ArrayList<MarketSummary>();
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery("select * from MarketSummary;");
		while (rs.next()) {
			lstMarketSummary.add(new MarketSummary(rs.getString("name"), rs.getDouble("low"), rs.getDouble("high"),
					rs.getDouble("open")));
		}
		close(stat);
		close(rs);

		return lstMarketSummary;
	}

	public void InsertMarketSummary(Connection conn, List<MarketSummary> lstMarketSummary) throws SQLException {
		PreparedStatement prep = conn.prepareStatement("insert into MarketSummary values (?, ?, ?, ?);");
		for (MarketSummary objMarketSummary : lstMarketSummary) {
			prep.setString(1, objMarketSummary.getStockName());
			prep.setDouble(2, objMarketSummary.getLow());
			prep.setDouble(3, objMarketSummary.getHigh());
			prep.setDouble(4, objMarketSummary.getOpen());
			prep.addBatch();
		}
		conn.setAutoCommit(false);
		prep.executeBatch();
		conn.setAutoCommit(true);
		close(prep);

	}

	static Connection createConnection(String driver, String url) throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url);
		return conn;
	}

	static void close(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void close(Statement stat) {
		try {
			if (stat != null) {
				stat.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void close(ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
