package services.myBatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import util.Constants;

import java.io.IOException;
import java.io.Reader;

public class AbsSQLSession {

    private static final Logger LOGGER = LogManager.getLogger(AbsSQLSession.class);

    public SqlSession sqlSession(){
        Reader e = null;
        try {
            e = Resources.getResourceAsReader(Constants.MY_BATIS_CONFIG);
        } catch (IOException ex) {
            LOGGER.log(Level.ERROR, "Unable to start session", ex);
        }
        SqlSessionFactory sql = new SqlSessionFactoryBuilder().build(e);
        SqlSession session =sql.openSession();
        return session;


    }
}
