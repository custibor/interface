import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class app {

    public static void main(String[] args) {

        JFrame f=new JFrame();//creating instance of JFrame

        JButton b=new JButton("dobi let");//creating instance of JButton
        b.setBounds(130,100,100, 40);//x axis, y axis, width, height

        f.add(b);//adding button in JFrame


        // Frame Size
        f.setSize(500, 200);
        // Frame Visible = true
        String[] columnNames = { "Name", "Roll Number", "Department" };
        DefaultTableModel model = new DefaultTableModel();
        JTable j = new JTable(model);
        model.addColumn("ime leta");
        f.add(j);

        j.setBounds(30, 40, 200, 300);

        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);

        f.setVisible(true);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HTTPClientGet.main();
                model.addRow(new Object[] {"London"});
            }
        });

        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }
}