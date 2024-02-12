package fileworks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writing {

    public static void main(String[] args) throws IOException {
        String Path = "nejakyFiles//LinesbyPrintWriter.txt";
//        FileWriter fw = new FileWriter(Path);
//        fw.write("neco");
//        fw.write('w');
//        fw.close();

//        BufferedWriter bw = new BufferedWriter(new FileWriter(Path));
//        bw.write("dlouuuuuuuhej teeeeext");
//        bw.newLine();
//        for (int i = 0; i < 10_000; i++) {
//            bw.write("Line#" + (i+1));
//            bw.newLine();
//        }
//
//        bw.close();
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(Path)));
        for (int i = 0; i < 10_000; i++) {
            pw.println("Lime#" + (i+1));
        }
        pw.flush();
        pw.println("Hello");
        pw.close();
    }
}
