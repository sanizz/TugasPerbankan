    import java.io.*;
    import javax.swing.JOptionPane;
    class tabungan {
    String bank;
    String nama_nasabah;
    String rekening;
    int nabung;
    int penarikan;


    void saldo2() {
    JOptionPane.showMessageDialog(null,"SALDO ANDA = "+ (nabung - penarikan));
    }

    }
    public class tugasperbankan {
    static BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] bank) throws Exception {
    tabungan t;
    t= new tabungan();
    JOptionPane.showMessageDialog(null, "SELAMAT DATANG DI BANK SEDERHANA","WELCOME",
    JOptionPane.INFORMATION_MESSAGE);
    boolean status = false;
    int kembali=0;
    
    System.out.println();
    System.out.println("+===============================================+");
    System.out.println("+=================BANK SEDERHANA================+");
    System.out.println("+=======ICHSAN MUIS & FURIANSYAH DIPRAJA========+");
    System.out.println();
    System.out.println("+____________________*MENU*_____________________+");
    System.out.println("| 1. MENAMBUNG |");
    System.out.println("| 2. PENARIKAN |");
    System.out.println("| 3. CEK SALDO |");
    System.out.println("| 4. VIEW DATA |");
    System.out.println("| 5. EXIT |");
    System.out.println("+_______________________________________________+");
    System.out.println();
    

    
    }
    }



