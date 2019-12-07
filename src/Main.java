public class Main {

    public static void main(String[] args) {
        parser(args);
        System.out.println("args: "+ args[0]);
        Graph g = new Graph(args[0]);

        System.out.println("Output #1: " + g.displayDistance("ABC"));
        System.out.println("Output #2: " + g.displayDistance("AD"));
        System.out.println("Output #3: " + g.displayDistance("ADC"));
        System.out.println("Output #4: " + g.displayDistance("AEBCD"));
        System.out.println("Output #5: " + g.displayDistance("AED"));
        System.out.println("Output #6: " + g.calculateTripsCount("C", "C", t -> t <= 3, 3));
        System.out.println("Output #7: " + g.calculateTripsCount("A", "C", t -> t == 4, 4));
        System.out.println("Output #8: " + g.calculateShortestPath("A", "C"));
        System.out.println("Output #9: " + g.calculateShortestPath("B", "B"));
        System.out.println("Output #10: " + g.calculateRoutesCount("C", "C", 30));
    }

    private static void parser(String... args){
        String sample = " Provide input same as (quotes is important): \"AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7\"";

        if(args.length != 1)
            throw new IllegalArgumentException("Wrong input length!" + sample);

        String arr[] = args[0].split(",");
        for(String s: arr){
            s = s.trim();

            if(s.length() < 3)
                throw new IllegalArgumentException("Wrong input context!" + sample);

            if(!s.substring(2).matches("-?\\d+"))
                throw new IllegalArgumentException("Wrong edge distance!" + sample);
        }
    }
}
