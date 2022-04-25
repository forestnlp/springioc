import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJDBC {

    @Test
    public void testGetBean() throws SQLException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring02.xml");
        DruidDataSource dataSource = ctx.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource);
        DruidPooledConnection connection = dataSource.getConnection();
        PreparedStatement psmt = connection.prepareStatement("select * from img");
        ResultSet resultSet = psmt.executeQuery();
        while (resultSet.next()){
            System.out.print(resultSet.getString("topicid"));
            System.out.print(resultSet.getString("imgurl"));
        }
        resultSet.close();
        psmt.close();
        connection.close();
    }
}
