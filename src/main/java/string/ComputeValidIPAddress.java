package string;


import java.util.stream.Stream;

//http://elementsofprogramminginterviews.com/solutions/java/ValidIPAddress.java
public class ComputeValidIPAddress {


    public void validateIPAddress(String ip) {
        Stream.of(ip.split("."))
                .filter(r -> r.length()>3 &&!r.startsWith("0"));



    }
}
