public class EntendendoBubbleSort {
  
  public static void main(String[] agrs) {
    int[] vetor = {25, 57, 48, 37, 12, 92 , 86, 33};
    for(int i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i] + " ");
    }
    System.out.println("\n");
    // Bubble Sort
    vetor = Bubble(vetor);
    for(int i = 0; i < vetor.length; i++){
      System.out.print(vetor[i] + " ");
    }

    
    System.exit(0);
  }

  public static int[] Bubble (int[] array) {
    int n = array.length;
    int aux;

    for(int i = 0; i < n-1; i++) {
      for(int j = 0; j < n-i-1; j++) {
        if (array[j] > array[j+1]) {
          aux = array[j];
          array[j] = array[j+1];
          array[j+1] = aux;
        }
      }
    }

    return array;
  }
}
