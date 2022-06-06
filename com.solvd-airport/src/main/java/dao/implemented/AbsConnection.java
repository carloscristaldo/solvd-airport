package dao.implemented;

import util.ConnectionPool;

import java.sql.Connection;

public abstract class AbsConnection {

    public Connection getConnection(){return ConnectionPool.getInstance().getConnection();
    }

    public void returnConnection(Connection con){
        ConnectionPool.getInstance().returnConnection(con);
    }
}
