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
    public class nasabah2 {
    static BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] bank) throws Exception {
    tabungan t;
    t= new tabungan();
    JOptionPane.showMessageDialog(null, "SELAMAT DATANG DI BANK VIRTUAL","WELCOME",
    JOptionPane.INFORMATION_MESSAGE);
    boolean status = false;
    int kembali=0;
    while (kembali!=1){
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
    System.out.print("Silahkan Masukan Pilihan Anda : ");
    int pilihan=Integer.parseInt(input.readLine());
    switch(pilihan){
    case 1:
    JOptionPane.showMessageDialog(null,"SILAHKAN MASUKAN DATA ANDA");
    t.nama_nasabah = String.valueOf(JOptionPane.showInputDialog("NAMA NASABAH"));
    t.rekening = String.valueOf(JOptionPane.showInputDialog("NO REKENING"));
    t.nabung = Integer.valueOf(JOptionPane.showInputDialog("MENABUNG"));
    status = true;
    System.out.println("________________________________________________");
    System.out.println();
    System.out.println("Tekan Enter Untuk Kembali.....");
    String case1=input.readLine();
    kembali=0;
    break;

    case 2:
    if (status == true){
    int result = JOptionPane.showConfirmDialog(null,"APAKAH ANDA INGIN MELAKUKAN PENARIKAN... ?",
    "KONFIRMASI",
    JOptionPane.OK_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE);

    String message;
    if (result == JOptionPane.OK_OPTION)
    t.penarikan = Integer.valueOf(JOptionPane.showInputDialog("LAKUKAN PENARIKAN"));

    else if (result == JOptionPane.CANCEL_OPTION)
    message="anda memilih cancel";
    }
    else{
    JOptionPane.showMessageDialog(null,"MAAF TABUNGAN ANDA TIDAK ADA","PERHATIAN",
    JOptionPane.WARNING_MESSAGE);

    }
    break;

    case 3:
    int result2 = JOptionPane.showConfirmDialog(null,"APAKAH ANDA INGIN MELAKUKAN CEK SALDO.. ?",
    "KONFIRMASI",
    JOptionPane.OK_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE);
    String message;
    if (result2 == JOptionPane.OK_OPTION){
    t.saldo2();
    }
    else if (result2 == JOptionPane.CANCEL_OPTION)
    message ="anda memilih cancel";
    break;

    case 4:
    int result3 = JOptionPane.showConfirmDialog(null,"APAKAH ANDA INGIN MELIHAT DATA TRANSAKSI ?",
    "KONFIRMASI",
    JOptionPane.OK_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE);
    String message3;
    if (result3 == JOptionPane.OK_OPTION){
    JOptionPane.showMessageDialog(null,
    "NAMA NASABAH :"+t.nama_nasabah+"\n"+
    "REKENING :"+t.rekening+"\n"+
    "NABUNG :"+t.nabung+"\n"+
    "PENARIKAN :"+t.penarikan);

    }
    else if(result3 == JOptionPane.CANCEL_OPTION)
    message3="anda memilih cancel";
    break;

    case 5:
    JOptionPane.showMessageDialog(null,"TERIMA KASIH TELAH BERTRANSAKSI DI BANK KAMI"+
    "\nSEMOGA ANDA PUAS");
    System.exit(0);
    break;



    }
    }
    }


}
