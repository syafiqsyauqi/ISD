import java.util.*;
 class Employee {
    private int nip;
    private String nama;
    private String div;

    Employee(int nip, String nama, String div){
        this.nip = nip;
        this.nama = nama;
        this.div = div;
    }
    public int getNip(){
        return nip;
    }
    public String getNama(){
        return nama;
    }
    public String getDiv(){
        return div;
    }
    public String toString(){
        return (" Nip:"+ nip + "|" + " Nama : "+ nama + "|" +" Divisi :" + div);
    }
}    
public class DataPegawai{
    public static void main(String[] agrs){
        Collection<Employee> c = new ArrayList<Employee>();
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int pilih;
        do{
            System.out.println("PILIH MENU");
            System.out.println("1.INPUT DATA");
            System.out.println("2.CETAK DATA");
            System.out.println("3.HAPUS DATA");
            System.out.println("4.KELUAR");
            pilih = input.nextInt();
            switch(pilih){it
                case 1:
                    System.out.print("NIP :");
                    int nip = input.nextInt();
                    System.out.print("NAMA :");
                    String nama = input2.nextLine();
                    System.out.print("DIVISI PEGAWAI :");
                    String div = input2.nextLine();
                    c.add(new Employee(nip,nama,div));
                break;
                case 2:
                    System.out.println(c);
                break;
                case 3:
                   Boolean Data = false;
                    System.out.println("MASUKAN NIP YANG INGIN DI HAPUS*jika nip di hapus maka nama dan divisi juga terhapus : ");
                    Iterator <Employee> i = c.iterator();
                    nip = input.nextInt();
                    i = c.iterator();
                    while(i.hasNext()){
                        Employee e = i.next();
                        if(e.getNip()==nip){
                            i.remove();
                            Data = true;
                        }
                    }
                    if(!Data){
                        System.out.println("Data Not Found");
                    }else{
                        System.out.println("Data Sukses Di Hapus");
                    }
                break;
            }
        }while(pilih!=4);
    }
}