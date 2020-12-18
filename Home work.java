
        for ( int x = 100; x <= 1000; x+= 100) {
            System.out.println(x);
        }


        for ( int x = 5; x >= -10 ; x-= 5) {
            System.out.println(x);
        }


        for ( int x = 1; x <= 2048 ; x*=2) {
            System.out.println(x);
        }


       Random r = new Random();
       int random_num = r.nextInt(3) +1;
           switch (random_num) {
           case 1:
             System.out.println( " ehad");
             break;
           case 2:
              System.out.println( " shtaim");
               break;
           case 3:
              System.out.println( "shalosh");
              break;   
         }
