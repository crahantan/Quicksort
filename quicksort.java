/*
Código para ordenamiento quicksort

*/ 


public class QuicksortInt{
    public static void main(String[] args){
        int[] values = {0,10,6,89,65,25,34,75,45};
        QuicksortInt o = new QuicksortInt();
        o.quickSort(values);
        for(int i = 0; i < values.length; i++){
            if(i < (values.length -1)){
                System.out.print(values[i] + ", ");
            }else{
                System.out.print(values[i]);
            }
        }       

    }

    //Método orden
    public void quickSort(int[] array){
        array = unionLogic(array);
    }

    //Método unión lógica
    public int[] unionLogic(int[] numbers){
        return logic(numbers,0,numbers.length - 1);
    }

    //Método lógica
    public int[] logic(int[] logicNumbers, int left, int right){
        if(left >= right){
            return logicNumbers;
        }
        int l = left;
        int r = right;

        if(left != right){
            int aux;
            int p;
            p = left;
            while(left != right){
                while(logicNumbers[left] < logicNumbers[p] && left < right){
                    left++;
                }
                while(logicNumbers[right] >= logicNumbers[p] && left < right){
                    right--;
                }
                if(right != left){
                    aux = logicNumbers[right];
                    logicNumbers[right] = logicNumbers[left];
                    logicNumbers[left] = aux;
                }
                if(left == right){
                    logic(logicNumbers,l,left - 1);
                    logic(logicNumbers,left + 1,r);
                }
            }
        }else{
            return logicNumbers;
        }
        return logicNumbers;
    }
}