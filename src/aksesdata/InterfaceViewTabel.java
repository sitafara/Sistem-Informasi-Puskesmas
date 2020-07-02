/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aksesdata;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public interface InterfaceViewTabel {
    public DefaultTableModel viewTabel() throws SQLException;
}
