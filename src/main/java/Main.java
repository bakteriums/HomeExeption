import javax.naming.Reference;
import java.util.*;

public class Main {

  
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        String c;
        boolean exit = true;
        while (exit){
            System.out.println("Введите число :");
            c = sc.nextLine();
            if (c.equalsIgnoreCase("exit")){
                exit = false;
            }else{
                try{
                    ls.add(Integer.parseInt(c));
                }catch(NumberFormatException e){
                    System.out.println("Вы ввели не число, данные не верны! Для окончания ввода введите exit");
                    continue;
                }
            }
        }
        System.out.println("Введите номер eлемента который хотите вывести на экран (от 1 до " + ls.size() + ") ");
        boolean exeption = true;
        String i;
        while (exeption){
            try {
                i = sc.nextLine();
                exeption = false;
                System.out.println("В ячейке содержится число : " + ls.get(Integer.parseInt(i)-1));
            }catch(IndexOutOfBoundsException e){
                System.out.println("Введите число в пределе массива от 1 до " + ls.size());
                exeption = true;
            }catch (NumberFormatException e){
                System.out.println("Введите число: ");
                exeption = true;
            }

        }
    }
}
