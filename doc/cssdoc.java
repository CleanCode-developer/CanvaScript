package doc;
import java.io.*;

class cssdoc{
    public static PrintStream source;
    public static void CreateCSS(String Path,String file)throws FileNotFoundException{
        
       source = new PrintStream(new File(Path + file + ".css"));
    
        
    }
    public static void AddCSS(String code){
        source.println(code);
    }
    public static void CloseCSS()throws FileNotFoundException{
        
       source.close();
        
    }

    

}