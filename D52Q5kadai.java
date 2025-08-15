public class D52Q5kadai {
    public static void main(String[] args) {
        String majors = "+----";
        final int LIMIT = 400;

        if (args.length == 0) return;

        int max = 0;
        int[] data = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            int value = Integer.parseInt(args[i]);
            if (value <= 0 || value >= LIMIT) return;
            data[i] = value;
            if (max < value) {
                max = value;
            }
        }

        int majormax = (max - 1) / 10 + 1;

        System.out.print("    ");
        for (int i = 0; i < majormax; i++) {
            System.out.print(majors.charAt(i % majors.length()));
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%4d : ", data[i]);
            int n = (data[i] - 1) / 10 + 1;
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
