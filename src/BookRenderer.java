
 
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
 
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
 
public class BookRenderer extends JPanel implements ListCellRenderer<Book> {
 //สร้าง เลเบอร์มา 3 เลเบอร์
    private JLabel lbIcon = new JLabel(); //สำหรับicon
    private JLabel lbName = new JLabel();// สำหรับชื่อหนังสือ
    private JLabel lbAuthor = new JLabel(); // สำหรับลำดับหนังสือ
    private JPanel panelText = new JPanel(new GridLayout(5, 0)); 
    public BookRenderer() {
        setLayout(new BorderLayout(10, 5));
        
        
        panelText.add(lbName);
        panelText.add(lbAuthor);
        add(lbIcon, BorderLayout.WEST);
        add(panelText);
        
    }
 
    @Override
    public Component getListCellRendererComponent(JList<? extends Book> list,
            Book book, int index, boolean isSelected, boolean cellHasFocus) {
       
        
        lbIcon.setIcon(new ImageIcon(
                 book.path()+book.getIconName() + ".PNG")); //เซ็ตiconจากรูป
         lbIcon.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,Color.BLACK)); //ใส่กรอบ
        lbName.setText(book.getName());  //เซ้ทชื่อ
        lbAuthor.setText(book.getAuthor());//เซ็ทลำดับ
        lbAuthor.setForeground(Color.blue);//เซ็ทพื้นหลัง
        if (isSelected) {
            panelText.setBackground(Color.LIGHT_GRAY);//เซ็ทสีเมื่อถูกเลือก
            setBackground(Color.LIGHT_GRAY);
            
        } else {
            panelText.setBackground(list.getBackground());
            setBackground(list.getBackground());
        }
 
        return this;
    }
}