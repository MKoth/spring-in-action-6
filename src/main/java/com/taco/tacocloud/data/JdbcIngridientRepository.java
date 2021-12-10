package com.taco.tacocloud.data;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.taco.tacocloud.Ingridient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcIngridientRepository implements IngridientRepository {

    private JdbcTemplate jdbc;
    
    @Autowired
    public JdbcIngridientRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public Iterable<Ingridient> findAll() {
        return jdbc.query("select id, name, type from Ingridient", this::mapRowToIngridient);
    }

    @Override
    public Ingridient findOne(String id) {
        return jdbc.queryForObject("select id, name, type from Ingridient where id = ?", this::mapRowToIngridient, id);
    }

    @Override
    public Ingridient save(Ingridient ingridient) {
        jdbc.update("insert into Ingridient (id, name, type) values (?, ?, ?)",
            ingridient.getId(),
            ingridient.getName(),
            ingridient.getType()
        );
        return ingridient;
    }

    private Ingridient mapRowToIngridient(ResultSet rs, int rowNum) throws SQLException {
        return new Ingridient(
            rs.getString("id"),
            rs.getString("name"),
            Ingridient.Type.valueOf(rs.getString("type"))
        );
    }
}
