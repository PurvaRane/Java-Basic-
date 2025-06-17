
//URLclass1.java
// Java program to demonstrate working of URL
import java.net.MalformedURLException;
import java.net.URL;

class URLclass1 {
    public static void main(String[] args)
            throws MalformedURLException { // creates a URL with string representation.
        URL url1 = new URL("https://www.google.co.in/?gfe_rd=cr&ei=ptYq" + "K26I4fT8gfth6CACg#q=geeks+for+geeks+java");
        // creates a URL with a protocol,hostname,and path
        URL url2 = new URL("http", "www.geeksforgeeks.org", "/jvm-works-jvm-architecture/");
        URL url3 = new URL(
                "https://www.google.co.in/search?" + "q=gnu&rlz=1C1CHZL_enIN71" + "4IN715&oq=gnu&aqs=chrome..69i57j6"
                        + "9i60l5.653j0j7&sourceid=chrome&ie=UTF" + "-8#q=geeks+for+geeks+java");
        // URL url3 = new URL("https://www.google.com/search?"+
        // q=what+is+geeksforgeeks&oq=wh&aqs=chrom
        // e.0.69i59j0i131i433j69i59j69i57j0j69i61
        // l2j69i60.3696j0j7&sourceid=chrome&ie=UT F-8")
        // URL url3 = new URL("https://www.google.com/search?q=io
        // pelonere&oq=iopelonere&aqs=chrome..69i5
        // 7j46i175i199j69i60.5359j0j9&sourceid=chrome&ie=UTF-8");
        // URL url3 = new URL("http://www.VIT.edu/schedule/timeTable.html");

        // print the stringrepresentation of the URL.
        System.out.println(url1.toString());
        System.out.println(url2.toString());
        System.out.println();
        System.out.println("Different components of the URL3-");
        // retrieve the protocol for the URL
        System.out.println("Protocol:- " + url3.getProtocol());
        // retrieve the hostname of theurl
        System.out.println("Hostname:-" + url3.getHost());
        // retrieve the defalut port
        System.out.println("Default port:- " + url3.getDefaultPort());
        // retrieve the query part of URL
        System.out.println("Query:- " + url3.getQuery());
        // retrive the path of URL
        System.out.println("Path:- " + url3.getPath());
        // retrive the file name
        System.out.println("File:- " + url3.getFile());
        // retrieve the reference
        System.out.println("Reference:-" + url3.getRef());
    } // end of main()
} // end of class URLclass1