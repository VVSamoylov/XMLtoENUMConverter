package ru.veniamin.converter.logic;

/**
 *
 * @author venia
 */

import java.io.File;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
public class Converter {
    Document doc;
    File file;
    public Converter(File f) {
        file = f;
    }
    
    private int init(){
        if(file == null){
            JOptionPane.showMessageDialog(null, "Файл не загружен!!", "Ошибка чтения файла!!", JOptionPane.ERROR_MESSAGE);
            return 2;
        }
        try{
           doc =  DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file); 
           
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Не получилось открыть файл XML " + file.getName(), "Ошибка чтения файла", JOptionPane.ERROR_MESSAGE);
            return 2;
        }
        return 0;
    }
    
    public int convert(){
        int res = init();
        if(res == 0){
            File out = new File(System.getProperty("user.dir") + System.getProperty("path.separator") + "out.txt");
        
        
        return res;
        }
        return res;
    }
}
