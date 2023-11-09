public class tab {
    public static void main(String[] args) {
        /* Teste nbOccAux */
        int []t = {1,2,6,8,7,7,7,7,3,-2,1};

        System.out.println(nbOccAux(7,t,0)); // 4
        System.out.println(nbOccAux(-22,t,0)); // 0
        System.out.println(nbOccAux(7,t,5)); // 3
    }

    // Cas de base
    public static int nbOccAux(int x, int [] t, int i) {
        if (i == t.length - 1) {
            if (t[i] == x)
                return 1;
            else
                return 0;
        }

        else {
            int tmp = nbOccAux(x, t, i+1);
            if (t[i] == x) {
                return 1 + tmp;
            } else {
                return tmp;
            }
        }
    }
}
