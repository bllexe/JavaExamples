package org.example.FileExam.readWriteFile;


import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

        String myHost="MyHost.txt";
        String hosts="hosts";

        LinkedHashMap<String,String> hostMap=new LinkedHashMap<>();

        try {
            BufferedReader br=new BufferedReader(new FileReader(myHost));
            String line;
            while ((line=br.readLine()) !=null){
                line=line.trim();
                if (!line.isEmpty()){
                    String [] tokens=line.split("\\s+");
                    hostMap.put(tokens[1],tokens[0]);
                }
            }
            br.close();

            br=new BufferedReader(new FileReader(hosts));
            while ((line= br.readLine()) !=null){
                line=line.trim();
                if (!line.isEmpty()){
                    String [] tokens=line.split("\\s+");
                    hostMap.put(tokens[1],tokens[0]);
                }
            }
            br.close();

            PrintWriter pw=new PrintWriter(new FileWriter(hosts));
            for (Map.Entry entry :hostMap.entrySet()){
                pw.println(entry.getValue() + " " +entry.getKey());
            }

            pw.close();

            System.out.println("Hosts dosyasi guncellendi...");

            pw.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
