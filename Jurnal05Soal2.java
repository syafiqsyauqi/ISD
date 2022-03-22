import java.util.*;
 class ToDoList {
    private int no;
    private String jadwal;

    ToDoList(int no, String jadwal){
        this.no = no;
        this.jadwal = jadwal;
    }
    public int getNo(){
        return no;
    }
    public String getJadwal(){
        return jadwal;
    }
    public String toString(){
        return (" No:"+ no + "|" + " Jadwal : "+ jadwal );
    }
}    
public class List{
    public static void main(String[] agrs){
        Collection<ToDoList> c = new ArrayList<ToDoList>();
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int pilih;
        do{
            System.out.println("PILIH MENU");
            System.out.println("1.INPUT JADWAL");
            System.out.println("2.PEKERJAAN YG HARUS DI KERJAKAN");
            System.out.println("3.CETAK SEMUA LIST");
            System.out.println("4.HAPUS DATA");
            System.out.println("5.KELUAR");
            pilih = input.nextInt();
            switch(pilih){
                case 1:
                    System.out.print("NO :");
                    int no = input.nextInt();
                    System.out.print("JADWAL :");
                    String jadwal = input2.nextLine();
                    c.add(new ToDoList(no,jadwal));
                break;
                case 2:
                    System.out.println(c);
                case 3:
                    System.out.println(c);
                break;
                case 4:
                   Boolean Data = false;
                    System.out.println("MASUKAN NO JADWAL YANG SUDAH DIKERJAKAN: ");
                    Iterator <ToDoList> i = c.iterator();
                    no = input.nextInt();
                    i = c.iterator();
                    while(i.hasNext()){
                        ToDoList e = i.next();
                        if(e.getNo()==no){
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
        }while(pilih!=5);
    }
}