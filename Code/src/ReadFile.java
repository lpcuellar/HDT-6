//package src;
import java.util.*;
import java.io.*;

public class ReadFile {

  public void readFile(String location) throws Exception{

    String path = location;
    FileReader file = new FileReader(path);
    BufferedReader reader = new BufferedReader(file);
    ArrayList<String> text = new ArrayList<String>();
    String line = reader.readLine();

    while(line != null) {
      text.add(line);
      line = reader.readLine();
    }

    Object[] Text = text.toArray();
    for (int i = 0;i < text.size(); i++) {
      System.out.println(Text[i]);
    }

    reader.close();
  }
}
