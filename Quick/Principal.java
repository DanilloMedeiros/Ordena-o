package Quick;

public class Principal {
    
    public static void main(String[] args){
        
        int[] vet = {15,35,35,15,3,3,2,9,7,5};
        //int[] vet;
        int[] vetf;
        
        //String path = "C:\\Users\\Administrador\\Desktop\\instancias-num\\num.1000.1.in";
        //LerArq arq = new LerArq();
        //vet = arq.ler(path);
        
        QuickSort q = new QuickSort();
        
        vetf = q.quickSort(vet,0,vet.length-1);
        
        for(int i=0;i<vetf.length;i++){
            
            System.out.println(vetf[i]);
            
        }
        
    }
}
