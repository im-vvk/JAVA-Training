public class toStringTuna2 {
        private int day;
        private int month;
        private int year;

        public toStringTuna2(int d,int m,int y)
        {
            day=d;
            month=m;
            year=y;

            System.out.printf("The constructor for this is %s\n",this);
        }
        //this needs a string so it looks for here
        public String toString()
        {return String.format("%02d/%02d/%04d",day,month,year);}

}
