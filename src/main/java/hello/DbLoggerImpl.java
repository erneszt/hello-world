package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component @Service()
public class DbLoggerImpl implements DbLogger {

    private final JdbcTemplate jdbcTemplate;
    private static final String INSERT = 
            "INSERT INTO LOG (NAME) VALUES (?)";

    @Autowired
    public DbLoggerImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public void store(String name) {
        jdbcTemplate.update(INSERT,name);
    }

}
