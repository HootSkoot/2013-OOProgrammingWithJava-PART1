public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    public int differenceInYears(MyDate comparedDate){
        int differenceYears = 0;
        if ( comparedDate.earlier(this)) {
            differenceYears = year - comparedDate.year;
            if ( month < comparedDate.month) {
                differenceYears--;
            }
            if ( month == comparedDate.month && day < comparedDate.day) {
                differenceYears--;
            }
            return differenceYears;
        } else {
            differenceYears = comparedDate.year - year;
            if ( comparedDate.month < month ) {
                differenceYears--;
            }
            if ( comparedDate.month == month && comparedDate.day < day) {
                differenceYears--;
            }
            return differenceYears;
        }
    }

}
