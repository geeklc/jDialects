import com.github.drinkjava2.jdialects.DDLCreateUtils;
import com.github.drinkjava2.jdialects.Dialect;
import com.github.drinkjava2.jdialects.Type;
import com.github.drinkjava2.jdialects.annotation.jpa.GenerationType;
import com.github.drinkjava2.jdialects.model.ColumnModel;
import com.github.drinkjava2.jdialects.model.TableModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lichong
 * @Description:
 * @Date: 2025/7/21 14:50
 * @Version: 1.0
 */
public class test {


    public static void main(String[] args) {
        Dialect dialect = Dialect.SQLServerDialect;
        TableModel model = new TableModel();
        model.setTableName("users_constant_mysql");
        model.setComment("测试1111");
        ColumnModel c1 = new ColumnModel("id");
        c1.setColumnType(Type.INTEGER);
        c1.setPkey(true);
        c1.setNullable(false);
        c1.setCreateTimestamp(false);
        c1.setUpdatable(false);
        c1.setIdGenerationType(GenerationType.IDENTITY);
        c1.setLength(11);
        c1.setPrecision(0);
        c1.setScale(0);

        ColumnModel c2 = new ColumnModel("username");
        c2.setColumnType(Type.VARCHAR);
        c2.setPkey(false);
        c2.setNullable(true);
        c2.setCreateTimestamp(false);
        c2.setUpdatable(false);
        c2.setIdGenerationType(null);
        c2.setLength(50);
        c2.setPrecision(50);
        c2.setScale(0);

        ColumnModel c3 = new ColumnModel("gender");
        c3.setColumnType(Type.VARCHAR);
        c3.setPkey(false);
        c3.setNullable(true);
        c3.setCreateTimestamp(false);
        c3.setUpdatable(false);
        c3.setIdGenerationType(null);
        c3.setLength(20);
        c3.setPrecision(20);
        c3.setScale(0);

        ColumnModel c4 = new ColumnModel("country");
        c4.setColumnType(Type.CHAR);
        c4.setPkey(false);
        c4.setNullable(true);
        c4.setCreateTimestamp(false);
        c4.setUpdatable(false);
        c4.setIdGenerationType(null);
        c4.setLength(10);
        c4.setPrecision(10);
        c4.setScale(0);
        c4.setDefaultValue("CN");

        ColumnModel c5 = new ColumnModel("created_at");
        c5.setColumnType(Type.TIMESTAMP);
        c5.setPkey(false);
        c5.setNullable(true);
        c5.setCreateTimestamp(false);
        c5.setUpdatable(false);
        c5.setIdGenerationType(null);
        c5.setLength(0);
        c5.setPrecision(0);
        c5.setScale(0);
        c5.setDefaultValue("CURRENT_TIMESTAMP");

        List<ColumnModel> columns = new ArrayList<>();
        columns.add(c1);
        columns.add(c2);
        columns.add(c3);
        columns.add(c4);
        columns.add(c5);
        model.setColumns(columns);
        String[] createDDL = DDLCreateUtils.toCreateDDL(dialect, model);
        System.out.println(createDDL[0]);
    }
}
