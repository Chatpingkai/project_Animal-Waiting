package back;
import java.sql.*;

public interface Connec {
    public abstract ResultSet getData(String sql);
    public abstract void UpdateData(String sql);
    public abstract void Discon();

}
