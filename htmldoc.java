import java.io.*;

class htmldoc{
    public static PrintStream source;
    public static void CreateHTML(String Path,String file,String title,String metaTags)throws FileNotFoundException{
        
       source = new PrintStream(new File(Path + file));
        source.println("<!DOCTYPE html><html><head><title>"+ title +"<title>"+ metaTags + "</head><body>" );
        
    }
    public static void AddHTML(String code){
        source.println(code);
    }
    public static void CloseHTML(String file,String title)throws FileNotFoundException{
       source.println("</body></html>"); 
       source.close();
        
    }

    

}