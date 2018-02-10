package Utils;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ColorFilas extends DefaultTableCellRenderer
{
    private int columna ;
    
    public ColorFilas (int patronColumna)
    {
        this.columna = patronColumna;
    }
    
    @Override
    public Component getTableCellRendererComponent (JTable table, Object value, boolean selected, boolean focused, int row, int column)
    {        
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
                       
        if (esImpar(row))
        {
            this.setForeground(Color.BLACK);
            this.setBackground(Color.LIGHT_GRAY);
        }
        else
        {
            this.setForeground(Color.BLACK);
            this.setBackground(Color.WHITE);
        }
        
        return this;
    }
    
    public boolean esImpar(int nroFila) 
    {
        if (nroFila%2!=0)
          return true;
        else
          return false;
    }
}