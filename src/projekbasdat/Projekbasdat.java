
package projekbasdat;

import database.Koneksi;
import view.awal;
import java.sql.SQLException;
import java.text.ParseException;

public class Projekbasdat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ParseException{
        new Koneksi();
        awal AWL = new awal();
        new awal().show();
    }
}
