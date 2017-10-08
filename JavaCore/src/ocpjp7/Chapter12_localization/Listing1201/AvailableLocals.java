package ocpjp7.Chapter12_localization.Listing1201;

/*ocpjp7*/




import java.util.*;

class AvailableLocales {
    public static void main(String[] args) {
        System.out.println("The default locale is: " + Locale.getDefault());
        Locale[] locales0 = Locale.getAvailableLocales();
        Set<MyLocale> locales = new TreeSet<>();
        for (Locale locale : locales0) {
            locales.add(new MyLocale(locale));
        }
        System.out.printf("No. of other available locales is: %d, and they are: %n", locales.size());
        for (MyLocale myLocale : locales) {
            System.out.printf("Locale code: %s and it stands for %s %n",
                    myLocale.locale, myLocale.locale.getDisplayName());
        }
    }

    private static class MyLocale implements Comparable {

        Locale locale;

        MyLocale(Locale locale) {
            this.locale = locale;
        }

        @Override
        public int compareTo(Object o) {
            MyLocale that = (MyLocale) o;
            return locale.toString().compareTo(that.locale.toString());
        }
    }
}
    