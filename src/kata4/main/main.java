package kata4.main;
import java.io.*;
import java.util.*;
import kata4.view.*;
import kata4.model.*;

public class main {

    private final File archivo = new File ("C:/Users/Usuario/Desktop/Kata4/src/emailsfile.txt");
    private final FileReader fr = new FileReader (archivo);
    private final BufferedReader br = new BufferedReader(fr);
    private final String filename = br.readLine();

    private final List<String> mailList=MailListBuilder.read(filename);
    Histogram<String>histogram=MailHistogramBuilder.built(mailList);
    private HistogramDisplay histoDisplay;

    public main() throws IOException {
        histoDisplay.execute();
    }

}
