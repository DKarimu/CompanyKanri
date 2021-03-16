package company1;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Tools {

    public static void msgBox(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public static boolean ConfirmMsg(String message) {
        int msgC = JOptionPane.showConfirmDialog(null, message);
        if (msgC == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }

    public static void CreateFolder(String folderName, String path) {
        File f = new File(path = "/" + folderName);
        f.mkdir();
    }

    public static void CreateFolder(String folderName) {
        File f = new File(folderName);
        f.mkdir();
    }

    public static void openFormImage(JFrame form) {
        try {
            form.setLocationRelativeTo(null);
            Image img = ImageIO.read(Tools.class.getResource("emp.png"));
            form.setIconImage(img);
            form.setDefaultCloseOperation(2);
            form.setVisible(true);
        } catch (IOException ex) {
            msgBox(ex.getMessage());
        }
    }

    public static void openForm(JFrame form) {
        form.setVisible(true);
        form.setLocationRelativeTo(null);
    }

    public static void clearText(Container form) {
        for (Component c : form.getComponents()) {
            if (c instanceof JTextField) {
                JTextField txt = (JTextField) c;
                txt.setText("");
            } else if (c instanceof Container) {
                clearText((Container) c);
            }
        }
    }

    public static void createEmptyFile(String fileName) {
        try {
            File f = new File(fileName);
            f.createNewFile();
        } catch (IOException ex) {
            msgBox(ex.getMessage());
        }
    }

    public static void createEmptyFiles(String fileNames[]) {
        for (String str : fileNames) {
            createEmptyFile(str);
        }
    }

    public static void createFile(String fileName, Object data[]) {
        try {
            PrintWriter p = new PrintWriter(fileName);
            for (Object obj : data) {
                p.println(obj);
            }
            p.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void craeteFiles(String fileNames[], Object allData[][]) {
        for (int x = 0; x < fileNames.length; x++) {
            createFile(fileNames[x], allData[x]);
        }
    }

    public static Object InputBox(String title) {
        Object myObj = JOptionPane.showInputDialog(title);
        return myObj;
    }

    public static String getNumber(String text) {
        String val = "";
        for (char c : text.toCharArray()) {
            if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
                val += c;
            }
        }
        return val;
    }

    public static int getNumberToIntegaer(String text) {
        String val = "";
        for (char c : text.toCharArray()) {
            if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
                val += c;
            }
        }
        return Integer.parseInt(val);
    }

    public static String removeNumber(String text) {
        String val = "";
        for (char c : text.toCharArray()) {
            if (!(c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9')) {
                val += c;
            }
        }
        return val;
    }

    public static void printScrin(String Imagname) {
        try {
            // Robot r = new Robot();
            // Rectangle rec = new Rectangle (Toolkit.getDefaultToolkit().getImage()); 
            //BufferedImage img = r,createScreencapture(rec);
            //ImageIO.write(img."jpg",new File(Imagename+"jpg "));
        } catch (Exception ex) {
            msgBox(ex.getMessage());
        }
    }

    public static void printScrin(String Imagname, JFrame form) {
        try {
            form.setState(1);
            // Robot r = new Robot();
            // Rectangle rec = new Rectangle (Toolkit.getDefaultToolkit().getImage()); 
            //BufferedImage img = r,createScreencapture(rec);
            //ImageIO.write(img."jpg",new File(Imagename+"jpg "));
            form.setState(0);
        } catch (Exception ex) {
            msgBox(ex.getMessage());
        }
    }

    public static class StrinTools {

        private static String inverseTaxt;

        public static void printCharByChar(String text) {
            for (char c : text.toCharArray()) {
                System.out.println(c);
            }
        }
    }

    public static void printCharByCharInverse(String text) {
        StringBuilder sb = new StringBuilder(text);
        String inverseText = sb.reverse().toString();
        for (char c : inverseText.toCharArray()) {
            System.out.println(c);
        }
    }

    public class Table {

        public int columns;
        public Object[][] Items;

        public Table(int columns) {
            this.columns = columns;
            Items = new Object[0][columns];
        }

        public void AddNewRow(Object row[]) {
            Object tempItems[][] = Items;
            Items = new Object[Items.length + 1][columns];
            for (int x = 0; x < tempItems.length; x++) {
                Items[x] = tempItems[x];
            }
            Items[Items.length - 1] = row;
        }

        public void printItems() {
            for (Object objs[] : Items) {
                for (Object obj : objs) {
                    System.out.println(obj + " ; ");
                }
            }
        }

        public void editRow(int rowIndex, int columIndex, Object newData) {
            Items[rowIndex][columIndex] = newData;
        }
    }

    public class MergeArray {

        public Object[] array1;
        public Object[] array2;

        public MergeArray(Object[] array1, Object[] array2) {
            this.array1 = array1;
            this.array2 = array2;
        }

        public Object[] mergTwoArray() {
            int a1 = array1.length;
            int a2 = array2.length;
            Object[] arrayR = new Object[a1 + a2];
            System.arraycopy(array1, 0, arrayR, 0, a1);
            System.arraycopy(array2, 0, arrayR, 0, a2);
            return arrayR;
        }
    }

    public static void setReport(JTable Table) {
        Table.getTableHeader().setReorderingAllowed(false);
        Table.getTableHeader().setBackground(new Color(0, 22, 100));
        Table.getTableHeader().setForeground(Color.white);
    }

    public static void printRapor(JTable Table, String titel) {
        try {
            MessageFormat header = new MessageFormat(titel + "Report");
            MessageFormat footer = new MessageFormat("ページ - {0}");
            Table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (Exception ex) {
            Logger.getLogger(ex.getMessage());
        }
    }
}
