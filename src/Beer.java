public class Beer {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = bottles;

        while(beerNum > 0) {

            if (beerNum == 1) {
                word = "bottle";  // Singular as in one bottle
            };

            System.out.println(beerNum + " " + word + " of beer on the wall" ) ;
            System.out.println(beerNum + " " + word + " of beer.");
                    System.out.println("Take one down. ") ;
                            System.out .println( "Pass it around. ") ;
            beerNum = beerNum - 1;

            // end else
            // end while loop
            if (beerNum > 0) System.out.println(beerNum + " " + word + " of beer on the wall. ");

        } // end main method
    } // end class
