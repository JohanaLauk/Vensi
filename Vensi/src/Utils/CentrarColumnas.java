package Utils;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class CentrarColumnas extends DefaultTableCellRenderer
{
    DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();    
       
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
            
        table.getColumnModel().getColumn(0).setCellRenderer(tcr);
        table.getColumnModel().getColumn(2).setCellRenderer(tcr);
        table.getColumnModel().getColumn(3).setCellRenderer(tcr);
        table.getColumnModel().getColumn(4).setCellRenderer(tcr);
        table.getColumnModel().getColumn(5).setCellRenderer(tcr);
        table.getColumnModel().getColumn(6).setCellRenderer(tcr);
        table.getColumnModel().getColumn(7).setCellRenderer(tcr);
        table.getColumnModel().getColumn(8).setCellRenderer(tcr);
        table.getColumnModel().getColumn(9).setCellRenderer(tcr);
        table.getColumnModel().getColumn(10).setCellRenderer(tcr);
        
        return super.getTableCellRendererComponent(table, value, hasFocus, hasFocus, row, column);
    }            
}