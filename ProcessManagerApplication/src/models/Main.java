package models;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /**test con ints**/
        List<Integer> nums =  new ArrayList<>();
        for(int i = 0; i< 5;i++){
            nums.add(i);
        }
        test(nums);
    }

    /**
     * Crea la lista de procesos en memoria a medida que va recibiendo un proceso de otro administrador
     * @param newProcess
     * @return memoryList
     */
    public static List<Process> createMemoryList(Process newProcess){
        List<Process> memoryList = new ArrayList<>();
        memoryList.add(newProcess);

        return memoryList;

    }

    /**
     * Metodo pone en funcionamiento First Come First Server
     * @param //Lista de procesos en memoria
     * @return proceso en cpu a medida que lo va atendiendo
     */
    public static List<Process>  runFCFS(List<Process> memoryList) {
        List<Process> cpuList = new ArrayList<>();
        List <Process> temp = new ArrayList<>();

        System.out.println("procesos en memoria: "+ memoryList);

        while (!memoryList.isEmpty()) {
            if (cpuList.isEmpty()) {
                cpuList.add(memoryList.get(0));
                temp = cpuList;
            } else {
                cpuList.set(0, memoryList.get(0));
                temp = cpuList;
            }
            memoryList.remove(0);
            System.out.println("memoria: " + memoryList);
            System.out.println("cpu: " + cpuList);

        }
        cpuList.remove(0);
        System.out.println("cpu: " + cpuList);
        temp = cpuList;

        return temp;

    }

    public static List<Integer>  test(List<Integer> memoryList) {
        List<Integer> cpuList = new ArrayList<>();
        List <Integer> temp = new ArrayList<>();

        System.out.println("procesos en memoria: "+ memoryList);

        while (!memoryList.isEmpty()) {
            if (cpuList.isEmpty()) {
                cpuList.add(memoryList.get(0));
                temp = cpuList;
            } else {
                cpuList.set(0, memoryList.get(0));
                temp = cpuList;
            }
            memoryList.remove(0);
            System.out.println("memoria: " + memoryList);
            System.out.println("cpu: " + cpuList);

        }
        cpuList.remove(0);
        System.out.println("cpu: " + cpuList);
        temp = cpuList;

        return temp;

    }

}
