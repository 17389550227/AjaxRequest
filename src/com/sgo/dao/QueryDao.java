package com.sgo.dao;

import com.sgo.entity.Province;

import java.io.FileInputStream;

import java.sql.*;
import java.util.Properties;

/**
 * @author : sgo丶赵泽宏
 * @version : 1.0
 * @create : 2022/8/19 15:38
 * @Description :
 */
public class QueryDao {
    public static Province queryProvince(int id) {
        Properties properties = new Properties();
        Province province1 = null;
        Connection connection = null;
        try {
            properties.load(new FileInputStream("D:\\idea_java_projects\\微软javase阶段\\out\\artifacts\\Ajax_war_exploded\\JDBC.properties"));

            String url = properties.getProperty("jdbc.url");
            String driver = properties.getProperty("jdbc.driver");
            Class.forName(driver);
            connection = DriverManager.getConnection(url,properties);
            String sql = "select * from province where id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int id1 = resultSet.getInt("id");
                String province = resultSet.getString("province");
                String jianchen = resultSet.getString("jianchen");
                String shenghui = resultSet.getString("shenghui");
                province1 = new Province(id1, province, jianchen, shenghui);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return province1;
    }
}
