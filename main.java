import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws IOException {
        int size,prom,x;
        BufferedReader reader =              //reader - это перем
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите длинну массива: ");
        //System.out.println();
        BufferedReader size_ar =              //size_ar - это перем
                new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(size_ar.readLine());
        System.out.println("Введите массив: ");
       // System.out.println();

        int arr[]=new int[size];
        int arr_2[]=new int[size];
        for (int i=0;i<size;i++)
        {

            arr[i] = Integer.parseInt(reader.readLine());
            arr_2[i]=arr[i];
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Исходный массив: "+Arrays.toString(arr));
        System.out.println("--------------------------------------------------------------");
        //int size1 = size;
        for (int i=0; i<=size; i++) {
            for (int j=0;j<size-1;j++)
            {
            if (arr[j] > arr[j+1]) {
                prom = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = prom;
                //System.out.print("+");
            }
        }
            }
//
        System.out.println("--------------------------------------------------------------");
        System.out.println("Сортировка пузырьком: "+Arrays.toString(arr));
        System.out.println("--------------------------------------------------------------");

        for (int i=0; i<=size; i++) {
            for (int j=0;j<size-1;j++)
            {
                if (arr[j] > arr[j+1]) {
                    prom = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = prom;
                    //System.out.print("+");
                }
            }
        }

        System.out.println("Введите искомое число: ");
        BufferedReader element =              //el - это перем
                new BufferedReader(new InputStreamReader(System.in));
        int el = Integer.parseInt(element.readLine());
        for (int i=0;i<size;i++)
        {
            if (arr[i]==el)
            {
                System.out.println("Число: "+el+" - найдено. "+"Его идекс: "+i);
                break;
            }

                 if ((arr[i]<el)&&(arr[i+1]>el)) {
                    //int j=i+1;
                    System.out.println("Число не найденно. Его можно добавить в массив, под номером: " + i + " Чтобы не нарушать посл.");
                    System.out.println("Напоминаю, что индекс массива начинается с 0. Первый элемент имеет номер 0. Второй 1 и соотв.");
                break;
                }
                 if (arr[0]>el) {
                    System.out.println("Число не найденно. Его можно добавить в массив, под номером: 0");
                    System.out.println("Напоминаю, что индекс массива начинается с 0. Первый элемент имеет номер 0. Второй 1 и соотв.");
                break;
                }
                 if (arr[size-1]<el);
                {
                    System.out.println("Число не найденно. Его можно добавить в массив, под номером:" + size);
                    System.out.println("Напоминаю, что индекс массива начинается с 0. Первый элемент имеет номер 0. Второй 1 и соотв.");
                    break;
                }
                }


        }
        /*System.out.println("--------------------------------------------------------------");
        System.out.println("Сортировка вставками: "+Arrays.toString(arr_2));
        System.out.println("--------------------------------------------------------------");*/




}
