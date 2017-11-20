public class StoppingStation {

    public int stopping_station(int a, int b){
        int num = 1, dem = 1, s = a;
        while (a != 1) {
            dem *= a;
            a--;
        }
        int t = b - s + 1;
        while (t != (b - 2 * s + 1)) {
            num *= t;
            t--;
        }
        if ((b - s + 1) >= s){
           System.out.println(""+ num / dem);
           return num / dem;
        }
        return 0;
    }
}
