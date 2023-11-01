package Epam_ProgramPratice;

public class epamHomepage {

    public static final String homepageResources;
    public static String homepagelink="epam.com";

    static {
        homepageResources="Home page resources are Intialized";
        System.out.println(homepageResources);
    }
    public static void openpage(){
        System.out.println("open page"+homepagelink);
    }

}
