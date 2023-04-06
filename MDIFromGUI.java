import java.awt.*;
import javax.swing.*;
public class MDIFromGUI extends JFrame{
    private JFrame fr;
    private JPanel p;
    private JMenuBar  mb;
    private JMenu m1, m2, m3, ms1;
    private JMenuItem mi2, mi3, mi4, msi1, msi2;
    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2, frame3;
    public MDIFromGUI() {
    fr = new JFrame("MDIFromGUI");
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mb = new JMenuBar();
    m1 = new JMenu("File");
    m2 = new JMenu("Edit");
    m3 = new JMenu("View");
    fr.setJMenuBar(mb);
    mb.add(m1); mb.add(m2); mb.add(m3);
    ms1 = new JMenu("New");
    mi2 = new JMenuItem("Open");
    mi3 = new JMenuItem("Save");
    mi4 = new JMenuItem("Exit");
    m1.add(ms1);
    m1.add(mi2);
    m1.addSeparator();
    m1.add(mi3);
    m1.addSeparator();
    m1.add(mi4);
    msi1 = new JMenuItem("Window");
    msi2 = new JMenuItem("Message");
    ms1.add(msi1);
    ms1.add(msi2);
    //DesktopPane
    desktopPane = new JDesktopPane();
    frame1 = new JInternalFrame("Application01", true, true, true, true);
    frame2 = new JInternalFrame("Application02", true, true, true, true);
    frame3 = new JInternalFrame("Application03", true, true, true, true);
    //JInternalFrame
    frame1.getContentPane();
    frame1.pack();
    frame1.setVisible(true);
    
    frame2.getContentPane();
    frame2.pack();
    frame2.setVisible(true);
    
    frame3.getContentPane();
    frame3.pack();
    frame3.setVisible(true);
    
    int x2 = frame1.getX() + frame1.getWidth() + 10;
    int y2 = frame1.getY();
    frame2.setLocation(x2, y2);
    
    int x3 = frame1.getX() + frame1.getWidth() + 20;
    int y3 = frame1.getY();
    frame3.setLocation(x3, y3);
    
    desktopPane.add(frame1);
    desktopPane.add(frame2);
    desktopPane.add(frame3);

    fr.add(desktopPane, BorderLayout.CENTER);
    fr.setMinimumSize(new Dimension(300, 300));
    fr.setSize(300, 300);
    fr.setVisible(true);
    
}
}
