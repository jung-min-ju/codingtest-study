import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> boss = new HashMap<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int good[] = new int[n+1];
        st=new StringTokenizer(br.readLine());

        for(int i=1; i<=n; i++) {
            int number = Integer.parseInt(st.nextToken());
            boss.put(i, number);
        }

        for(int i=0; i<m;i++) {
            st = new StringTokenizer(br.readLine());
            int staff = Integer.parseInt(st.nextToken());
            int goodValue = Integer.parseInt(st.nextToken());

            good[staff] += goodValue;
        }

        for(int i=2; i<=n; i++) {
            good[i] += good[boss.get(i)];
        }

        for(int i=1; i<=n; i++) {
            System.out.print(good[i]+" ");
        }

    }
}