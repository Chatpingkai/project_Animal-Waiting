package back;
import java.sql.*;

public interface Connec_table {
    public abstract ResultSet getData(String sql);
    public abstract void UpdateData(String sql);
    public abstract void Discon();
    
}
