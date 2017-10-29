package kata4.view;
import java.util.*;
import java.io.*;
//import java.io.IOException;
//import java.io.FileNotFoundException;


public class MailListBuilder {

    public static List<String> read(String name) throws IOException {
        List<String>mailList=new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File(name)));
        String mail;
        while((mail = reader.readLine()) != null){
            if(!mail.contains("@")){
                mail = reader.readLine()+1;
            }
            mailList.add(mail);
        }
        reader.close();
        return mailList;

    }

}
