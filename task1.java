import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class task1 {
    public static void main(String[] args) {
        NoteBook NB1=new NoteBook("A5",1236,"Xiaomi");
        NB1.setColor("black");
        NB1.setHDD(700);
        NB1.setOS("Windows");
        NB1.setRAM(8);
        
        NoteBook NB2=new NoteBook("ABC30",6467,"Acer");
        NB2.setColor("white");
        NB2.setHDD(1000);
        NB2.setOS("Windows");
        NB2.setRAM(8);

        NoteBook NB3=new NoteBook("AB97",67201,"Acer");
        NB3.setColor("rose");
        NB3.setHDD(900);
        NB3.setOS("Windows");
        NB3.setRAM(16);

        NoteBook NB4=new NoteBook("OMAN11",1111,"hp");
        NB4.setColor("black");
        NB4.setHDD(700);
        NB4.setOS("Linux");
        NB4.setRAM(8);

        NoteBook NB5=new NoteBook("MAC101",8438483,"Apple");
        NB5.setColor("silver");
        NB5.setHDD(1000);
        NB5.setOS("macOS");
        NB5.setRAM(8);

        HashSet <NoteBook> NoteBook = new HashSet<>(Arrays.asList(NB1,NB2,NB3,NB4,NB5));
        HashSet <NoteBook> res = new HashSet<>();

        System.out.println("Здравствуйте");
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while(n!=5){
        if(n==1){
            System.out.println("Введите минимальную оперативную память");
            Integer temp = sc.nextInt();
            sc.nextLine();
            filters.put("RAM", temp);
        }
        if(n==2){
            System.out.println("Введите минимальный объем ЖД" );
            Integer temp = sc.nextInt();
            sc.nextLine();
            filters.put("HDD", temp);
        }
        if(n==3){
            System.out.println("Введите ОС");
            String temp = sc.nextLine();
            filters.put("OS", temp);
        }
        if(n==4){
            System.out.println("Введите цвет");
            String temp = sc.nextLine();
            filters.put("color", temp);
        }
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        n = sc.nextInt();
        sc.nextLine();
    }
        for (Entry<String, Object> entry : filters.entrySet()) {
            if(entry.getKey().equals("RAM")){
                Iterator it = NoteBook.iterator();
                while(it.hasNext()){
                    NoteBook NB = (NoteBook) it.next();
                    if(NB.getRAM()>=(Integer)entry.getValue()){
                        res.add(NB);
                    }
                }
                }
             if(entry.getKey().equals("HDD")){
                Iterator it = NoteBook.iterator();
                while(it.hasNext()){
                    NoteBook NB = (NoteBook)it.next();
                    if(NB.getHDD()>=(Integer)entry.getValue()){
                        res.add(NB);
                        }
                    }
                    }
            if(entry.getKey().equals("OS")){
                Iterator it = NoteBook.iterator();
                while(it.hasNext()){
                    NoteBook NB = (NoteBook)it.next();
                        if(NB.getOS().equals(entry.getValue())){
                            res.add(NB);
                            }
                        }
                        }
            if(entry.getKey().equals("color")){
                Iterator it = NoteBook.iterator();
                while(it.hasNext()){
                    NoteBook NB = (NoteBook)it.next();
                        if(NB.getColor().equals(entry.getValue())){
                            res.add(NB);
                                    }
                                }
                                }
            }
        
            Iterator it = res.iterator();
            while(it.hasNext()){
                NoteBook NB = (NoteBook)it.next();
            System.out.println(NB.toString());
            System.out.println();
        }
        
        
    }
    
}
